public class App {
    public static void main(String[] args) {
        // cria (instancia) um objeto do TIPO relógio
        Relogio meuRelogio = new Relogio();

        // meuRelogio.hora = 200;
        meuRelogio.setHora(20);

        meuRelogio.exibirHoraAtual();

        System.out.println("Hora: " + meuRelogio.getHora());
    }
}
