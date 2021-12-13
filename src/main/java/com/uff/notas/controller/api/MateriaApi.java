package com.uff.notas.controller.api;

import com.uff.notas.model.Materia;
import com.uff.notas.repository.MateriaRepository;
import com.uff.notas.service.MateriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/materia")
public class MateriaApi {
    @Autowired
    MateriaRepository mRepository;

    @Autowired
    MateriaService mService;

    
    @DeleteMapping(value = "/{id}")
    public void deletaMateria(@PathVariable("id") long idMateria){

        mService.deletaMateria(idMateria);

    }

    @PostMapping
    public Long novaMateria(@RequestBody Materia materia){

        mRepository.save(materia);
        Long idMateriaCriada = materia.getIdMateria();

        return idMateriaCriada;
    }


    @PatchMapping
    public Materia atualizaMateria(@RequestBody Materia materia){
        mRepository.findById(materia.getIdMateria());

        return mRepository.save(materia);
    }

    @GetMapping
    public boolean isUp(){
        return true;
    }

    
}
