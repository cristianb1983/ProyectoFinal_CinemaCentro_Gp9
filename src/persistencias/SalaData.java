package persistencias;

import entidades.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SalaData {
    private Sala sala;

    public SalaData() {
    }
    
    

    public SalaData(Conexion con) {
    }
    
    Connection conex = Conexion.buscarConexion();
    
    public boolean crearSala(Sala s){
        String query = "INSERT INTO sala (nroSala, apta3D, capacidad, estado) VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement ps = conex.prepareStatement(query);
            ps.setInt(1, s.getNroSala());
            ps.setBoolean(2, s.isApta3D());
            ps.setInt(3, s.getCapacidad());
            ps.setBoolean(4, s.isEstado());
            ps.executeUpdate();

            ps.close();
            System.out.println("Sala guardada");
            return true;
        }catch (SQLException e) {
            System.out.println("No se pudo insertar la sala");
            return false; 
    }
  
}
    public Sala buscarSala(int nroSala){
        Sala sala = null;
        
        String query = "SELECT * FROM sala WHERE nroSala = ?";
        try{
            PreparedStatement ps = conex.prepareStatement(query);
            ps.setInt(1, nroSala);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                sala = new Sala();
                sala.setIdSala(rs.getInt("idSala"));
                sala.setNroSala(rs.getInt("nroSala"));
                sala.setApta3D(rs.getBoolean("apta3D"));
                sala.setCapacidad(rs.getInt("capacidad"));
                sala.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        }catch(SQLException e) {
            System.out.println("No se pudo encontrar la sala");
            e.getMessage();
        }        
        return sala;
    }
    
    public void actualizarSala(Sala sala){
         String query = "UPDATE sala SET nroSala = ?, apta3D = ?, capacidad = ?, estado = ? WHERE nroSala = ?";
        try {
            PreparedStatement ps = conex.prepareStatement(query);
            ps.setInt(1, sala.getNroSala());
            ps.setBoolean(2, sala.isApta3D());
            ps.setInt(3, sala.getCapacidad());
            ps.setBoolean(4, sala.isEstado());
            ps.executeUpdate();
            
            System.out.println("Sala actualizada");
        }catch(SQLException e) {
            System.out.println("Error no se pudo actualizar la sala");
            e.getMessage();
        }
    }
    
    public void bajaFisicaSala(int numSala){
        String query = "DELETE FROM sala WHERE nroSala = ?";
        try {
            PreparedStatement ps = conex.prepareStatement(query);
            ps.setInt(1, numSala);
            ps.executeUpdate();
            System.out.println("Sala borrada");
        }catch(SQLException e) {
            System.out.println("No se pudo borrar la sala, revise los datos");
            e.getMessage();
        }
    }
    
    public List<Sala> listadoSalas(){
        List<Sala> listaSalas = new ArrayList<>();
        try {
            String query = "SELECT * FROM sala";
            PreparedStatement ps = conex.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sala = new Sala();
                sala.setIdSala(rs.getInt("idSala"));
                sala.setNroSala(rs.getInt("nroSala"));
                sala.setApta3D(rs.getBoolean("apta3D"));
                sala.setCapacidad(rs.getInt("capacidad"));
                sala.setEstado(rs.getBoolean("estado"));
                listaSalas.add(sala);
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al listar las salas");
            e.getMessage();
        }
        return listaSalas;
    }
}