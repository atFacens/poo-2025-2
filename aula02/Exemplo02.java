import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        // declara um 'recurso' para ler o teclado
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um valor inteiro:");
        // lê do teclado um valor inteiro e armazena na variável numero
        numero = teclado.nextInt();

        System.out.println("Você digitou: " + numero);

        teclado.close();
    }
}
