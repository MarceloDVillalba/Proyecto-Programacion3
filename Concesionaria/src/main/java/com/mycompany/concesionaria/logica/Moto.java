package com.mycompany.concesionaria.logica;

import javax.persistence.Entity;

@Entity
public class Moto extends Vehiculo{
    private  int cilindrada;

    public Moto() {
    }

    public Moto(int cilindrada, int idVehiculo, String marca, String modelo, int anio, String color) {
        super(idVehiculo, marca, modelo, anio, color);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" + "cilindrada=" + cilindrada + ", tipoMoto="+ '}';
    }
}
