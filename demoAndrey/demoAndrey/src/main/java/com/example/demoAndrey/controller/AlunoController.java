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

}

