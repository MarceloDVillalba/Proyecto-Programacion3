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
public class Venta implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    private double precioVenta;
    private Vehiculo vehiculo;
    private Cliente cliente;

    public Venta() {
    }

    public Venta(int id, Date fecha, double precioVenta, Vehiculo vehiculo, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.precioVenta = precioVenta;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
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

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", fecha=" + fecha + ", precioVenta=" + precioVenta + ", vehiculo=" + vehiculo + ", cliente=" + cliente + '}';
    }
}
