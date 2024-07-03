package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Auto;
import com.mycompany.concesionaria.logica.Cliente;
import com.mycompany.concesionaria.logica.Moto;
import com.mycompany.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AutoJpaController autoJpa = new AutoJpaController();
    MotoJpaController motoJpa = new MotoJpaController();
    ClienteJpaController clienteJpa = new ClienteJpaController();
    
    public void agregarAuto(Auto auto) {
       autoJpa.create(auto);
    }

    public void agregarMoto(Moto moto) {
        motoJpa.create(moto);
    }

    public List<Auto> traerAutos() {
        return autoJpa.findAutoEntities();
    }

    public List<Moto> traerMotos() {
        return motoJpa.findMotoEntities();
    }

    public Moto traerMoto(int id) {
        return motoJpa.findMoto(id);
    }

    public void modificarMoto(Moto moto) {
        try {
            motoJpa.edit(moto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Auto traerAuto(int id) {
        return autoJpa.findAuto(id);
    }

    public void modificarAuto(Auto auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borarAuto(int id) {
        try {
            autoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarMoto(int id) {
        try {
            motoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarCliente(Cliente cliente) {
        clienteJpa.create(cliente);
    }
    

    
    
    
    
}
