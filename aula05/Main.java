public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Carlos");

        Dependente d1 = new Dependente("Carlinhos", null);
        Dependente d2 = new Dependente("Aninha", func);

        System.out.println("Funcionário: " + func.getNome());
        System.out.println("Dependente: " + d1.exibir());
        System.out.println("Dependente: " + d2.exibir());
    }
}
