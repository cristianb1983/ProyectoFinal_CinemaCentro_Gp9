package persistencias;

import entidades.LugarAsiento;
import entidades.Proyeccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mariano
 */
public class LugarData {

    private final Connection con;

    public LugarData() {
        con = Conexion.buscarConexion();
    }

    public boolean guardarLugar(LugarAsiento lugar) {
        String sql = "INSERT INTO lugar (fila, numero, estado, idProyeccion) "
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, lugar.getFila());
            ps.setInt(2, lugar.getNumero());
            ps.setString(3, lugar.getEstado());
            ps.setInt(4, lugar.getProyeccion().getIdProyeccion());

            int filas = ps.executeUpdate();

            if (filas > 0) {
                ResultSet rs = ps.getGeneratedKeys();

                if (rs.next()) {
                    lugar.setIdLugar(rs.getInt(1));
                }
                System.out.println("Lugar guardado correctamente. ID: " + lugar.getIdLugar());
                return true;

            } else {
                System.out.println("No se pudo guardar el lugar. ");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar lugar: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarLugar(int idLugar) {
        String sql = "DELETE "
                + "FROM lugar "
                + "WHERE idLugar = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLugar);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Lugar eliminado correctamente. ");
                return true;
            } else {
                System.out.println("No se encontró el lugar para eliminar.");
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar lugar: " + e.getMessage());
        }

        return false;
    }
    
    public boolean eliminarLugarPorProyeccion(int idProy) {
        String sql = "DELETE "
                + "FROM lugar "
                + "WHERE idProyeccion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProy);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Lugar eliminado correctamente. ");
                return true;
            } else {
                System.out.println("No se encontró el lugar para eliminar.");
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar lugar: " + e.getMessage());
        }

        return false;
    }

    public boolean actualizarLugar(LugarAsiento lugar) {

        String sql = "UPDATE lugar "
                + "SET fila = ?, numero = ?, estado = ?, idProyeccion = ? "
                + "WHERE idLugar = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, lugar.getFila());
            ps.setInt(2, lugar.getNumero());
            ps.setString(3, lugar.getEstado());
            ps.setInt(4, lugar.getProyeccion().getIdProyeccion());
            ps.setInt(5, lugar.getIdLugar());

            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Lugar actualizado correctamente. ");
                return true;
            } else {
                System.out.println("No se encontró el lugar para actualizar. ");
            }

        } catch (SQLException e) {
            System.out.println("Error al actualizar lugar: " + e.getMessage());
        }

        return false;
    }

    public boolean liberarLugar(int idLugar) {
        String sql = "UPDATE lugar "
                + "SET estado = 'DISPONIBLE' "
                + "WHERE idLugar = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLugar);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Lugar liberado correctamente.");
                return true;
            } else {
                System.out.println("No se encontró el lugar para liberar.");
            }

        } catch (SQLException e) {
            System.out.println("Error al liberar lugar: " + e.getMessage());
        }

        return false;
    }

    public boolean ocuparLugar(int idLugar) {
        String sql = "UPDATE lugar "
                + "SET estado = 'NO DISPONIBLE' "
                + "WHERE idLugar = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLugar);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Lugar ocupado correctamente.");
                return true;
            } else {
                System.out.println("No se encontró el lugar para ocupar.");
            }

        } catch (SQLException e) {
            System.out.println("Error al ocupar lugar: " + e.getMessage());
        }

        return false;
    }

    public List<LugarAsiento> obtenerLugaresDisponibles(Proyeccion proyeccion) {
        List<LugarAsiento> lista = new ArrayList<>();

        String sql = "SELECT * "
                + "FROM lugar "
                + "WHERE idProyeccion = ? "
                + "AND estado = 'Disponible'";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, proyeccion.getIdProyeccion());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                LugarAsiento lugar = new LugarAsiento(
                        rs.getInt("idLugar"),
                        rs.getString("fila"),
                        rs.getInt("numero"),
                        rs.getString("estado"),
                        proyeccion);

                lista.add(lugar);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener lugares disponibles: " + e.getMessage());
        }

        return lista;
    }

    public LugarAsiento buscarLugarPorId(int idLugar, Proyeccion proyeccion) {
        LugarAsiento lugar = null;

        String sql = "SELECT * "
                + "FROM lugar "
                + "WHERE idLugar = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idLugar);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    lugar = new LugarAsiento(
                            rs.getInt("idLugar"),
                            rs.getString("fila"),
                            rs.getInt("numero"),
                            rs.getString("estado"),
                            proyeccion);
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar lugar: " + e.getMessage());
        }

        return lugar;
    }

    public List<LugarAsiento> obtenerLugarPorProyeccion(Proyeccion proy) {
        List<LugarAsiento> lista = new ArrayList<>();

        String sql = "SELECT * "
                + "FROM lugar "
                + "WHERE idProyeccion = ?";

            try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, proy.getIdProyeccion());
            ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    LugarAsiento lugar = new LugarAsiento(
                            rs.getInt("idLugar"),
                            rs.getString("fila"),
                            rs.getInt("numero"),
                            rs.getString("estado"),
                            proy);
                    lista.add(lugar);
                }
        } catch (SQLException e) {
            System.out.println("Error al obtener lugares: " + e.getMessage());
        }

        return lista;
    }
    
    public LugarAsiento buscarLugar(int idLugar) {
        LugarAsiento lugar = null;
        String sql = "SELECT * "
                + "FROM lugar "
                + "WHERE idLugar = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idLugar);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Proyeccion proy = new Proyeccion();
                    proy.setIdProyeccion(rs.getInt("idProyeccion"));
                    lugar = new LugarAsiento(
                            rs.getInt("idLugar"),
                            rs.getString("fila"),
                            rs.getInt("numero"),
                            rs.getString("estado"),
                            proy);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar lugar: " + e.getMessage());
        }
        return lugar;
    }
}
