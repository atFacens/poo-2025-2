package br.facens;

import br.facens.dao.AlunoDAO;
import br.facens.model.Aluno;

public class Main {
    public static void main(String[] args) {
        // AlunoDAO.conectarBD();
        // AlunoDAO.criarTabela();

        Aluno aluno = new Aluno(2, "Carlos Silva", null);

        boolean inserido = AlunoDAO.inserir(aluno);

        if(inserido) {
            System.out.println("Aluno inserido no BD");
        } else {
            System.out.println("Erro ao inserir");
        }
    }

    // CRUD = Create, Read, Update, Delete
}