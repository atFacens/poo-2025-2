package model.humanos;

public class Pessoa {
    protected String nome;
    private static int numeroPessoas;

    public Pessoa() {
        numeroPessoas++;
    }

    public void quemSouEu() {
        System.out.println("Sou uma pessoa.");
    }

    public static void queClasseSou() {
        System.out.println("Pessoa");
    }

    public static int getNumeroPessoas() {
        return numeroPessoas;
    }
}
