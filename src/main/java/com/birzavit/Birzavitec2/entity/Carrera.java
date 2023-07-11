package com.birzavit.Birzavitec2.entity;

import java.util.*;
import jakarta.persistence.*;

@Entity
@Table(name="carrera")
public class Carrera {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable=false,length=40)
    private String nombre;

    @OneToMany(targetEntity = Curso.class, mappedBy = "carrera")
    @OrderBy("nombre ASC")
    private Set<Curso> cursos = new HashSet<Curso>();

    public Carrera() {
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

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

}
