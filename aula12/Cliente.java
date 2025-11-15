public class Cliente {
    private int cod;
    private String nome;
    
    public Cliente() {
    }

    public Cliente(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return cod + ": " + nome;
    }
}