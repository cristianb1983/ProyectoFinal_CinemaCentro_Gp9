/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencias;

import entidades.Proyeccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author julia
 */
public class ProyeccionData {
    private Proyeccion proyeccion;

    public ProyeccionData(Conexion con) {
    }
    
    Connection con = Conexion.buscarConexion();
    
        public boolean crearProyeccion(Proyeccion p){
        String query = "INSERT INTO proyeccion (idPelicula, idSala, idioma, es3D, subtitulada, horaInicio, horaFin, precioLugar) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, p.getIdPelicula());
            ps.setInt(2, p.getIdSala());
            ps.setString(3, p.getIdioma());
            ps.setBoolean(4, p.isEs3D());
            ps.setBoolean(5, p.isSubtitulada());
            ps.setTime(6, Time.valueOf(p.getHoraInicio()));
            ps.setTime(7, Time.valueOf(p.getHoraFin()));
            ps.setDouble(8, p.getPrecio());
            
            ps.executeUpdate();

            ps.close();
            System.out.println("Proyeccion guardada.");
            return true;
        }catch (SQLException e) {
            System.out.println("No se pudo actualizar la proyeccion. Verificar.");
            return false; 
        }
        }
        
        public void actualizarProyeccion(Proyeccion p){
        String query = "UPDATE proyeccion SET idPelicula = ?, idSala = ?, idioma = ?, es3D = ?, subtitulada = ?, horaInicio = ?, horaFin = ?, precioLugar = ?";
         
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, p.getIdPelicula());
            ps.setInt(2, p.getIdSala());
            ps.setString(3, p.getIdioma());
            ps.setBoolean(4, p.isEs3D());
            ps.setBoolean(5, p.isSubtitulada());
            ps.setTime(6, Time.valueOf(p.getHoraInicio()));
            ps.setTime(7, Time.valueOf(p.getHoraFin()));
            ps.setDouble(8, p.getPrecio());
            
            ps.executeUpdate();
            
            System.out.println("Proyeccion actualizada.");
        }catch(SQLException e) {
            System.out.println("No se pudo actualizar la proyeccion. Verificar.");
            e.getMessage();
        }
    }
        
        public void borrarProyeccion(int idProyeccion){
        String query = "DELETE FROM proyeccion WHERE idProyeccion = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idProyeccion);
            
            ps.executeUpdate();
            
            System.out.println("Proyeccion eliminada.");
        }catch(SQLException e) {
            System.out.println("No se pudo borrar la proyeccion. Verificar.");
            e.getMessage();
        }    
    }
        
    public Proyeccion buscarProyeccion(int idProyeccion) {
        Proyeccion p = null;
        
        String query = "SELECT * FROM proyeccion WHERE idProyeccion = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idProyeccion);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p = new Proyeccion();
                p.setPelicula(rs.getInt("idPelicula"));
                p.setSala(rs.getInt("idSala"));
                p.setIdioma(rs.getString("Idioma"));
                p.setEs3D(rs.getBoolean("Es3D"));
                p.setSubtitulada(rs.getBoolean("Subtitulada"));
                p.setHoraInicio(rs.getTime("HoraInicio").toLocalTime());
                p.setHoraFin(rs.getTime("HoraFin").toLocalTime());
                p.setPrecio(rs.getDouble("Precio"));
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar la proyeccion.");
            e.getMessage();
        }
        return p;
    }
    
    public List<Proyeccion> listadoProyecciones(){
        List<Proyeccion> listarProyecciones = new ArrayList<>();
        try {
            String query = "SELECT * FROM proyeccion";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                proyeccion = new Proyeccion();
                proyeccion.setPelicula(rs.getInt("idPelicula"));
                proyeccion.setSala(rs.getInt("idSala"));
                proyeccion.setIdioma(rs.getString("Idioma"));
                proyeccion.setEs3D(rs.getBoolean("Es3D"));
                proyeccion.setSubtitulada(rs.getBoolean("Subtitulada"));
                proyeccion.setHoraInicio(rs.getTime("HoraInicio").toLocalTime());
                proyeccion.setHoraFin(rs.getTime("HoraFin").toLocalTime());
                proyeccion.setPrecio(rs.getDouble("Precio"));             
                listarProyecciones.add(proyeccion);
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al listar las proyecciones. Verificar.");
            e.getMessage();
        }
        return listarProyecciones;
    }
    
}

