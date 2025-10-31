/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class LugarAsiento {

    private int idLugar = -1;
    private String fila;
    private int numero;
    private String estado;
    private Proyeccion proyeccion;

    public LugarAsiento() {
    }

    public LugarAsiento(String fila, int numero, String estado, Proyeccion proyeccion) {
        this.fila = fila;
        this.numero = numero;
        this.estado = estado;
        this.proyeccion = proyeccion;
    }

    public LugarAsiento(int idLugar, String fila, int numero, String estado, Proyeccion proyeccion) {
        this.idLugar = idLugar;
        this.fila = fila;
        this.numero = numero;
        this.estado = estado;
        this.proyeccion = proyeccion;
    }

    public int getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Proyeccion getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(Proyeccion proyeccion) {
        this.proyeccion = proyeccion;
    }

    @Override
    public String toString() {
        return "LugarAsiento{" + "idLugar=" + idLugar + ", fila=" + fila + ", numero=" + numero + ", estado=" + estado + ", idProyeccion=" + proyeccion + '}';
    }

}
