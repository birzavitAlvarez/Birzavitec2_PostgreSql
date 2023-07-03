package com.birzavit.Birzavitec2.controller;

import com.birzavit.Birzavitec2.dto.CursoDTO;
import com.birzavit.Birzavitec2.entity.Curso;
import com.birzavit.Birzavitec2.service.CursoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller	
@CrossOrigin
@RequestMapping(path="/api/curso")
public class CursoController {

    @Autowired
	private CursoService cursoService;

	// READ ALL
	@GetMapping("/listar")
	public ResponseEntity<?> readAll(){
		List<Curso> cursos = cursoService.findAll();
		List<CursoDTO> cursosDTO = new ArrayList<>();
		for(Curso curso: cursos) {
			CursoDTO cursoDTO = new CursoDTO 
            (
                curso.getId(),
                curso.getNombre(),
                curso.getCreditos()
            );
			cursosDTO.add(cursoDTO);
		}
		// Map<String,Object> respuesta=new HashMap<>();
		// respuesta.put("status",200);
		// respuesta.put("data", cursosDTO);
		return ResponseEntity.ok(cursosDTO);//(respuesta)
	}
	// // READ BY ID
	@GetMapping("/get/{id}")
	public ResponseEntity<?> read(@PathVariable Integer id) {
		Optional<Curso> cursoOptional = cursoService.findById(id);
		if(!cursoOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		CursoDTO cursoDTO = new CursoDTO
            (
                cursoOptional.get().getId(),
                cursoOptional.get().getNombre(),
                cursoOptional.get().getCreditos()
            );
		// Map<String, Object> respuesta = new HashMap<>();
		// respuesta.put("status", 200);
		// respuesta.put("data", bancoDTO);
		return ResponseEntity.ok(cursoDTO); //(respuesta)
	}
	// CREATE
	@PostMapping("/nuevo")
	public ResponseEntity<?> create(@RequestBody Curso curso){
		cursoService.save(curso);
		Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("status", 200);
		return ResponseEntity.ok(respuesta);
	}
	// UPDATE BY ID
	@PutMapping("/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody Curso curso,@PathVariable Integer id){
		Optional<Curso> cursoOptional= cursoService.findById(id);
		if(!cursoOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		curso.setId(id);
		cursoService.save(curso);
		Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("status", 200);
		return ResponseEntity.ok(respuesta);
	}
	// DELETE BY ID
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		Optional<Curso> cursoOptional= cursoService.findById(id);
		if(!cursoOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		cursoService.deleteById(id);
		Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("status", 200);
		return ResponseEntity.ok(respuesta);
		
	}
    
}
