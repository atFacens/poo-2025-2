public class App {
    public static void main(String[] args) {
        // cria (instancia) um objeto do TIPO relógio
        Relogio meuRelogio = new Relogio(142, 45, 12);
        Relogio relogio2 = new Relogio();

        // meuRelogio.hora = 200;
        // meuRelogio.setHora(20);
        // meuRelogio.setMinuto(11);

        String horaAtual = meuRelogio.exibirHoraAtual();
        System.out.println("relógio 1: " + horaAtual);

        System.out.println("relógio 2: " + relogio2.exibirHoraAtual());

        // System.out.println("Hora: " + meuRelogio.getHora());
    }
}
