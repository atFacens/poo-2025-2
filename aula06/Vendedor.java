public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome) {
        super(nome);
    }

    public double getComissao() {
        return comissao;
    }
}
