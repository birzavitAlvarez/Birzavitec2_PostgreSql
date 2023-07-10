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

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id_carrera") //parametro de relación puede ser cualquier nombre
    private Carrera carrera;

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

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

   
    
    
}
