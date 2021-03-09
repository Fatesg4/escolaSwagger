package com.edivan.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edivan.swagger.entity.Curso;

@Repository
public interface CursoDao extends JpaRepository<Curso, Long> {

}
