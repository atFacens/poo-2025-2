public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Emerson", "emerson@paduan.dev.br");

        Cliente cliente = new Cliente();
        cliente.setNome("Henrique");

        System.out.println(p2.exibir());
        System.out.println(cliente.exibir());

        System.out.println(cliente);
    }
}
