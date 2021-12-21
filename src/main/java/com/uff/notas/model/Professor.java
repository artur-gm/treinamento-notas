package com.uff.notas.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Professor")
public class Professor extends Usuario {

    @OneToOne(mappedBy = "materia")
    private Materia materia;
    
}
