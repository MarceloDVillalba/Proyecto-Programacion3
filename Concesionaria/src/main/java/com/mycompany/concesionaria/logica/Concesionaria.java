package com.mycompany.concesionaria.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Concesionaria implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int sucursal;
    private String nombre;
    private String direccion;
    private String telefono;

    public Concesionaria() {
    }

    public Concesionaria(int sucursal, String nombre, String direccion, String telefono) {
        this.sucursal = sucursal;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "sucursal=" + sucursal + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    
}
