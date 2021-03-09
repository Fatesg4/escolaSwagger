package com.edivan.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edivan.swagger.entity.Disciplina;

@Repository
public interface DisciplinaDao extends JpaRepository<Disciplina, Long> {

}
