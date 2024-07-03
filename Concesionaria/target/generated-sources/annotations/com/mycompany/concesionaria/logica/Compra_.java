package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.logica.Vehiculo;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-02T17:54:55", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Date> fecha;
    public static volatile SingularAttribute<Compra, Double> precioCompra;
    public static volatile SingularAttribute<Compra, Integer> id;
    public static volatile SingularAttribute<Compra, Vehiculo> vehiculo;

}