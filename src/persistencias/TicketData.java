package persistencias;

import entidades.Comprador;
import entidades.DetalleTicket;
import entidades.TicketCompra;
import entidades.LugarAsiento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;

public class TicketData {

    private final Connection con;
    private final DetalleTicketData detalleData;
    private final LugarData lugarData;

    public TicketData() {
        this.con = Conexion.buscarConexion();
        this.detalleData = new DetalleTicketData(con);
        this.lugarData = new LugarData();
    }

    public boolean generarTicket(TicketCompra ticket) {
        String sql = "INSERT INTO ticketcompra (fechaCompra, fechaFuncion, monto, dniComprador, tipoCompra, codigoVenta) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setTimestamp(1, Timestamp.valueOf(ticket.getFechaCompra()));
            ps.setDate(2, Date.valueOf(ticket.getFechaFuncion()));
            ps.setDouble(3, ticket.getMonto());
            ps.setLong(4, ticket.getComprador().getDniComprador());
            ps.setString(5, ticket.getTipoCompra());
            ps.setString(6, ticket.getCodigoVenta());

            int filas = ps.executeUpdate();

            if (filas > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    ticket.setIdTicket(rs.getInt(1));

                    //Guardamos los detalles asociados
                    if (ticket.getDetalles() != null && !ticket.getDetalles().isEmpty()) {
                        for (DetalleTicket det : ticket.getDetalles()) {
                            det.setTicket(ticket);
                            detalleData.registrarDetalleTicket(det);

                            // Marcar el asientos como ocupados
                            if (det.getLugares() != null) {
                                for (LugarAsiento lugar : det.getLugares()) {
                                    lugarData.ocuparLugar(lugar.getIdLugar());
                                }
                            }
                        }
                    }
                }
            }
            ps.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al generar ticket: " + e.getMessage());
            return false;
        }
    }

    public boolean modificarTicket(TicketCompra ticket) {

        String sql = "UPTADATE ticketcompra SET fechaFuncion = ?, monto = ?, tipoCompra = ? "
                + "WHERE idTicket = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(ticket.getFechaFuncion()));
            ps.setDouble(2, ticket.getMonto());
            ps.setString(3, ticket.getTipoCompra());
            ps.setInt(4, ticket.getIdTicket());

            ps.executeUpdate();
            ps.close();

            // Actualizar detalle de ticket
            if (ticket.getDetalles() != null) {
                for (DetalleTicket det : ticket.getDetalles()) {
                    detalleData.actualizarDetaleTicket(det, null); // si no se cambian asientos
                }
            }

            return true;

        } catch (SQLException e) {
            System.out.println("Error al modificar ticket: " + e.getMessage());
            return false;
        }
    }

    public boolean anularTicket(int idTicket) {

        // Obtenemos detalle para poder liberar
        try {
            TicketCompra ticket = buscarTicketPorId(idTicket);

            if (ticket != null && ticket.getDetalles() != null) {
                for (DetalleTicket det : ticket.getDetalles()) {
                    if (det.getLugares() != null) {
                        for (LugarAsiento lugar : det.getLugares()) {
                            lugarData.liberarLugar(lugar.getIdLugar());
                        }
                    }
                    detalleData.borrarDetalleTicket(det.getIdDetalle(), null);
                }
            }

            //Borramos el ticket
            String sql = "DELETE "
                    + "FROM ticketcompra "
                    + "WHERE idTicket = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTicket);
            ps.executeUpdate();
            ps.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al anular ticket: " + e.getMessage());
            return false;
        }
    }

    public TicketCompra buscarTicketPorId(int idTicket) {
        TicketCompra ticket = null;

        String sql = "SELECT t.*, c.nombre, c.fechaNac, c.medioPago "
                + "FROM ticketcompra t "
                + "JOIN comprador c "
                + "ON t.dniComprador = c.dni "
                + "WHERE t.idTicket = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTicket);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Comprador comprador = new Comprador();
                comprador.setDniComprador(rs.getLong("dni"));
                comprador.setNombre(rs.getString("nombre"));
                comprador.setMedioDePago(rs.getString("medioPago"));

                ticket = new TicketCompra();
                ticket.setIdTicket(rs.getInt("idTicket"));
                ticket.setFechaCompra(rs.getTimestamp("fechaCompra").toLocalDateTime());
                ticket.setFechaFuncion(rs.getDate("fechaFuncion").toLocalDate());
                ticket.setMonto(rs.getDouble("monto"));
                ticket.setComprador(comprador);
                ticket.setTipoCompra(rs.getString("tipoCompra"));
                ticket.setCodigoVenta(rs.getString("codigoVenta"));

            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar ticket: " + ex.getMessage());
        }

        return ticket;
    }

//    public List<TicketCompra> listarTicketsPorFecha(LocalDate desde, LocalDate hasta) {
//    }
//
//    public List<TicketCompra> listarTicketPorPelicula(int idPelicula) {
//    }
}
