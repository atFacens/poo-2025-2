package br.facens;

import br.facens.dao.AlunoDAO;
import br.facens.model.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = AlunoDAO.buscarPorId(2);
       
        if(aluno != null) {
            System.out.println(aluno);
        } else {
            System.out.println("Aluno não encontrado");
        }

        Aluno alunoAtualizado = AlunoDAO.atualizarEmail(2, "novo@email.com");
        System.out.println("Aluno Atualizado:");
        System.out.println(alunoAtualizado);
    }

    // CRUD = Create, Read, Update, Delete
}