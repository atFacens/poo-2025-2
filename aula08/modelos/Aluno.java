package modelos;

public class Aluno extends Pessoa {

    @Override
    public void apresentar() {
        System.out.println("Sou um aluno");
    }

    @Override
    public void cumprimentar() {
       System.out.println("Sou um aluno. Boa noite!");
    }
}
