package com.salesianos.triana.dam.Ejercicio1;

import javax.persistence.*;

@Entity
@Table(name="COUNTRY")
public class Pais {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Basic(optional=false)
    @Column(name="NAME")
    private String nombre;
}
