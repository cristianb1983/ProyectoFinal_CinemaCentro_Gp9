package vistas;

import entidades.Comprador;
import java.sql.Connection;
import java.time.LocalDate;
import persistencias.CompradorData;
import persistencias.Conexion;

/**
*
* @autor Benegas Gonzalez Cristian Rene
*/

public class Main_CinemaCentro {

   
public static void main(String[] args) {
//    Comprador com0 = new Comprador(44530873, "Rodrigo", LocalDate.now(), "123abc", "Efectivo");
//    Comprador com1 = new Comprador(44530846, "Mariano", LocalDate.now(), "324jk", "Efectivo");
//    Comprador com2 = new Comprador(36235643, "Ayelen", LocalDate.now(), "987hyu", "Efectivo");
    CompradorData compradorD = new CompradorData(Conexion.buscarConexion());
//    compradorD.RegistrarComprador(com2);
    
    //Buscar funciona
    //System.out.println(compradorD.buscarComprador(44530873));
    
    //Actualizar funciona
    //Comprador comActualizar = new Comprador(44530873, "Pedro", LocalDate.now(), "hhhhh", "Debito");
    //compradorD.actualizarComprador(comActualizar);
    
    //bajaFisica funciona
    compradorD.bajaFisica(44530873);

    
    }

}
