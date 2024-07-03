package com.mycompany.concesionaria.logica;

import javax.persistence.Entity;

@Entity
public class Auto extends Vehiculo{
    private int numeroPuertas;
    private String tipoTransmision;
    private String tipoMotor;

    public Auto() {
    }

    public Auto(int numeroPuertas, String tipoTransmision, String tipoMotor, int idVehiculo, String marca, String modelo, int anio, String color) {
        super(idVehiculo, marca, modelo, anio, color);
        this.numeroPuertas = numeroPuertas;
        this.tipoTransmision = tipoTransmision;
        this.tipoMotor = tipoMotor;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return "Auto{" + "numeroPuertas=" + numeroPuertas + ", tipoTransmision=" + tipoTransmision + ", tipoMotor=" + tipoMotor + '}';
    }

}
