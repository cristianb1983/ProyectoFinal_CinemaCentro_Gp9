package persistencias;

import com.sun.org.apache.bcel.internal.Constants;
import entidades.TicketCompra;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TicketData {

    private Connection con;

    public TicketData() {
        this.con = Conexion.buscarConexion();
    }

    public void guardarTicket(TicketCompra ticket) {
        String sql = "INSERT INTO ticketcompra (fechaCompra, fechaFuncion, monto, dniComprador, tipoCompra, codigoVenta) VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setTimestamp(1, Timestamp.valueOf(ticket.getFechaCompra()));
            ps.setDate(2, Date.valueOf(ticket.getFechaFuncion()));
            ps.setDouble(3, ticket.getMonto());
            ps.setLong(4, ticket.getComprador().getDniComprador());
            ps.setString(5, ticket.getTipoCompra());
            ps.setString(6, ticket.getCodigoVenta());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                ticket.setIdTicket(rs.getInt(1));
            }

            System.out.println("Ticket guardado correctamente.");

        } catch (SQLException ex) {
            System.out.println("Error al guardar ticket: " + ex.getMessage());
        }

    }

}
