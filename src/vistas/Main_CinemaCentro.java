package vistas;

import entidades.Comprador;
import entidades.DetalleTicket;
import entidades.LugarAsiento;
import entidades.Pelicula;
import entidades.Proyeccion;
import entidades.Sala;
import entidades.TicketCompra;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import persistencias.CompradorData;
import persistencias.Conexion;
import persistencias.DetalleTicketData;
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
//    CompradorData compradorD = new CompradorData(Conexion.buscarConexion());
//    compradorD.RegistrarComprador(com2);
    
    //Buscar funciona
    //System.out.println(compradorD.buscarComprador(44530873))
    
    //Actualizar funciona
    //Comprador comActualizar = new Comprador(44530873, "Pedro", LocalDate.now(), "hhhhh", "Debito");
    //compradorD.actualizarComprador(comActualizar);
    
    //bajaFisica funciona
    //compradorD.bajaFisica(44530873);
    
//     PeliculasData pd = new PeliculasData(Conexion.buscarConexion());
     //Pelicula peli0 = new Pelicula ("crb","cristian","felipe y lautaro","argentina","familia",LocalDate.now(),true);
    // pd.cargarPelicula(peli0);// cargar pelicula funciona
    //System.out.println(pd.buscarPelicula(1));// buscar pelicula funciona
    //pd.EliminarPelicula(1);//eliminar pelicula funciona
    
    
    //Prueba buscarDetalleTicket
    DetalleTicketData detalleD = new DetalleTicketData();
//    System.out.println(detalleD.buscarDetalleTicket(10));
//    System.out.println(detalleD.buscarDetallePorComprador(2345668));
//    detalleD.borrarDetalleTicketPorId(23);

    //Prueba de actualizar
    List<Integer> listaLugaresId = new ArrayList();
    int idlugar1 = 12;
    int idlugar2 = 13;
    listaLugaresId.add(idlugar1);
    listaLugaresId.add(idlugar2);
//    TicketCompra ticket, Proyeccion proyeccion, int cantidad, double subtotal, List<LugarAsiento> lugares
    
    TicketCompra ticket = new TicketCompra();
    ticket.setIdTicket(13);

    Proyeccion proyeccion = new Proyeccion();
    proyeccion.setIdProyeccion(68);

    Sala sala = new Sala();
    sala.setNroSala(2);
    
    Pelicula pelicula = new Pelicula();
    pelicula.setTitulo("");

    proyeccion.setSala(sala);
    proyeccion.setPelicula(pelicula);
    
    
//    LugarAsiento lugar1 = new LugarAsiento(59, "c", 1, "ocupado", proyeccion);
//    LugarAsiento lugar2 = new LugarAsiento(60, "c", 2, "ocupado", proyeccion);
//    List<LugarAsiento> lugaresDetalle = new ArrayList();
//    lugaresDetalle.add(lugar1);
//    lugaresDetalle.add(lugar2);
//    
//    DetalleTicket detalle = new DetalleTicket(ticket, proyeccion, 2, 2 * 900, lugaresDetalle);
//    detalleD.actualizarDetaleTicketTest(detalle, listaLugaresId);
//    System.out.println(detalleD.buscarDetalleTicket(26));
//    System.out.println(detalleD.buscarDetallePorComprador(33456789));
   
    } 
    
}
