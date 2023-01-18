package com.example.springboot.model;
import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Objects;


@Entity
@DynamicUpdate
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "dataNascimento")
   private String dataNascimento;

    public Pessoa(Long id, String nome, String dataNascimento, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public Pessoa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Embedded
    private Endereco endereco;

}


