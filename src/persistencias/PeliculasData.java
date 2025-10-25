package persistencias;

import entidades.Pelicula;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

/**
 *
 * @autor Benegas Gonzalez Cristian Rene
 */
public class PeliculasData {

    public PeliculasData() {
        Conexion.buscarConexion();
    }

    public PeliculasData(Connection buscarConexion) {
    }
    Connection con = Conexion.buscarConexion();

    public boolean cargarPelicula(Pelicula p) {
        String query = "INSERT INTO pelicula (titulo, director, actores, origen, genero, estreno, enCartelera) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getTitulo());
            ps.setString(2, p.getDirector());
            ps.setString(3, p.getActores());
            ps.setString(4, p.getOrigen());
            ps.setString(5, p.getGenero());
            ps.setDate(6, Date.valueOf(p.getEstreno()));
            ps.setBoolean(7, p.isEnCartelera());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                p.setIdPelicula(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el ID");
            }
            ps.close();
            System.out.println("Pelicula guardada correctamente.");
            return true;
        } catch (SQLException e) {
            System.out.println("No se pudo guardar la pelicula.");
            return false;
        }

    }

    public void actualizarPelicula(Pelicula p) {
        String query = "UPDATE pelicula SET titulo = ?, director = ?, actores = ?, origen = ?, genero = ?, estreno = ?, enCartelera = ? where idPelicula = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, p.getIdPelicula());
            ps.setString(2, p.getTitulo());
            ps.setString(3, p.getDirector());
            ps.setString(4, p.getActores());
            ps.setString(5, p.getOrigen());
            ps.setString(6, p.getGenero());
            ps.setDate(7, Date.valueOf(p.getEstreno()));
            ps.setBoolean(8, p.isEnCartelera());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                System.out.println("Pelicula modificada con exito!!!");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo actualizar");
        }
    }

    public Pelicula buscarPelicula(int idpelicula) {
        Pelicula p = null;
        String query = "SELECT * FROM pelicula WHERE idPelicula = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idpelicula);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p = new Pelicula();
                p.setIdPelicula(rs.getInt("idpelicula"));
                p.setTitulo(rs.getString("titulo"));
                p.setDirector(rs.getString("director"));
                p.setActores(rs.getString("actores"));
                p.setOrigen(rs.getString("origen"));
                p.setGenero(rs.getString("genero"));
                p.setEstreno(rs.getDate("estreno").toLocalDate());
                p.setEnCartelera(rs.getBoolean("enCartelera"));

            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar la pelicula");
            e.getMessage();
        }
        return p;
    }
    public void EliminarPelicula(int idPelicula){
         String query = "DELETE FROM pelicula WHERE idPelicula = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idPelicula);
            ps.executeUpdate();
            System.out.println("pelicula borrada");
        }catch(SQLException e) {
            System.out.println("No se pudo borrar la pelicula, revise los datos");
            e.getMessage();
        }    
    }

}
