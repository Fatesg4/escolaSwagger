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

import com.edivan.swagger.dao.DisciplinaDao;
import com.edivan.swagger.entity.Disciplina;

import io.swagger.annotations.ApiOperation;

// oque é rest ?
@RestController
// oque faz ?
@RequestMapping("/disciplina")
public class DisciplinaRest {
	
	@Autowired
	private DisciplinaDao disciplinaDao;
	
	// GRUD
	
	@GetMapping
	@ApiOperation(value = "Retorna uma lista de disciplinas")
	public List<Disciplina> get(){
		return disciplinaDao.findAll();
	}
	
	@PostMapping
	@ApiOperation(value = "Salva ou atualiza uma disciplina")
	public void post (@RequestBody Disciplina disciplina) {
		disciplinaDao.save(disciplina);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Deleta uma disciplina")
	public void delete (@PathVariable("id") Long id) {
		disciplinaDao.deleteById(id);
	}
}
