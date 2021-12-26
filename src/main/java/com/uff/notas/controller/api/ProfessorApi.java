package com.uff.notas.controller.api;

import com.uff.notas.model.Professor;
import com.uff.notas.repository.ProfessorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ProfessorApi
 */
@RestController
@RequestMapping("api/professor")
public class ProfessorApi {

    @Autowired
    ProfessorRepository pRepository;
   
    @DeleteMapping(value = "/{id}")
    public void deletaProfessor(@PathVariable("id") long idProfessor){

        pRepository.deleteById(idProfessor);

    }

    // @PostMapping
    // public Long novoProfessor(@RequestBody Professor professor){

    //     pRepository.save(professor);
    //     Long idProfessorCriado = professor.getIdUsuario();

    //     return idProfessorCriado;
    // }
    
    @PostMapping
    public Professor novoProfessor(@RequestBody Professor professor){

        pRepository.save(professor);
        Long idProfessorCriado = professor.getIdUsuario();

        return professor;
    }


    @PatchMapping
    public Professor atualizaProfessor(@RequestBody Professor professor){
        pRepository.findById(professor.getIdUsuario());

        return pRepository.save(professor);
    }

    
}   
