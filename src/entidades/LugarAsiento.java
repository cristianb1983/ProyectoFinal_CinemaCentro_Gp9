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
    private char fila;
    private int numero;
    private boolean estado;
    private Proyeccion idProyeccion;

    public LugarAsiento() {
    }

    public LugarAsiento(char fila, int numero, boolean estado, Proyeccion idProyeccion) {
        this.fila = fila;
        this.numero = numero;
        this.estado = estado;
        this.idProyeccion = idProyeccion;
    }

    public int getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Proyeccion getIdProyeccion() {
        return idProyeccion;
    }

    public void setIdProyeccion(Proyeccion idProyeccion) {
        this.idProyeccion = idProyeccion;
    }

    @Override
    public String toString() {
        return "LugarAsiento{" + "idLugar=" + idLugar + ", fila=" + fila + ", numero=" + numero + ", estado=" + estado + ", idProyeccion=" + idProyeccion + '}';
    }
    
    
}
