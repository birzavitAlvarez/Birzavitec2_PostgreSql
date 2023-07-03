package com.birzavit.Birzavitec2.entity;

import jakarta.persistence.*;

@Entity
@Table(name="cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="idcurso", nullable = false)
    private Integer id;

    @Column(name = "nombrecurso", nullable=false,length=40)
    private String nombre;

    @Column(name = "creditoscurso")
    private Integer creditos;

    public Curso() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    
    
}
