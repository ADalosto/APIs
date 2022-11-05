package com.example.demoAndrey.repository;

import com.example.demoAndrey.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno,Integer> {
}
