package com.edivan.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edivan.swagger.entity.MatriculaDisciplinaPessoa;

@Repository
public interface MatriculaDisciplinaPessoaDao extends JpaRepository<MatriculaDisciplinaPessoa, Long>{

}
