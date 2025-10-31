/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Comprador {
    private long dniComprador;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String password;
    private String medioDePago;

    public Comprador() {
    }

    public Comprador(long dniComprador, String nombre, LocalDate fechaNacimiento, String password, String medioDePago) {
        this.dniComprador = dniComprador;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.password = password;
        this.medioDePago = medioDePago;
    }

    public long getDniComprador() {
        return dniComprador;
    }

    public void setDniComprador(long dniComprador) {
        this.dniComprador = dniComprador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    @Override
    public String toString() {
        return "Comprador{" + "dni=" + dniComprador + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", password=" + password + ", medioDePago=" + medioDePago + '}';
    }
    
    
    
}
