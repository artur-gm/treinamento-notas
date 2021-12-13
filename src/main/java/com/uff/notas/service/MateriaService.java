package com.uff.notas.service;

import java.util.List;

import com.uff.notas.model.Materia;
import com.uff.notas.repository.MateriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * MateriaService
 */
@Service
public class MateriaService {

    @Autowired
    private final MateriaRepository mRepository;

    public MateriaService(MateriaRepository mRepository){
        this.mRepository = mRepository;
    }
    
    @Transactional
    public void salvaMateria(Materia materia) {
        mRepository.save(materia);
    }

    public List<Materia> materiaList() {
        List<Materia> materias;
        materias = mRepository.findAll();
        return materias;
    }

    public void deletaMateria(Long idMateria) {
        mRepository.deleteById(idMateria);        
    }

    public Materia getMateria(Long idMateria) {
        if (mRepository.existsById(idMateria)){
            return mRepository.findById(idMateria).get();
        }
        return null;
    }
    

    
}