package com.edivan.swagger.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edivan.swagger.dao.CursoDao;
import com.edivan.swagger.entity.Curso;

import io.swagger.annotations.ApiOperation;

//	oque o rest é ?
@RestController
// 	Oque ele acessar ?
@RequestMapping("/cursos")
public class CursoRest {
	
	@Autowired
	private CursoDao cursoDao;
	
	// Açoes do CRUD
	@GetMapping
	@ApiOperation(value = "Retorna uma lista de cursos")
	public List<Curso> get(){
		return cursoDao.findAll();
	}
	
	@PostMapping
	@ApiOperation(value = "Salva ou atualiza um curso")
	private void post(@RequestBody Curso curso) {
		cursoDao.save(curso);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Deleta um curso")
	private void delete(@PathVariable("id") Long id) {
		cursoDao.deleteById(id);
	}
}
