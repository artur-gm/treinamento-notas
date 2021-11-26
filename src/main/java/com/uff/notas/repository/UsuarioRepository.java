package com.uff.notas.repository;

import com.uff.notas.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * UsuarioRepository
 */

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    
}