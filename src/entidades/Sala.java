package entidades;


public class Sala {
    private int idSala = -1;    
    private int NroSala;
    private boolean apta3D;
    private int capacidad;
    private boolean estado;

    public Sala() {
    }

    public Sala(int NroSala, boolean apta3D, int capacidad, boolean estado) {
        this.NroSala = NroSala;
        this.apta3D = apta3D;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getNroSala() {
        return NroSala;
    }

    public void setNroSala(int NroSala) {
        this.NroSala = NroSala;
    }

    public boolean isApta3D() {
        return apta3D;
    }

    public void setApta3D(boolean apta3D) {
        this.apta3D = apta3D;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
    @Override
    public String toString() {
        return "Sala{" + "NroSala=" + NroSala + ", capacidad=" + capacidad + ", estado=" + estado + '}';
    }

    

}
