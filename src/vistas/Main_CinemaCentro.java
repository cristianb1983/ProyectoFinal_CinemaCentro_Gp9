package vistas;

import entidades.Comprador;
import entidades.Pelicula;
import java.sql.Connection;
import java.time.LocalDate;
import persistencias.CompradorData;
import persistencias.Conexion;
import persistencias.PeliculasData;

/**
*
* @autor Benegas Gonzalez Cristian Rene
*/

public class Main_CinemaCentro {

   
public static void main(String[] args) {
//    Comprador com0 = new Comprador(44530873, "Rodrigo", LocalDate.now(), "123abc", "Efectivo");
//    Comprador com1 = new Comprador(44530846, "Mariano", LocalDate.now(), "324jk", "Efectivo");
//    Comprador com2 = new Comprador(23456234, "Ayelen", LocalDate.now(), "987hyu", "Efectivo");
//    Comprador com3 = new Comprador(25678245, "Julian", LocalDate.now(), "35fhj", "Efectivo");
//    Comprador com4 = new Comprador(32567842, "Cristian", LocalDate.now(), "tfj234", "Efectivo");
    CompradorData compradorD = new CompradorData(Conexion.buscarConexion());
//    compradorD.RegistrarComprador(com2);
    
    //Buscar funciona
    //System.out.println(compradorD.buscarComprador(44530873))
    
    //Actualizar funciona
    //Comprador comActualizar = new Comprador(44530873, "Pedro", LocalDate.now(), "hhhhh", "Debito");
    //compradorD.actualizarComprador(comActualizar);
    
    //bajaFisica funciona
    //compradorD.bajaFisica(44530873);
    
     PeliculasData pd = new PeliculasData(Conexion.buscarConexion());
     //Pelicula peli0 = new Pelicula ("crb","cristian","felipe y lautaro","argentina","familia",LocalDate.now(),true);
    // pd.cargarPelicula(peli0);// cargar pelicula funciona
    //System.out.println(pd.buscarPelicula(1));// buscar pelicula funciona
   pd.EliminarPelicula(1);
} 
    
}
