package com.edivan.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edivan.swagger.entity.Turma;

@Repository
public interface TurmaDao extends JpaRepository<Turma, Long> {

}
