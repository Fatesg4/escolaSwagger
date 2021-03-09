package com.edivan.swagger.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data

// oque é ?
@Entity
public class MatriculaDisciplinaPessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Pessoa pessoa;
	
	@ManyToOne
	private Disciplina disciplina;
	
	
}
