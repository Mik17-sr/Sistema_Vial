package Modelo;

public class Comparendo {
    private int idComparendo;
    private Hora hora;
    private String tipo;
    private Fecha fecha;
    private Vehiculo vehiculo;

    public Comparendo(int idComparendo, Hora hora, String tipo, Fecha fecha, Vehiculo vehiculo) {
        this.idComparendo = idComparendo;
        this.hora = hora;
        this.tipo = tipo;
        this.fecha = fecha;
        this.vehiculo = vehiculo;
    }

    public Comparendo() {
        this.idComparendo = 0;
        this.hora = new Hora();
        this.tipo = "";
        this.fecha = new Fecha();
        this.vehiculo = new Vehiculo();
    }

    public int getIdComparendo() {
        return idComparendo;
    }

    public void setIdComparendo(int idComparendo) {
        this.idComparendo = idComparendo;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Comparendo\nID Comparendo: " + idComparendo + 
               "\nHora: " + hora + 
               "\nTipo: " + tipo + 
               "\nFecha: " + fecha + 
               "Vehiculo: " + vehiculo;
    }
    
    
    
    
}
