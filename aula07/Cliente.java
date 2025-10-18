public class Cliente extends Pessoa {
    

    // polimorfismo: sobrescrita - override
    public String exibir() {
        return "Cliente: " + getNome() ;
    }

    @Override
    public String toString() {
        return "Cliente: " + getNome() ;
    }
}
