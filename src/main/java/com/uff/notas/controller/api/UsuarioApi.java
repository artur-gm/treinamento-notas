package com.uff.notas.controller.api;

import java.util.HashMap;
import java.util.Map;

import com.uff.notas.model.Usuario;
import com.uff.notas.repository.UsuarioRepository;
import com.uff.notas.service.UsuarioService;

import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/usuario")
public class UsuarioApi {
    
    @Autowired 
    private UsuarioRepository uRepository;

    @Autowired
    private UsuarioService uService;

    @DeleteMapping(value = "/{id}")
    public void deletaUsuario(@PathVariable("id") long idUsuario){

        uService.deletaUsuario(idUsuario);

    }

    @PostMapping
    public Long novoUsuario(@RequestBody Usuario usuario){

        uRepository.save(usuario);
        Long idUsuarioCriado = usuario.getIdUsuario();

        return idUsuarioCriado;
    }


    @PatchMapping
    public Usuario atualizaUsuario(@RequestBody Usuario usuario){
        uRepository.findById(usuario.getIdUsuario());

        return uRepository.save(usuario);
    }

    @GetMapping
    public boolean isUp(){
        return true;
    }

    
}
