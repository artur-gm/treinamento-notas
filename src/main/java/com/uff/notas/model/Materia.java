package com.uff.notas.model;

import java.util.Set;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "professor_id")
    private Professor professor;
    
    @OneToMany(mappedBy = "materia")
    private Set<Nota> notas;

    //TODO: Validations
    
}
