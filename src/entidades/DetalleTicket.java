package entidades;

import java.util.List;

public class DetalleTicket {

    private int idDetalle = -1;
    private TicketCompra idTicket;
    private Proyeccion idProyeccion;
    private List<LugarAsiento> lugares;
    private int cantidad;
    private double subtotal;

    public DetalleTicket(){
        
    }
    public DetalleTicket(TicketCompra idTicket, Proyeccion idProyeccion, List<LugarAsiento> lugares, int cantidad, double subtotal) {
        this.idTicket = idTicket;
        this.idProyeccion = idProyeccion;
        this.lugares = lugares;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

//    private double calcularSubtotal() {
//        return idProyeccion.getprecio() * cantidad;
//    }

    public TicketCompra getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(TicketCompra idTicket) {
        this.idTicket = idTicket;
    }

    
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Proyeccion getIdProyeccion() {
        return idProyeccion;
    }

    public void setIdProyeccion(Proyeccion idProyeccion) {
        this.idProyeccion = idProyeccion;
    }

    public List<LugarAsiento> getLugares() {
        return lugares;
    }

    public void setLugares(List<LugarAsiento> lugares) {
        this.lugares = lugares;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "Detalle Ticket: " + idDetalle + "\n" +
                "idTicket: " + idTicket.getIdTicket() + "\n" +
                "idProyeccion: " + idProyeccion.getIdProyeccion() + "\n" +
                "NroSala: " + idProyeccion.getSala().getNroSala() + "\n" +
                "Pelicula: " + idProyeccion.getPelicula().getTitulo() + "\n" +
                "Cantidad: " + cantidad + "\n" +
                "Subtotal: " + subtotal + "\n" +
                "Lugares: " + lugares;
    }

}
