package com.portfolio.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "habilidades")
public class Habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "porcentaje")
    private int porcentaje;
    @Column(name = "esidioma")
    private boolean esidioma;

    public Habilidad() {
    }

    public Habilidad(Long id, String nombre, int porcentaje, boolean esidioma) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.esidioma = esidioma;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public boolean isEsidioma() {
        return esidioma;
    }

    public void setEsidioma(boolean esidioma) {
        this.esidioma = esidioma;
    }
    
}
