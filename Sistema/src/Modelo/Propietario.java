package Modelo;

public class Propietario {
    private int idPropietario;
    private String nombre;
    private String identificacion;
    private String correo;

    public Propietario(int idPropietario, String nombre, String identificacion, String correo) {
        this.idPropietario = idPropietario;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
    }

    public Propietario() {
        this.idPropietario = 0;
        this.nombre = "";
        this.identificacion = "";
        this.correo = "";
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "\nID Propietario: " + idPropietario + 
               "\nNombre: " + nombre + 
               "\nIdentificacion: " + identificacion + 
               "\nCorreo: " + correo;
    }
    
    
    
    
}
