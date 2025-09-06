public class Relogio {
    // atributos = propriedades ou características
    // encapsulamento, esconde os atributos, e preferencialmente usamos private
    private int hora, minuto, segundo;

    // métodos = ações
    public void setHora(int hora) {
        if(hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void exibirHoraAtual() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }
}
