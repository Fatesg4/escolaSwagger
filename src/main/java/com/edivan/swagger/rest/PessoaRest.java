package com.edivan.swagger.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edivan.swagger.dao.PessoaDao;
import com.edivan.swagger.entity.Pessoa;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/curso")
@Api(value = "API Rest Curso")
//@CrossOrigin(prigins="*")
public class PessoaRest {
	
	private PessoaDao pessoaDao;
	
	@GetMapping
	@ApiOperation(value = "Retorna uma lista de alunos ou pessoas")
	public List<Pessoa> get(){
		return pessoaDao.findAll();
	}
	
	@PostMapping
	@ApiOperation(value = "Salva ou atualiza um aluno")
	public void post(@RequestBody Pessoa pessoa) {
		pessoaDao.save(pessoa);
	}
	
	@DeleteMapping
	@ApiOperation(value = "Deleta um aluno")
	public void delete(@PathVariable("id") Long id) {
		pessoaDao.deleteById(id);
	}
	
	
}
