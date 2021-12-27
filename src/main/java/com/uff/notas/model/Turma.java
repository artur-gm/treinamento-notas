package com.uff.notas.model;

import javax.persistence.*;

import java.util.Set;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//has many alunos/alunos_notas
//has one professor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="turma")
public class Turma {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idTurma;

    @Column(name = "identificador")
    private String identificador;

    @OneToMany(mappedBy = "turma")
    private Set<Aluno> alunos;

    
}
