package com.uff.notas.model;

import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "Aluno")
public class Aluno extends Usuario {
    //TODO: Relations


    @OneToMany(mappedBy = "aluno")
    private Set<Nota> notas;

    @ManyToOne
    @JoinColumn(name="turma_id")
    private Turma turma;
    
}
