package com.uff.notas.repository;

import com.uff.notas.model.Professor;

import org.springframework.data.jpa.repository.JpaRepository;

/**
  * ProfessorRepository
  */
 public interface ProfessorRepository extends JpaRepository <Professor, Long> {
 
     
 }
    

