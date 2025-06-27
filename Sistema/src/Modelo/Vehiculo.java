package Modelo;

import java.text.DecimalFormat;

public class Vehiculo {
    private int idVehiculo;
    private String placa;
    private String marca; 
    private int modelo;
    private String tipoVehiculo;
    private Propietario propietario;

    public Vehiculo(int idVehiculo, String placa, String marca, int modelo, String tipoVehiculo, Propietario propietario) {
        this.idVehiculo = idVehiculo;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
        this.propietario = propietario;
    }

    public Vehiculo() {
        this.idVehiculo = 0;
        this.placa = "";
        this.marca = "";
        this.modelo = 0;
        this.tipoVehiculo = "";
        this.propietario = new Propietario();
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
    
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipo_vehiculo) {
        this.tipoVehiculo = tipo_vehiculo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    @Override 
    public String toString() { 
        return "\nPlaca: " + placa + 
               "\nMarca: " + marca + 
               "\nModelo: " + modelo + 
               "\nTipo de Vehiculo: " + tipoVehiculo + 
               "\nPropietario: " + propietario;
    }
}
    