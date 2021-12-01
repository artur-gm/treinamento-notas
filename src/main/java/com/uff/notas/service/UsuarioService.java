package com.uff.notas.service;

import com.uff.notas.model.Usuario;
import com.uff.notas.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private final UsuarioRepository uRepository;

    public UsuarioService(UsuarioRepository uRepository){
        this.uRepository = uRepository;
    }

    @Transactional
    public void salvaUsuario(Usuario usuario) {
        uRepository.save(usuario);
    }

    public List<Usuario> usuarioList() {
        List<Usuario> usuarios;
        usuarios = uRepository.findAll();
        return usuarios;
    }

    public void deletaUsuario(Long idUsuario) {
        uRepository.deleteById(idUsuario);        
    }

}