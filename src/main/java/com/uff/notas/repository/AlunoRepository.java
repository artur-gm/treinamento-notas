package com.uff.notas.repository;

import com.uff.notas.model.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * AlunoRepository
 */
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

    
}