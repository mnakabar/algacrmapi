package com.algaworks.crm.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    public Cliente(Long id, String nome){
        this.id = id;
        this.nome= nome;
    }

   public Cliente(){

   }

}
