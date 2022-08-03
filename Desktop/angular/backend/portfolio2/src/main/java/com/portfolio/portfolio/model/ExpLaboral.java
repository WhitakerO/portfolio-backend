package com.portfolio.portfolio.model;

import javax.persistence.*;

@Entity
@Table(name = "explaboral")
public class ExpLaboral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "linkimg")
    private String linkimg;
    @Column(name = "fechainicio")
    private String fechainicio;
    @Column(name = "fechafin")
    private String fechafin;

    public ExpLaboral() {
    }

    public ExpLaboral(Long id, String titulo, String descripcion, String linkimg, String fechainicio, String fechafin) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.linkimg = linkimg;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLinkimg() {
        return linkimg;
    }

    public void setLinkimg(String linkimg) {
        this.linkimg = linkimg;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

}
