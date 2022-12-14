package com.example.agendaalura.dao;

import com.example.agendaalura.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    private final static List<Aluno> alunos = new ArrayList<>();

    public void salva(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> todosNomes() {
        return new ArrayList<>(alunos);
    }
}
