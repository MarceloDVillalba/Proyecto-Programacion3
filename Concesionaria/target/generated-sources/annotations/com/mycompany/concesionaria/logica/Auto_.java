package com.mycompany.concesionaria.logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-02T17:54:55", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Auto.class)
public class Auto_ extends Vehiculo_ {

    public static volatile SingularAttribute<Auto, String> tipoTransmision;
    public static volatile SingularAttribute<Auto, String> tipoMotor;
    public static volatile SingularAttribute<Auto, Integer> numeroPuertas;

}