package com.example.demoAndrey.controller;


import com.example.demoAndrey.model.Aluno;
import com.example.demoAndrey.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alRepo;


    @GetMapping("/todos")
    public List<Aluno> buscarTodos()
    {
        return alRepo.findAll();
    }


    @GetMapping("/buscarPorRa/{ra}")
    public Optional<Aluno> buscarPorRa
    (@PathVariable (value="ra") int ra)
    {
        return alRepo.findById(ra);
    }

    @PostMapping("/inserir")
    public void inserir(@RequestBody Aluno al)
    {
        alRepo.save(al);
    }

    @GetMapping("/porNome/{nome}")
    public List<Aluno> procurarPorNome(@PathVariable(value="nome") String nome)
    {
       return alRepo.findByNome(nome);
    }

    @GetMapping("/porIdade/{idade}")
    public List<Aluno> procurarPorIdade(@PathVariable(value="idade") int idade)
    {
        return alRepo.findByIdade(idade);
    }


    @DeleteMapping("/remover")
    public void removerAluno(@RequestBody Aluno al)
    {
        alRepo.delete(al);
    }

    @DeleteMapping("/removerPorRa/{ra}")
    public void removerPorRa(@PathVariable(value="ra") int ra)
    {
        alRepo.deleteById(ra);
    }


    @PutMapping("/atualizar")
    public void atualizarAluno(@RequestBody Aluno al)
    {
        alRepo.save(al);
    }
}

