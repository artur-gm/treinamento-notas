package com.uff.notas.model;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="Materia")
public class Materia {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long idMateria;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;
    
}
