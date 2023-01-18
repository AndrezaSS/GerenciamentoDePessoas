package com.example.springboot.controller;

import com.example.springboot.model.Pessoa;
import com.example.springboot.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    @RequestMapping("/pessoas")
    public ResponseEntity<List<Pessoa>> buscaPessoas() {
        return ResponseEntity.ok(pessoaService.buscaPessoas());
    }

    @GetMapping("/pessoas/{id}")
    public ResponseEntity<?> buscaPessoaPorId(@PathVariable Long id) {

        Optional<Pessoa> pessoa = pessoaService.buscaPessoaPorId(id);

        if (pessoa.isPresent()) {
            return ResponseEntity.ok(pessoa.get());
        }
        return ResponseEntity.ok().body("Id do cliente não encontrado");

    }

    @PostMapping
    @RequestMapping("/pessoa")
    public ResponseEntity<Pessoa> inserePessoa(@RequestBody Pessoa pessoa) {
        return ResponseEntity.ok(pessoaService.inserePessoa(pessoa));

    }

    @PutMapping("/alterapessoa/{id}")
    public ResponseEntity<Pessoa> alteraPessoa(@RequestBody Pessoa pessoa) {
        return ResponseEntity.ok(pessoaService.alteraPessoa(pessoa));
    }

}