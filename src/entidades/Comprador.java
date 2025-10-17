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
    private int dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int password;
    private ArrayList<String> medioDePago;

    public Comprador() {
    }

    public Comprador(int dni, String nombre, LocalDate fechaNacimiento, int password, ArrayList<String> medioDePago) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.password = password;
        this.medioDePago = medioDePago;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public ArrayList<String> getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(ArrayList<String> medioDePago) {
        this.medioDePago = medioDePago;
    }

    @Override
    public String toString() {
        return "Comprador{" + "dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", password=" + password + ", medioDePago=" + medioDePago + '}';
    }
    
    
    
}
