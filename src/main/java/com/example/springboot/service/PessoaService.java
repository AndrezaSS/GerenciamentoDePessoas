package com.example.springboot.service;

import com.example.springboot.model.Pessoa;
import com.example.springboot.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository ps;

    @GetMapping
    public List<Pessoa> buscaPessoas() {
        try {
            return ps.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar os clientes");
        }
    }

    @GetMapping
    public Optional<Pessoa> buscaPessoaPorId(Long id) {
        try {
            return ps.findById(id);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar um cliente por id");
        }
    }

    @PostMapping
    public Pessoa inserePessoa(Pessoa pessoa) {
        try {
            return ps.save(pessoa);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar inserir um cliente PF");
        }
    }

    @PutMapping
    public Pessoa alteraPessoa(Pessoa pessoa) {
        try {
            return ps.save(pessoa);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar alterar um cliente PF");
        }
    }
}
