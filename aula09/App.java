import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Carro carro = new Carro();
        // Navio navio = new Navio();

        // carro.mover();
        // navio.mover();

        // Movimento carro = new Carro();
        // Movimento navio = new Navio();

        List<Movimento> transportes =new ArrayList<>();

        transportes.add(new Carro());
        transportes.add(new Navio());
        transportes.add(new Carro());
        transportes.add(new Aviao());

        for (Movimento transporte : transportes) {
            transporte.mover();
        }

    }
}
