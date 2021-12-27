package com.uff.notas.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="nota")
public class Nota {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long idNota;

    @ManyToOne
    @JoinColumn(name="aluno_id")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name="materia_id")
    private Materia materia;
    
}
