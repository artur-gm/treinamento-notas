package com.uff.notas.controller;

import java.util.Optional;

import com.uff.notas.model.Materia;
import com.uff.notas.repository.MateriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/materia")
public class MateriaController {

    @Autowired
    MateriaRepository materiaRepository;

    
    @GetMapping("")
    public String lista(Model model){
        model.addAttribute("materias", materiaRepository.findAll());
        return "materia/lista";
    }

    @GetMapping(value = "/new")
    public String create(Model model){
        model.addAttribute("materia", new Materia());
        return "materia/new";
    }

    
    @GetMapping(value = "/{id}/edit")
    public String edit(@PathVariable("id") long id, Model model){
        Optional<Materia> uOptional = materiaRepository.findById(id);
        model.addAttribute("materia", uOptional.get());

        return "materia/edit";
    }
    
}
