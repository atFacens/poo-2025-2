package br.facens.model;

public class Aluno {
    private int id;
    private String nome;
    private String email;
    
    public Aluno(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Aluno [id=" + id + ", nome=" + nome + ", email=" + email + "]";
    }

}
