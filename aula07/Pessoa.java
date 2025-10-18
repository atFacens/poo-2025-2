public class Pessoa {
    private String nome;
    private String email;
    
    // polimorfismo: 
    // considera o nome do método e os parâmetros do método

    // sobrecarga de métodos - overload
    public Pessoa() {

    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String exibir() {
        return nome + ", " + email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa: " + getNome() ;
    }
}
