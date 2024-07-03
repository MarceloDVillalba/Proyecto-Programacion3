package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    public void comprarAuto(String marca, String modelo, int anio, String color, int numeroPuertas, String tipoTransmision, String tipoMotor) {
        Auto auto = new Auto();
        
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setAnio(anio);
        auto.setColor(color);
        auto.setNumeroPuertas(numeroPuertas);
        auto.setTipoTransmision(tipoTransmision);
        auto.setTipoMotor(tipoMotor);
        
        controlPersis.agregarAuto(auto);
    }

    public void comprarMoto(String marca, String modelo, int anio, String color, int cilindrada) {
        Moto moto = new Moto();
        
        moto.setMarca(marca);
        moto.setModelo(modelo);
        moto.setAnio(anio);
        moto.setColor(color);
        moto.setCilindrada(cilindrada);
        
        controlPersis.agregarMoto(moto);
    }


    public List<Auto> traerAutos() {
        return controlPersis.traerAutos();
    }

    public List<Moto> traerMotos() {
        return controlPersis.traerMotos();
    }


    public void borrarAuto(int id) {
        controlPersis.borarAuto(id);
    }
    
    public void borrarMoto(int id) {
        controlPersis.borrarMoto(id);
    }

    public Moto traerMoto(int id) {
        return controlPersis.traerMoto(id);
    }

    public void modificarMoto(Moto moto, String marca, String modelo, int anio, String color, int cilindrada) {
       moto.setModelo(modelo);
       moto.setMarca(marca);
       moto.setAnio(anio);
       moto.setColor(color);
       moto.setCilindrada(cilindrada);
       
       controlPersis.modificarMoto(moto);
       
    }

    public Auto traerAuto(int id) {
        return controlPersis.traerAuto(id);
    }

    public void modificarAuto(Auto auto, String marca, String modelo, int anio, String color, int numeroPuertas, String tipoTransmision, String tipoMotor) {
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setAnio(anio);
        auto.setColor(color);
        auto.setNumeroPuertas(numeroPuertas);
        auto.setTipoTransmision(tipoTransmision);
        auto.setTipoMotor(tipoMotor);
        
        controlPersis.modificarAuto(auto);
    }

    public void compraCliente(String nombre, String apellido, int dni, String telefono, String email) {
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDni(dni);
        cliente.setTelefono(telefono);
        cliente.setEmail(email);
        
        controlPersis.agregarCliente(cliente);
    }


    
    
}
