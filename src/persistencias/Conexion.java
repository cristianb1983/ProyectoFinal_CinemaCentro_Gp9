package persistencias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String url = "jdbc:mariadb://localhost:3306/";
    private static final String usuario = "root";
    private static final String password = "";
    private static Connection conexion = null;
    
    public Conexion() {
    }

    public static Connection buscarConexion() {
        if (conexion == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(url, usuario, password);
            } catch (SQLException | ClassNotFoundException ex) {
                System.out.println("No se puede conectar o no se puede cargar el driver.Error: " + ex.getMessage());
            }
        }
        return conexion;
    }
}
