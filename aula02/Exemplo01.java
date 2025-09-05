// comentário de linha

/* 
    atalhos: 
    - main = início da execução do programa
    - sout (print)


 */

public class Exemplo01 {
    public static void main(String[] args) {

        // saída em tela (terminal)
        System.out.println("Boa noite");

        // alguns tipos de dados primivos
        int numero = -12;
        double numero2 = 34.6;
        String nome = "Emerson";
        boolean resposta = true;

        // instrução de desvio condicional
        if(numero >= 0) {
            System.out.println(numero + " é positivo");
        } else {
            System.out.println(numero + " é negativo");
        }

    }
}
