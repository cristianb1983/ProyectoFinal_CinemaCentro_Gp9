package persistencias;

import entidades.DetalleTicket;
import entidades.LugarAsiento;
import entidades.Pelicula;
import entidades.Proyeccion;
import entidades.Sala;
import entidades.TicketCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DetalleTicketData {

    private Connection con;

    Connection conex = Conexion.buscarConexion();

    public DetalleTicketData(Connection conex) {
        this.conex = conex;
    }

    public boolean registrarDetalleTicket(DetalleTicket detalle) {
        String query = "INSERT INTO detalleticket(idTicket, idProyeccion, cantidad, subTotal) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement ps = conex.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalle.getTicket().getIdTicket());
            ps.setInt(2, detalle.getProyeccion().getIdProyeccion());
            ps.setInt(3, detalle.getCantidad());
            ps.setDouble(4, detalle.getSubtotal());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                detalle.setIdDetalle(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el idDetalle");
            }
            ps.close();
            System.out.println("DetalleTicket guardado");

            //El metodo registrarLugarAsiento debe
            //retornar la clave primaria
            String queryLugares = "INSERT INTO lugar_detalleticket(lugarId, detalleId) VALUES(?, ?)";
            PreparedStatement psLugares = conex.prepareStatement(queryLugares);
            for (LugarAsiento aux : detalle.getLugares()) {
                //recorre lo que hay en la lista de Lugares de detalleTicket y va impactando contra la bd
                psLugares.setInt(1, aux.getIdLugar());
                psLugares.setInt(2, detalle.getIdDetalle());
                psLugares.executeUpdate();
            }
            psLugares.close();

            return true;
        } catch (SQLException e) {
            System.out.println("No se pudo registrar el detalleTikcet:");
            System.out.println(e.getMessage());
            return false;
        }
    }

    //Falta probar
    public void actualizarDetaleTicket(DetalleTicket detalle, List<Integer> Idlugares) {
        String query = "UPDATE detalleticket SET idTicket = ?, idProyeccion = ?, cantidad = ?, subTotal = ? where idDetalle = ?";
        try {
            PreparedStatement ps = conex.prepareStatement(query);
            //Remplaso los comodines y ejecuto y actualizo
            ps.setInt(1, detalle.getTicket().getIdTicket());
            ps.setInt(2, detalle.getProyeccion().getIdProyeccion());
            ps.setInt(3, detalle.getCantidad());
            ps.setDouble(4, detalle.getSubtotal());
            ps.setInt(5, detalle.getIdDetalle());
            ps.executeUpdate();
            ps.close();

            String queryLugares = "UPDATE lugar_detalleticket SET lugarId = ? where detalleId = ?";
            PreparedStatement psLugares = conex.prepareStatement(queryLugares);
            for (int i = 0; i < detalle.getLugares().size(); i++) {
                LugarAsiento aux = detalle.getLugares().get(i);
                // va asignando los nuevos ids de lugar pasados por parametro
                int idLugarDetalle = Idlugares.get(i);
                psLugares.setInt(1, idLugarDetalle);
                psLugares.setInt(2, detalle.getIdDetalle());
                psLugares.executeUpdate();
            }
            psLugares.close();
            System.out.println("DetalleTicket actualizado");
        } catch (SQLException e) {
            System.out.println("No se pudo actualizar");
            System.out.println(e.getMessage());
        }
    }

    public void borrarDetalleTicket(int idDetalleBorrar , List<Integer> idLugaresBorrar) {
        String query = "DELETE FROM detalleticket WHERE idDetalle = ?";
        String queryLugares = "DELETE FROM lugar_detalleticket WHERE lugaresId = ?";
        try {
            PreparedStatement psLugares = conex.prepareStatement(queryLugares);
            psLugares.setInt(1, idDetalleBorrar);
            psLugares.executeUpdate();
            psLugares.close();

            PreparedStatement ps = conex.prepareStatement(query);
            ps.setInt(1, idDetalleBorrar);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo borrar el DetalleTicket, compuebe el id");
            System.out.println(e.getMessage());
        }
    }

    public void borrarDetalleTicketPorId(int idDetalleBorrar) {
        String query = "DELETE FROM detalleticket WHERE idDetalle = ?";
        String queryLugares = "DELETE FROM lugar_detalleticket WHERE detalleId = ?";
        try {
            PreparedStatement psLugares = conex.prepareStatement(queryLugares);
            psLugares.setInt(1, idDetalleBorrar);
            psLugares.executeUpdate();
            psLugares.close();

            PreparedStatement ps = conex.prepareStatement(query);
            ps.setInt(1, idDetalleBorrar);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("No se pudo borrar el DetalleTicket, compuebe el id");
            System.out.println(e.getMessage());
        }
    }
    
    public DetalleTicket buscarDetalleTicket(int idDetalle) {
        DetalleTicket detalle = null;
        String query = "SELECT detalleticket.*, idLugar, fila, numero, nroSala, titulo "
                + "FROM detalleticket "
                + "JOIN lugar_detalleticket ON lugar_detalleticket.detalleId = detalleticket.idDetalle "
                + "JOIN lugar ON lugar.idLugar = lugar_detalleticket.lugarId "
                + "JOIN proyeccion ON proyeccion.idProyeccion = detalleticket.idProyeccion "
                + "JOIN pelicula ON pelicula.idPelicula = proyeccion.idPelicula "
                + "JOIN sala ON sala.idSala = proyeccion.idSala "
                + "WHERE idDetalle = ?;";
        try {
            PreparedStatement ps = conex.prepareStatement(query);
            ps.setInt(1, idDetalle);
            ResultSet rs = ps.executeQuery();
            List<LugarAsiento> lugares = new ArrayList();
            //Creamos y asignamos a detalleTicket los atributos
            while (rs.next()) {
                if (detalle == null) {
                    detalle = new DetalleTicket();
                    detalle.setIdDetalle(idDetalle);

                    TicketCompra ticket = new TicketCompra();
                    ticket.setIdTicket(rs.getInt("idTicket"));
                    detalle.setTicket(ticket);

                    //A proyeccion le asignamos su id, el numero de sala y el titulo de pelicula
                    Proyeccion proyeccion = new Proyeccion();
                    proyeccion.setIdProyeccion(rs.getInt("idProyeccion"));
//                  Sala sala = salaD.buscarSala(rs.getInt("idSala"));
                    Sala sala = new Sala();
                    sala.setNroSala(rs.getInt("nroSala"));
                    Pelicula pelicula = new Pelicula();
                    pelicula.setTitulo(rs.getString("titulo"));

                    proyeccion.setSala(sala);
                    proyeccion.setPelicula(pelicula);
                    detalle.setProyeccion(proyeccion);

                    detalle.setCantidad(rs.getInt("cantidad"));
                    detalle.setSubtotal(rs.getDouble("subTotal"));
                }
                LugarAsiento lugar = new LugarAsiento();
                lugar.setIdLugar(rs.getInt("idLugar"));
                lugar.setFila(rs.getString("fila"));
                lugar.setNumero(rs.getInt("numero"));
                lugares.add(lugar);
            }
            detalle.setLugares(lugares);
            ps.close();
        } catch (SQLException e) {
            System.out.println("");
            System.out.println(e.getMessage());
        }
        return detalle;
    }

    public DetalleTicket buscarDetallePorComprador(int dniComprador) {
        DetalleTicket detallesDni = null;
        String query = "SELECT detalleticket.*, idLugar, fila, numero, nroSala, titulo "
                + "FROM detalleticket "
                + "JOIN lugar_detalleticket ON lugar_detalleticket.detalleId = detalleticket.idDetalle "
                + "JOIN lugar ON lugar.idLugar = lugar_detalleticket.lugarId "
                + "JOIN proyeccion ON proyeccion.idProyeccion = detalleticket.idProyeccion "
                + "JOIN pelicula ON pelicula.idPelicula = proyeccion.idPelicula "
                + "JOIN sala ON sala.idSala = proyeccion.idSala "
                + "JOIN ticketcompra on ticketcompra.idTicket = detalleticket.idTicket "
                + "JOIN comprador ON comprador.dni = ticketcompra.dniComprador "
                + "WHERE comprador.dni = ?;";
        try {
            PreparedStatement ps = conex.prepareStatement(query);
            ps.setInt(1, dniComprador);
            ResultSet rs = ps.executeQuery();

            List<LugarAsiento> lugares = new ArrayList();
            while (rs.next()) {
                if (detallesDni == null) {
                    detallesDni = new DetalleTicket();
                    detallesDni.setIdDetalle(rs.getInt("idDetalle"));

                    TicketCompra ticket = new TicketCompra();
                    ticket.setIdTicket(rs.getInt("idTicket"));
                    detallesDni.setTicket(ticket);

                    Proyeccion proyeccion = new Proyeccion();
                    proyeccion.setIdProyeccion(rs.getInt("idProyeccion"));
                    Sala sala = new Sala();
                    sala.setNroSala(rs.getInt("nroSala"));
                    Pelicula pelicula = new Pelicula();
                    pelicula.setTitulo(rs.getString("titulo"));
                    proyeccion.setSala(sala);
                    proyeccion.setPelicula(pelicula);
                    detallesDni.setProyeccion(proyeccion);

                    detallesDni.setCantidad(rs.getInt("cantidad"));
                    detallesDni.setSubtotal(rs.getDouble("subTotal"));
                }

                LugarAsiento lugar = new LugarAsiento();
                lugar.setIdLugar(rs.getInt("idLugar"));
                lugar.setFila(rs.getString("fila"));
                lugar.setNumero(rs.getInt("numero"));
                lugares.add(lugar);
            }

            detallesDni.setLugares(lugares);
        } catch (SQLException | NullPointerException e) {
            System.out.println("ERROR, revise el dni ingresado");
            System.out.println(e.getMessage());
        }
        return detallesDni;
    }

    public List<DetalleTicket> listaDetalles() {
        //faltan cambios
        List<DetalleTicket> listaDetalles = new ArrayList();
        String query = "SELECT detalleticket.*, idLugar, fila, numero, nroSala, titulo "
                + "FROM detalleticket "
                + "JOIN lugar_detalleticket ON lugar_detalleticket.detalleId = detalleticket.idDetalle "
                + "JOIN lugar ON lugar.idLugar = lugar_detalleticket.lugarId "
                + "JOIN proyeccion ON proyeccion.idProyeccion = detalleticket.idProyeccion "
                + "JOIN pelicula ON pelicula.idPelicula = proyeccion.idPelicula "
                + "JOIN sala ON sala.idSala = proyeccion.idSala";
        try {
            PreparedStatement ps = conex.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            int idAnterior = -1;
            DetalleTicket detalle = null;
            while (rs.next()) {
                int idActual = rs.getInt("idDetalle");
                
                if(idActual != idAnterior){
                    detalle = new DetalleTicket();
                    
                    detalle.setIdDetalle(idActual);
                    TicketCompra ticket = new TicketCompra();
                    ticket.setIdTicket(rs.getInt("idTicket"));
                    detalle.setTicket(ticket);

                    Proyeccion proyeccion = new Proyeccion();
                    proyeccion.setIdProyeccion(rs.getInt("idProyeccion"));
                    Sala sala = new Sala();
                    sala.setNroSala(rs.getInt("nroSala"));
                    Pelicula pelicula = new Pelicula();
                    pelicula.setTitulo(rs.getString("titulo"));

                    proyeccion.setSala(sala);
                    proyeccion.setPelicula(pelicula);
                    detalle.setProyeccion(proyeccion);

                    detalle.setCantidad(rs.getInt("cantidad"));
                    detalle.setSubtotal(rs.getDouble("subTotal"));
                    
                    detalle.setLugares(new ArrayList());
                    listaDetalles.add(detalle);
                    idAnterior = detalle.getIdDetalle();
                }

                LugarAsiento lugar = new LugarAsiento();
                lugar.setIdLugar(rs.getInt("idLugar"));
                lugar.setFila(rs.getString("fila"));
                lugar.setNumero(rs.getInt("numero"));
                detalle.getLugares().add(lugar);
            }
        } catch (SQLException e) {
            System.out.println("Error no se pudo obtener la lista");
            System.out.println(e.getMessage());
        }
        return listaDetalles;
    }

    public List<DetalleTicket> buscarDetallePorComprador(long dniComprador) {
        List<DetalleTicket> detalles = new ArrayList<>();

        String sql = "SELECT dt.idDetalle, dt.idTicket, dt.idProyeccion, dt.cantidad, dt.subtotal, "
                + "l.idLugar, l.fila, l.numero, "
                + "s.nroSala, "
                + "p.idProyeccion, "
                + "pel.titulo "
                + "FROM detalleticket dt "
                + "JOIN ticketcompra t ON t.idTicket = dt.idTicket "
                + "JOIN comprador c ON c.dni = t.dniComprador "
                + "JOIN lugar_detalleticket ldt ON ldt.detalleId = dt.idDetalle "
                + "JOIN lugar l ON l.idLugar = ldt.lugarId "
                + "JOIN proyeccion p ON p.idProyeccion = dt.idProyeccion "
                + "JOIN pelicula pel ON pel.idPelicula = p.idPelicula "
                + "JOIN sala s ON s.idSala = p.idSala "
                + "WHERE c.dni = ? "
                + "ORDER BY dt.idDetalle";

        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setLong(1, dniComprador);

            try (ResultSet rs = ps.executeQuery()) {
                DetalleTicket detalleActual = null;
                int idDetalleAnterior = -1; // valor inical imposible a nulo

                while (rs.next()) {
                    int idDetalle = rs.getInt("idDetalle");

                    //Detecta si encontramos un nuevo detalle
                    if (detalleActual == null || idDetalle != idDetalleAnterior) {

                        // Se crea un nuevo DetalleTicket
                        detalleActual = new DetalleTicket();
                        detalleActual.setIdDetalle(idDetalle);

                        TicketCompra ticket = new TicketCompra();
                        ticket.setIdTicket(rs.getInt("idTicket"));
                        detalleActual.setTicket(ticket);

                        Proyeccion proyeccion = new Proyeccion();
                        proyeccion.setIdProyeccion(rs.getInt("idProyeccion"));

                        Sala sala = new Sala();
                        sala.setNroSala(rs.getInt("nroSala"));

                        Pelicula pelicula = new Pelicula();
                        pelicula.setTitulo(rs.getString("titulo"));

                        proyeccion.setPelicula(pelicula);

                        detalleActual.setProyeccion(proyeccion);
                        detalleActual.setCantidad(rs.getInt("cantidad"));
                        detalleActual.setSubtotal(rs.getDouble("subtotal"));
                        detalleActual.setLugares(new ArrayList<>());
                        detalles.add(detalleActual);

                        //Mostramos cuando se crea un nuevo detalle
                        System.out.println("\n Nuevo detalleTicket creado = ID: " + idDetalle);
                        System.out.println("Pelicula: " + pelicula.getTitulo() + " | Sala: " + sala.getNroSala());
                        System.out.println("Subtotal: " + detalleActual.getSubtotal());

                        idDetalleAnterior = idDetalle;
                    }

                    //Agregar asientos a la lista actual
                    LugarAsiento lugar = new LugarAsiento();

                    lugar.setIdLugar(rs.getInt("idLugar"));
                    lugar.setFila(rs.getString("fila"));
                    lugar.setNumero(rs.getInt("numero"));

                    detalleActual.getLugares().add(lugar);

                    System.out.println("Asiento agregado: Fila " + lugar.getFila() + " - N° " + lugar.getNumero());
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar detalle por comprador: " + e.getMessage());
        }

        //Mostramos el resumen
        for (DetalleTicket d : detalles) {
            System.out.println("Detalle ID: " + d.getIdDetalle() + " | Asientos: " + d.getLugares().size());
        }

        return detalles;
    }
}
