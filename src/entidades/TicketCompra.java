/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public class TicketCompra {

    private int idTicket;
    private LocalDateTime fechaCompra;
    private LocalDate fechaFuncion;
    private Comprador comprador;
    private String tipoCompra;
    private String codigoVenta;
    private double monto;
    private List<DetalleTicket> detalles;

    public TicketCompra() {
    }

    public TicketCompra(LocalDateTime fechaCompra, LocalDate fechaFuncion, Comprador comprador, String tipoCompra, String codigoVenta, double monto, List<DetalleTicket> detalles) {
        this.fechaCompra = fechaCompra;
        this.fechaFuncion = fechaFuncion;
        this.comprador = comprador;
        this.tipoCompra = tipoCompra;
        this.codigoVenta = codigoVenta;
        this.monto = calcularMonto();
        this.detalles = detalles;
    }

    private double calcularMonto() {
        double total = 0;

        if (detalles != null || detalles.isEmpty()) {
            for (DetalleTicket detalle : detalles) {
                if (detalle != null) {
                    total += detalle.getSubtotal();
                }
            }
        }
        return total;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalDate getFechaFuncion() {
        return fechaFuncion;
    }

    public void setFechaFuncion(LocalDate fechaFuncion) {
        this.fechaFuncion = fechaFuncion;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public String getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(String tipoCompra) {
        this.tipoCompra = tipoCompra;
    }

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public List<DetalleTicket> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleTicket> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "TicketCompra{" + "fechaCompra=" + fechaCompra + ", fechaFuncion=" + fechaFuncion + ", comprador=" + comprador + ", tipoCompra=" + tipoCompra + ", codigoVenta=" + codigoVenta + ", monto=" + monto + ", detalles=" + detalles + '}';
    }

}
