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
}
