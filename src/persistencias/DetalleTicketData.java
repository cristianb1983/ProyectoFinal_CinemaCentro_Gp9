package persistencias;

import entidades.DetalleTicket;
import entidades.LugarAsiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

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

            //El metodo registrarLugarAsiento debe
            //retornar la clave primaria
            String queryLugares = "INSERT INTO lugar_detalleticket(lugarId, detalleId) VALUES(?, ?)";
            PreparedStatement psLugares = conex.prepareStatement(queryLugares);
            for (LugarAsiento aux : detalle.getLugares()) {
                //recorre lo que hay en la lista de Lugares de detalleTicket y va impactando contra la bd
                psLugares.setInt(1, aux.getIdLugar());
                psLugares.setInt(2, detalle.getIdDetalle());
                psLugares.executeUpdate();
            }
            psLugares.close();

            return true;
       }catch(SQLException e) {
           System.out.println("No se pudo registrar el detalleTikcet:");
           System.out.println(e.getMessage());
           return false;
       }
    }
    
    public void actualizarDetaleTicket(DetalleTicket detalle, List<Integer> Idlugares){
        String query = "UPDATE detalleticket SET idTicket = ?, idProyeccion = ?, cantidad = ?, subTotal = ? where idDetalle = ?";
        try {
            //El prepare es quien enviara con la conec la query
            PreparedStatement ps = conex .prepareStatement(query);
            //Remplaso los comodines y ejecuto y actualizo
            ps.setInt(1, detalle.getIdTicket().getIdTicket());
            ps.setInt(2, detalle.getIdProyeccion().getIdProyeccion());
            ps.setInt(3, detalle.getCantidad());
            ps.setDouble(4, detalle.getSubtotal());
            ps.setInt(5, detalle.getIdDetalle());
            ps.executeUpdate();
            ps.close();
            
            String queryLugares = "UPDATE lugar_detalleticket SET lugarId = ?, detalleId = ? where lugaresId = ?";
            PreparedStatement psLugares = conex.prepareStatement(queryLugares);
            for (int i = 0; i < detalle.getLugares().size(); i++) {
               LugarAsiento aux = detalle.getLugares().get(i);
               int idLugarDetalle = Idlugares.get(i); // va asignando los id pasados por parametro

               psLugares.setInt(1, aux.getIdLugar());
               psLugares.setInt(2, detalle.getIdDetalle());
               psLugares.setInt(3, idLugarDetalle);
               psLugares.executeUpdate();
           }
            psLugares.close();
            System.out.println("DetalleTicket actualizado");
       }catch(SQLException e){
           System.out.println("No se pudo actualizar");
            System.out.println(e.getMessage());
       }
    }
     
      
    public void borrarDetalleTicket(int idDetalleBorrar, List<Integer> idLugaresBorrar){
        String query = "DELETE FROM detalleticket WHERE idDetalle = ?";
        String queryLugares = "DELETE FROM lugar_detalleticket WHERE lugaresId = ?";
        try {
            PreparedStatement psLugares = conex.prepareStatement(queryLugares);
            for(Integer aux : idLugaresBorrar){
                psLugares.setInt(1, aux);
                psLugares.executeUpdate();
            }
            psLugares.close();
            
            PreparedStatement ps = conex.prepareStatement(query);
            ps.setInt(1, idDetalleBorrar);
            ps.executeUpdate();
            ps.close();
        }catch(SQLException e) {
            System.out.println("No se pudo borrar el DetalleTicket, compuebe el id");
            System.out.println(e.getMessage());
        }
    }
}
