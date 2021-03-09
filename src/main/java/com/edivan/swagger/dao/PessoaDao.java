package com.edivan.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edivan.swagger.entity.Pessoa;

@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Long>{

}
