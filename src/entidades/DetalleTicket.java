package entidades;

import java.util.ArrayList;
import java.util.List;

public class DetalleTicket {

    private int idDetalle = -1;
    private TicketCompra ticket;
    private Proyeccion proyeccion;
    private int cantidad;
    private double subtotal;
    private List<LugarAsiento> lugares;

    public DetalleTicket() {
        lugares = new ArrayList<>();
    }

    public DetalleTicket(Proyeccion proyeccion, int cantidad, double subtotal) {
        this.proyeccion = proyeccion;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.lugares = new ArrayList<>();;
    }

    public DetalleTicket(TicketCompra ticket, Proyeccion proyeccion, int cantidad, double subtotal, List<LugarAsiento> lugares) {
        this.ticket = ticket;
        this.proyeccion = proyeccion;
        this.cantidad = cantidad;
        this.subtotal = subtotal;

        if (lugares != null) {
            this.lugares = lugares;
        } else {
            System.out.println("No se recibió lista de lugares, se crea una nueva vacía.");
            this.lugares = new ArrayList<>();
        }
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public TicketCompra getTicket() {
        return ticket;
    }

    public void setTicket(TicketCompra ticket) {
        this.ticket = ticket;
    }

    public Proyeccion getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(Proyeccion proyeccion) {
        this.proyeccion = proyeccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        recalcularSubtotal();
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public List<LugarAsiento> getLugares() {
        return lugares;
    }

    public void setLugares(List<LugarAsiento> lugares) {
        if (lugares != null) {
            this.lugares = lugares;
        } else {
            this.lugares = new ArrayList<>();
        }
        recalcularSubtotal();
    }

    public void agregarLugar(LugarAsiento lugar) {
        if (lugar != null) {
            this.lugares.add(lugar);
            this.cantidad = lugares.size();
            recalcularSubtotal();
        }
    }

    public void eliminarLugar(LugarAsiento lugar) {
        if (lugar != null && lugares.remove(lugar)) {
            this.cantidad = lugares.size();
            recalcularSubtotal();
        }
    }

    public void recalcularSubtotal() {
        if (proyeccion != null) {
            this.subtotal = this.cantidad * proyeccion.getPrecio();
        } else {
            this.subtotal = 0;
        }
    }

    @Override
    public String toString() {
        return "Detalle Ticket: " + idDetalle + "\n"
                + "Ticket: " + ticket.getIdTicket() + "\n"
                + "Proyeccion: " + proyeccion.getIdProyeccion() + "\n"
                + "NroSala: " + proyeccion.getSala().getNroSala() + "\n"
                + "Pelicula: " + proyeccion.getPelicula().getTitulo() + "\n"
                + "Cantidad: " + cantidad + "\n"
                + "Subtotal: " + subtotal + "\n"
                + "Lugares: " + lugares;
    }

}
