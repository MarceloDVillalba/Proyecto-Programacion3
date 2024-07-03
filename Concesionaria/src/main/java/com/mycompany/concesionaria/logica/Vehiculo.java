package com.mycompany.concesionaria.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Vehiculo implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idVehiculo;
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    public Vehiculo() {
    }

    public Vehiculo(int idVehiculo, String marca, String modelo, int anio, String color) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", color=" + color + '}';
    }
 
}
