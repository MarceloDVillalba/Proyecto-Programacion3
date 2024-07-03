package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.logica.Cliente;
import com.mycompany.concesionaria.logica.Vehiculo;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-02T17:54:55", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Cliente> cliente;
    public static volatile SingularAttribute<Venta, Integer> id;
    public static volatile SingularAttribute<Venta, Vehiculo> vehiculo;
    public static volatile SingularAttribute<Venta, Double> precioVenta;

}