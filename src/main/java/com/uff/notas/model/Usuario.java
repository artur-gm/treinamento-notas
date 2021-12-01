package com.uff.notas.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="Usuario")
public class Usuario {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idUsuario;

    @Column(name="cpf")
    private String cpf;

    @Column(name="nome")
    private String nome;

    public Usuario (String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public Usuario (){}
    
}
