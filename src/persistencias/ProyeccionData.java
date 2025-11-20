/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencias;

import entidades.Proyeccion;
import entidades.Pelicula;
import entidades.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julia
 */
public class ProyeccionData {
    private Proyeccion proyeccion;
    Connection con = Conexion.buscarConexion();
    public ProyeccionData() {
        this.con = con;

    }

   
    public boolean crearProyeccion(Proyeccion p){
        String query = "INSERT INTO proyeccion (idPelicula, idSala, idioma, es3D, subtitulada, horaInicio, horaFin, precioLugar) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, p.getPelicula().getIdPelicula());
            ps.setInt(2, p.getSala().getIdSala());
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
            ps.setInt(1, p.getPelicula().getIdPelicula());
            ps.setInt(2, p.getSala().getIdSala());
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
                Pelicula pelicula = new Pelicula();
                Sala sala = new Sala();
                pelicula.setIdPelicula(rs.getInt("idPelicula"));
                sala.setIdSala(rs.getInt("idSala"));
                p.setPelicula(pelicula);
                p.setSala(sala);
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
                Pelicula pelicula = new Pelicula();
                Sala sala = new Sala();
                pelicula.setIdPelicula(rs.getInt("idPelicula"));
                sala.setIdSala(rs.getInt("idSala"));
                proyeccion.setPelicula(pelicula);
                proyeccion.setSala(sala);
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
    
    public List<Proyeccion> listarProyeccionesPorPelicula(int idpelicula){
        List<Proyeccion> listarProyecciones = new ArrayList<>();
        try {
            String query = "SELECT proyeccion.*, sala.nroSala " +
                            "FROM proyeccion " +
                            "JOIN sala ON sala.idSala = proyeccion.idSala " +
                            "WHERE idPelicula = ?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idpelicula);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                proyeccion = new Proyeccion();
                
                Pelicula pelicula = new Pelicula();
                pelicula.setIdPelicula(rs.getInt("idPelicula"));
                
                Sala sala = new Sala();
                sala.setIdSala(rs.getInt("idSala"));
                sala.setNroSala(rs.getInt("nroSala"));
                  
                proyeccion.setPelicula(pelicula);
                proyeccion.setSala(sala);
                proyeccion.setIdioma(rs.getString("idioma"));
                proyeccion.setEs3D(rs.getBoolean("es3D"));
                proyeccion.setSubtitulada(rs.getBoolean("subtitulada"));
                proyeccion.setHoraInicio(rs.getTime("horaInicio").toLocalTime());
                proyeccion.setHoraFin(rs.getTime("horaFin").toLocalTime());
                proyeccion.setPrecio(rs.getDouble("precioLugar"));    
                
                listarProyecciones.add(proyeccion);
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al listar las proyecciones. Verificar." + e.getMessage());
            e.getMessage();
        }
        return listarProyecciones;
    }
    
    public void actualizarPrecio2D3D(int idProyeccion, boolean es3D, double nuevoPrecio) {
        String query = "UPDATE proyeccion SET precio = ?, es3D = ? WHERE idProyeccion = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setDouble(1, nuevoPrecio);
            ps.setBoolean(2, es3D);
            ps.setInt(3, idProyeccion);
            
            ps.executeUpdate();   
        } catch (SQLException e) {
            System.out.println("Error al actualizar el precio de la proyeccion. Verificar.");
            e.getMessage();
        }
    }
 
    public Proyeccion ProyeccionPorPelicula2(int idpelicula){
        Proyeccion proyeccion = new Proyeccion();
        try {
            String query = "SELECT * " +
                            "FROM proyeccion " +
                            "WHERE idPelicula = ?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idpelicula);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                Pelicula pelicula = new Pelicula();
                pelicula.setIdPelicula(idpelicula);
                
                Sala sala = new Sala();
                sala.setIdSala(rs.getInt("idSala"));
                  
                proyeccion.setPelicula(pelicula);
                proyeccion.setSala(sala);
                proyeccion.setIdProyeccion(idpelicula);
                proyeccion.setIdioma(rs.getString("idioma"));
                proyeccion.setEs3D(rs.getBoolean("es3D"));
                proyeccion.setSubtitulada(rs.getBoolean("subtitulada"));
                proyeccion.setHoraInicio(rs.getTime("horaInicio").toLocalTime());
                proyeccion.setHoraFin(rs.getTime("horaFin").toLocalTime());
                proyeccion.setPrecio(rs.getDouble("precioLugar"));    
                
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al listar las proyecciones. Verificar." + e.getMessage());
            e.getMessage();
        }
        return proyeccion;
    }
    
    public Proyeccion ProyeccionPorPeliculaHorario(int idpelicula, String horario){
        Proyeccion proyeccion = new Proyeccion();
        try {
            String query = "SELECT * " +
                            "FROM proyeccion " +
                            "WHERE idPelicula = ? AND horaInicio = ?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idpelicula);
            ps.setString(2, horario);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                Pelicula pelicula = new Pelicula();
                pelicula.setIdPelicula(idpelicula);
                
                Sala sala = new Sala();
                sala.setIdSala(rs.getInt("idSala"));
                  
                proyeccion.setPelicula(pelicula);
                proyeccion.setSala(sala);
                proyeccion.setIdProyeccion(rs.getInt("idProyeccion"));
                proyeccion.setIdioma(rs.getString("idioma"));
                proyeccion.setEs3D(rs.getBoolean("es3D"));
                proyeccion.setSubtitulada(rs.getBoolean("subtitulada"));
                proyeccion.setHoraInicio(rs.getTime("horaInicio").toLocalTime());
                proyeccion.setHoraFin(rs.getTime("horaFin").toLocalTime());
                proyeccion.setPrecio(rs.getDouble("precioLugar"));    
                
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al listar las proyecciones. Verificar." + e.getMessage());
            e.getMessage();
        }
        return proyeccion;
    }
}
    
