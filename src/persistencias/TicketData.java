package persistencias;

import entidades.Comprador;
import entidades.DetalleTicket;
import entidades.TicketCompra;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

public class TicketData {

    private final Connection con;
    private final DetalleTicketData detalleData;
    private final LugarData lugarData;

    public TicketData() {
        this.con = Conexion.buscarConexion();
        detalleData = new DetalleTicketData();
        lugarData = new LugarData();
    }

    public boolean generarTicket(TicketCompra ticket) {
        return false;
    }

    public boolean modificarTicket(TicketCompra ticket) {
        return false;
    }

    public boolean anularTicket(int idTicket) {
        return false;
    }

    public TicketCompra buscarTicketPorId(int idTicket) {
        TicketCompra ticket = null;

        String sql = "SELECT t.*, c.nombre, c.fechaNac, c.medioPago "
                + "FROM ticketcompra t "
                + "JOIN comprador c"
                + "ON t.dniComprador = c.dni"
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

    public List<TicketCompra> listarTicketsPorFecha(LocalDate desde, LocalDate hasta) {
    }

    public List<TicketCompra> listarTicketPorPelicula(int idPelicula) {
    }

}
