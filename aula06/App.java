public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("nome funcionario");
        Vendedor v = new Vendedor("nome vendedor");
        Diretor d = new Diretor("nome diretor");
        DiretorGeral g = new DiretorGeral("nome diretor geral");

        f.getNome();
        v.getNome();
        d.getNome();
        g.getNome();
    }
}
