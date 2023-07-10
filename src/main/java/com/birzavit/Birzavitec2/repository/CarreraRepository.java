package com.birzavit.Birzavitec2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.birzavit.Birzavitec2.entity.Carrera;
import java.util.List;


@RepositoryRestResource(collectionResourceRel = "carrera", path = "carreras")
public interface CarreraRepository extends PagingAndSortingRepository<Carrera, Integer>,CrudRepository<Carrera, Integer> {
    
    List<Carrera> findByNombre(@Param("nombre") String nombre);

}