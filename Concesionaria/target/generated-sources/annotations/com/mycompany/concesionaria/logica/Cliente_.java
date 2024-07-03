package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.logica.Vehiculo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-02T17:54:55", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apellido;
    public static volatile SingularAttribute<Cliente, Integer> id;
    public static volatile SingularAttribute<Cliente, Vehiculo[]> vehiculo;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, Integer> dni;
    public static volatile SingularAttribute<Cliente, String> email;

}