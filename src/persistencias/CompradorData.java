package persistencias;

import entidades.Comprador;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CompradorData {
    private Comprador comprador;
    
    public CompradorData(Connection con) {
    }
    Connection conex = Conexion.buscarConexion();
    public boolean RegistrarComprador(Comprador com) {
        String query = "INSERT INTO comprador (dni, nombre, fechaNac, password, medioPago) VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conex.prepareStatement(query);
            ps.setInt(1, com.getDniComprador());
            ps.setString(2, com.getNombre());
            ps.setDate(3, Date.valueOf(com.getFechaNacimiento()));
            ps.setString(4, com.getPassword());
            ps.setString(5, com.getMedioDePago());
            ps.executeUpdate();

            ps.close();
            System.out.println("Guardado");
            return true;
        } catch (SQLException e) {
            System.out.println("No se pudo insertar al alumno");
            return false;
        }

    }
    
    public Comprador buscarComprador(int dniComprador) {
        Comprador comprador = null;
        String query = "SELECT * FROM comprador WHERE dni = ?";
        try{
            PreparedStatement ps = conex.prepareStatement(query);
            ps.setInt(1, dniComprador);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                comprador = new Comprador();
                comprador.setDniComprador(rs.getInt("dni"));
                comprador.setNombre(rs.getString("nombre"));
                comprador.setFechaNacimiento(rs.getDate("fechaNac").toLocalDate());
                comprador.setPassword(rs.getString("password"));
                comprador.setMedioDePago(rs.getString("medioPago"));
            }
            ps.close();
        }catch(SQLException e) {
            System.out.println("No se pudo encontrar al comprador");
            e.getMessage();
        }        
        return comprador;
    }
    
    public void actualizarComprador(Comprador comprador){
        String query = "UPDATE comprador SET nombre = ?, fechaNac = ?, password = ?, medioPago = ? WHERE dni = ?";
        try {
            PreparedStatement ps = conex.prepareStatement(query);
//            ps.setInt(1, comprador.getDniComprador());
            ps.setString(1, comprador.getNombre());
            ps.setDate(2,  Date.valueOf(comprador.getFechaNacimiento()));
            ps.setString(3, comprador.getPassword());
            ps.setString(4, comprador.getMedioDePago());
            ps.setInt(5, comprador.getDniComprador());
            ps.executeUpdate();
//            int exito = ps.executeUpdate();
//            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, "Alumno modificado");
//            }
            System.out.println("Comprador actualizado");
        }catch(SQLException e) {
            System.out.println("Error no se pudo actualizar al comprador");
            e.getMessage();
        }
    }
    
    public void bajaFisica(int dni) {
        String query = "DELETE FROM comprador WHERE dni = ?";
        try {
            PreparedStatement ps = conex.prepareStatement(query);
            ps.setInt(1, dni);
            ps.executeUpdate();
            System.out.println("Comprador borrado");
        }catch(SQLException e) {
            System.out.println("No se pudo borrar al comprador, revise los datos");
            e.getMessage();
        }    
    }
    
}
