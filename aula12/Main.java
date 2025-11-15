public class Main {

    public static void main(String[] args) {
        Cliente clientes[];

        // System.out.println(clientes);
        clientes = new Cliente[5];


        for (int i = 0; i < clientes.length; i++) {
            
            clientes[i] = new Cliente(i, "cliente " + (i+1));

            System.out.println(clientes[i]);
        }

    }
}
