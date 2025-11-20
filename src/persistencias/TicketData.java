package persistencias;

import entidades.Comprador;
import entidades.DetalleTicket;
import entidades.TicketCompra;
import entidades.LugarAsiento;
import entidades.Proyeccion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.mariadb.jdbc.Statement;


public class TicketData {

    private final Connection con;
    private final DetalleTicketData detalleData;
    private final LugarData lugarData;

    public TicketData() {
        this.con = Conexion.buscarConexion();
        this.detalleData = new DetalleTicketData();
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

        String sql = "UPDATE ticketcompra SET fechaFuncion = ?, monto = ?, tipoCompra = ? "
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
                            lugarData.eliminarLugar(lugar.getIdLugar());
                        }
                    }
                    detalleData.borrarDetalleTicketPorId(det.getIdDetalle());
                }
            }else {
                return false;
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
    
    public boolean anularTicket2(int idTicket) {
        // Obtenemos detalle para poder liberar
        try {
            TicketCompra ticket = buscarTicketPorId(idTicket);

            if (ticket != null && ticket.getDetalles() != null) {
                for (DetalleTicket det : ticket.getDetalles()) {
                    if (det.getLugares() != null) {
                        int proy = det.getProyeccion().getIdProyeccion();
                        detalleData.borrarDetalleTicketPorId(det.getIdDetalle());
                        lugarData.eliminarLugarPorProyeccion(proy);
                    }
//                    detalleData.borrarDetalleTicketPorId(det.getIdDetalle());
                }
            }else {
                return false;
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

        String sql = "SELECT t.*, c.nombre, c.fechaNac, c.medioPago, c.dni "
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
                comprador.setFechaNacimiento(rs.getDate("fechaNac").toLocalDate());

                ticket = new TicketCompra();
                ticket.setIdTicket(rs.getInt("idTicket"));
                ticket.setFechaCompra(rs.getTimestamp("fechaCompra").toLocalDateTime());
                ticket.setFechaFuncion(rs.getDate("fechaFuncion").toLocalDate());
                ticket.setMonto(rs.getDouble("monto"));
                ticket.setComprador(comprador);
                ticket.setTipoCompra(rs.getString("tipoCompra"));
                ticket.setCodigoVenta(rs.getString("codigoVenta"));

                //Cargar detalles
                List<DetalleTicket> detalles = detalleData.buscarDetallePorComprador(comprador.getDniComprador());
                ticket.setDetalles(detalles);

                ps.close();

            }
        } catch (SQLException e) {
            System.out.println("Error al buscar ticket: " + e.getMessage());
        }

        return ticket;
    }

    public List<TicketCompra> listarTicketsPorFecha(LocalDate desde, LocalDate hasta) {
        List<TicketCompra> tickets = new ArrayList<>();

        String sql = "SELECT idTicket "
                + "FROM ticketcompra "
                + "WHERE fechaCompra BETWEEN ? AND ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(desde));
            ps.setDate(2, Date.valueOf(hasta));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                TicketCompra ticket = buscarTicketPorId(rs.getInt("idTicket"));

                if (ticket != null) {
                    tickets.add(ticket);
                }
            }

            ps.close();

        } catch (SQLException e) {
            System.out.println("Error al listar ticket por fecha: " + e.getMessage());
        }

        return tickets;
    }

    public List<TicketCompra> listarTicketPorPelicula(int idPelicula) {
        List<TicketCompra> tickets = new ArrayList<>();

        String sql = "SELECT DISTINCT dt.idTicket "
                + "FROM detalleticket dt "
                + "JOIN proyeccion p "
                + "ON dt.idProyeccion = p.idProyeccion "
                + "WHERE p.idPelicula = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPelicula);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                TicketCompra ticket = buscarTicketPorId(rs.getInt("idTicket"));

                if (ticket != null) {
                    tickets.add(ticket);
                }
            }

            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al listar ticket por pelicula: " + e.getMessage());
        }

        return tickets;
    }
    
    public List<TicketCompra> listarTicketsPorFechaAsistida(LocalDate fechaFuncion) {
        List<TicketCompra> tickets = new ArrayList<>();

        String sql = "SELECT idTicket "
                + "FROM ticketcompra "
                + "WHERE fechaFuncion = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaFuncion));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                TicketCompra ticket = buscarTicketPorId(rs.getInt("idTicket"));

                if (ticket != null) {
                    tickets.add(ticket);
                }
            }

            ps.close();

        } catch (SQLException e) {
            System.out.println("Error al listar ticket por fecha: " + e.getMessage());
        }

        return tickets;
    }
    
    public List<TicketCompra> listarTicketsPorDni(int dniComprador){
        List<TicketCompra> tickets = new ArrayList();
        String query = "SELECT * FROM ticketcompra WHERE dniComprador = ?;";
        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dniComprador);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                TicketCompra ticket = new TicketCompra();
                ticket.setIdTicket(rs.getInt("idTicket"));
                ticket.setFechaCompra(rs.getTimestamp("fechaCompra").toLocalDateTime());
                ticket.setFechaFuncion(rs.getDate("fechafuncion").toLocalDate());
                ticket.setMonto(rs.getDouble("monto"));
                
                Comprador comprador = new Comprador();
                comprador.setDniComprador(rs.getInt("dniComprador"));
                ticket.setComprador(comprador);
                
                ticket.setTipoCompra(rs.getString("tipoCompra"));
                ticket.setCodigoVenta(rs.getString("codigoVenta"));
                tickets.add(ticket);
            }
        }catch(SQLException e){
            System.out.println("No se pudo encontrar el ticket, revise el dni ingresado");
        }
        return tickets;
    }
}
