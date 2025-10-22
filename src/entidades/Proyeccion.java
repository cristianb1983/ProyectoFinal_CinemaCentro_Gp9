package entidades;

import java.time.LocalTime;


public class Proyeccion {
private int idProyeccion;
private Pelicula pelicula;
private String idioma;
private boolean es3D;
private boolean subtitulada;
private LocalTime horaInicio;
private LocalTime horaFin;
private Sala sala;
private double precio;

public Proyeccion(){}

    public Proyeccion(Pelicula pelicula, String idioma, boolean es3D, boolean subtitulada, LocalTime horaInicio, LocalTime horaFin, Sala sala, double precio) {
        int idProyeccion = -1;
        this.pelicula = pelicula;
        this.idioma = idioma;
        this.es3D = es3D;
        this.subtitulada = subtitulada;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.sala = sala;
        this.precio = precio;
    }

    public int getIdProyeccion() {
        return idProyeccion;
    }    
    
    public Pelicula getPelicula() {
        return pelicula;
    }

    public String getIdioma() {
        return idioma;
    }

    public boolean isEs3D() {
        return es3D;
    }

    public boolean isSubtitulada() {
        return subtitulada;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public Sala getSala() {
        return sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setEs3D(boolean es3D) {
        this.es3D = es3D;
    }

    public void setSubtitulada(boolean subtitulada) {
        this.subtitulada = subtitulada;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Proyeccion{" + "idProyeccion=" + idProyeccion + ", pelicula=" + pelicula + ", idioma=" + idioma + ", es3D=" + es3D + ", subtitulada=" + subtitulada + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", sala=" + sala + ", precio=" + precio + '}';
    }

  


}
