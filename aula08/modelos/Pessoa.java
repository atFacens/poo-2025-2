package modelos;

public abstract class Pessoa {
    protected String nome;

    // o método definido como abstrato DEVE ser implementado
    // em cada classe que faz herança de Pessoa
    public abstract void apresentar();

    public void cumprimentar() {
        System.out.println("Boa noite!");
    }
}
