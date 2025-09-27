public class Relogio {
    // atributos = propriedades ou características
    // encapsulamento, esconde os atributos, e preferencialmente usamos private
    private int hora, minuto, segundo;

    // métodos = ações

    // método construtor: inicializa os valores dos atributos

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        this.segundo = segundo;
    }

    // sobrecarga: permite um "mesmo" método ter diferentes comportamentos
    // preciso ter pelo menos um parâmetro diferente
    public Relogio() {

    }

    // sobrecarga se aplica a qualquer método da classe
    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public void setHora() {
        this.hora = 0;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto > 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    public String exibirHoraAtual() {
        return hora + ":" + minuto + ":" + segundo;
    }
}
