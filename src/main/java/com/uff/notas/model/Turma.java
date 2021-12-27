package com.uff.notas.model;

import javax.persistence.*;

import java.util.Set;

//has many alunos/alunos_notas
//has one professor
public class Turma {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idTurma;

    @Column(name = "identificador")
    private String identificador;

    @OneToMany(mappedBy = "Turma")
    private Set<Aluno> alunos;

    
}
