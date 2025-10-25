package persistencias;

import entidades.DetalleTicket;
import entidades.LugarAsiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DetalleTicketData {
    Connection conex = Conexion.buscarConexion();
    
    public boolean registrarDetalleTicket(DetalleTicket detalle) {
       String query = "INSERT INTO detalleticket(idTicket, idProyeccion, cantidad, subTotal) VALUES(?, ?, ?, ?)";
       try {
        PreparedStatement ps = conex.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, detalle.getIdTicket().getIdTicket());
        ps.setInt(2, detalle.getIdProyeccion().getIdProyeccion());
        ps.setInt(3, detalle.getCantidad());
        ps.setDouble(4, detalle.getSubtotal());
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        if(rs.next()) {
            detalle.setIdDetalle(rs.getInt(1));
        }else {
            System.out.println("No se pudo obtener el idDetalle");
        }
        ps.close();
        System.out.println("DetalleTicket guardado");
        
        String queryLugares = "INSERT INTO lugar_detalleticket(lugarId, detalleId) VALUES(?, ?)";
        PreparedStatement psLugares = conex.prepareStatement(queryLugares);
           for (LugarAsiento aux : detalle.getLugares()) {
               psLugares.setInt(1, aux.getIdLugar());
               psLugares.setInt(2, detalle.getIdDetalle());
               psLugares.executeUpdate();
           }
        psLugares.close();
        
        return true;
       }catch(SQLException e) {
           System.out.println("No se pudo registrar al comprador ):");
           return false;
       }
    }
}
