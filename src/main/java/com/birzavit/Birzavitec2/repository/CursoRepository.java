package com.birzavit.Birzavitec2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.birzavit.Birzavitec2.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository <Curso, Integer>{
    
}
