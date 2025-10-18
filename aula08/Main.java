import modelos.Aluno;
import modelos.Pessoa;
import modelos.Professor;

public class Main {
    public static void main(String[] args) {
        // Pessoa pessoa = new Pessoa();
        // Aluno aluno = new Aluno();
        // Professor professor = new Professor();
        // Pessoa pessoa = new Aluno();
        // Pessoa pessoa2 = new Professor();
        // aluno.cumprimentar();
        // professor.cumprimentar();

        Pessoa pessoas[] = new Pessoa[4];

        pessoas[0] = new Aluno();
        pessoas[1] = new Professor();
        pessoas[2] = new Aluno();
        pessoas[3] = new Professor();

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].apresentar();
        }

    }
}
