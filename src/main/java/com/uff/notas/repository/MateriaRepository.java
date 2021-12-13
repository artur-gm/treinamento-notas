package com.uff.notas.repository;

import com.uff.notas.model.Materia;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * MateriaRepository
 */
public interface MateriaRepository extends JpaRepository<Materia, Long>{

    
}