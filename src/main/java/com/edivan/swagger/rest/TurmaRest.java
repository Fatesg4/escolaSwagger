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

import com.edivan.swagger.dao.TurmaDao;
import com.edivan.swagger.entity.Turma;

import io.swagger.annotations.ApiOperation;

// oque é rest ?
@RestController
// oque ela faz ?
@RequestMapping("/turma")
public class TurmaRest {
	
	@Autowired
	private TurmaDao turmaDao;

	// CRUD
	
	@GetMapping
	@ApiOperation(value = "Retorna uma lista de turma")
	public List<Turma> get(){
		return turmaDao.findAll();
	}
	
	@PostMapping
	@ApiOperation(value = "Salva ou atualiza uma turma")
	public void post(@RequestBody Turma turma) {
		turmaDao.save(turma);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Deleta uma turma")
	public void delete(@PathVariable("id") Long id) {
		turmaDao.deleteById(id);
	}
	
}
