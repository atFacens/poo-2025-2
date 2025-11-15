import java.util.ArrayList;
import java.util.List;

public class Exemplo2 {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente(0, "Marcos"));
        clientes.add(new Cliente(1, "Ana"));
        clientes.add(new Cliente(2, "Carlos"));
        clientes.add(new Cliente(3, "Maria"));

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
        }
    }
}
