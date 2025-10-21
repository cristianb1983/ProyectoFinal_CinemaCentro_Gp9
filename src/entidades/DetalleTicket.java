package entidades;

import java.util.List;

public class DetalleTicket {

    private int idDetalle;
    private Proyeccion proyeccion;
    private List<LugarAsiento> lugares;
    private int cantidad;
    private double subtotal;

    public DetalleTicket(Proyeccion proyeccion, List<LugarAsiento> lugares, int cantidad, double subtotal) {
        this.proyeccion = proyeccion;
        this.lugares = lugares;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    private double calcularSubtotal() {
        return proyeccion.getprecio() * cantidad;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Proyeccion getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(Proyeccion proyeccion) {
        this.proyeccion = proyeccion;
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
        return "Detalle Ticket: " + proyeccion + " Lugares:" + cantidad + ", Subtotal: $" + subtotal;
    }

}
