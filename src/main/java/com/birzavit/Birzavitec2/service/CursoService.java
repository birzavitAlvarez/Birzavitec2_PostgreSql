package com.birzavit.Birzavitec2.service;

import java.util.*;

import com.birzavit.Birzavitec2.entity.Curso;

public interface CursoService {
    public List<Curso> findAll();
    public Optional<Curso> findById(Integer id);
	public void save(Curso curso);
	public void deleteById(Integer id);
}
