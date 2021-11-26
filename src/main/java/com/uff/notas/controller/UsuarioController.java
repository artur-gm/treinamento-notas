package com.uff.notas.controller;

import com.uff.notas.model.Usuario;
import com.uff.notas.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("")
    public String index(){
        return "usuario/lista";
    }

    @GetMapping(value = "/new")
    public String create(Model model){
        model.addAttribute("usuario", new Usuario());
        return "usuario/new";
    }

    @PostMapping(value = "/validate")
    public String validateForm(@RequestBody Usuario usuario, BindingResult result){
        if(result.hasErrors()){
            return "usuario/new";
        }
        usuarioRepository.save(usuario);
        return "redirect:/";
    }

    
}
