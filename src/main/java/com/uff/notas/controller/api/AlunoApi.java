package com.uff.notas.controller.api;

import com.uff.notas.model.Aluno;
import com.uff.notas.repository.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/aluno")
public class AlunoApi {
    
    @Autowired
    AlunoRepository aRepository;
    
    @DeleteMapping(value = "/{id}")
    public void deletaAluno(@PathVariable("id") long idAluno){

        aRepository.deleteById(idAluno);

    }

    @PostMapping
    public Long novoAluno(@RequestBody Aluno aluno){

        aRepository.save(aluno);
        Long idAlunoCriado = aluno.getIdUsuario();

        return idAlunoCriado;
    }


    @PatchMapping
    public Aluno atualizaAluno(@RequestBody Aluno aluno){
        aRepository.findById(aluno.getIdUsuario());

        return aRepository.save(aluno);
    }
    
}
