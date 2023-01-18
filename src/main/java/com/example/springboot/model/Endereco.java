package com.example.springboot.model;

import jakarta.persistence.*;


@Embeddable
public class Endereco {

    @Column(name = "logadouro")
    private String logadouro;

    @Column(name = "cep")
    private int cep;

    @Column(name = "numero")
    private int numero;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "principal")
    private boolean principal;

    public Endereco(String logadouro, int cep, int numero, String cidade, boolean principal) {
        this.logadouro = logadouro;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
        this.principal = principal;
    }

    public Endereco() {
    }
    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }


}



