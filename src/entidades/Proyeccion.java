package entidades;

import java.time.LocalTime;


public class Proyeccion {
private int idProyeccion;
private int idPelicula;
private String idioma;
private boolean es3D;
private boolean subtitulada;
private LocalTime horaInicio;
private LocalTime horaFin;
private int idSala;
private double precio;

public Proyeccion(){}

    public Proyeccion(int idPelicula, String idioma, boolean es3D, boolean subtitulada, LocalTime horaInicio, LocalTime horaFin, int idSala, double precio) {
        int idProyeccion = -1;
        this.idPelicula = idPelicula;
        this.idioma = idioma;
        this.es3D = es3D;
        this.subtitulada = subtitulada;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.idSala = idSala;
        this.precio = precio;
    }

    public int getIdProyeccion() {
        return idProyeccion;
    }    
    
    public int getIdPelicula() {
        return idPelicula;
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

    public int getIdSala() {
        return idSala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
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

    public void setSala(int idSala) {
        this.idSala = idSala;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Proyeccion{" + "idProyeccion=" + idProyeccion + ", idPelicula=" + idPelicula + ", idioma=" + idioma + ", es3D=" + es3D + ", subtitulada=" + subtitulada + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", idSala=" + idSala + ", precio=" + precio + '}';
    }

  


}
