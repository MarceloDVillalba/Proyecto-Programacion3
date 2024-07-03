package com.mycompany.concesionaria.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Compra implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    private double precioCompra;
    private Vehiculo vehiculo;

    public Compra() {
    }

    public Compra(int id, Date fecha, double precioCompra, Vehiculo vehiculo) {
        this.id = id;
        this.fecha = fecha;
        this.precioCompra = precioCompra;
        this.vehiculo = vehiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", fecha=" + fecha + ", precioCompra=" + precioCompra + ", vehiculo=" + vehiculo + '}';
    }
}
