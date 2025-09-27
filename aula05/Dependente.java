public class Dependente {
    private String nome;
    private Funcionario funcionario;

    public Dependente(String nome, Funcionario funcionario) {
        this.nome = nome;
        this.funcionario = funcionario;
        // if (funcionario != null) {
        //     this.funcionario = funcionario;
        // } else {
        //     this.funcionario = new Funcionario("Não cadastrado");
        // }
    }

    public String getNome() {
        return nome;
    }

    public String getFuncionario() {
        try {
            return funcionario.getNome();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return "Não cadastrado";
        }
    }

    public String exibir() {
        return getNome() + ": " + getFuncionario();
    }
}
