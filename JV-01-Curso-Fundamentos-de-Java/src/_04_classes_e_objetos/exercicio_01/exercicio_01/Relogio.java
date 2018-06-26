package _04_classes_e_objetos.exercicio_01.exercicio_01;

public class Relogio {

    private Ponteiro ponteiroHora;
    private Ponteiro ponteiroMinuto;
    private Ponteiro ponteiroSegundo;

    public Relogio() {
        this.ponteiroHora = new Ponteiro();
        this.ponteiroMinuto = new Ponteiro();
        this.ponteiroSegundo = new Ponteiro();
    }

    public void acertarRelogio(int hora, int minuto, int segundo) {
        definirPonteiroHora(hora);
        definirPonteiroMinuto(minuto);
        definirPonteiroSegundo(segundo);
    }

    private void definirPonteiroSegundo(int segundo) {
        if (secondIsValid(segundo)) {
            this.ponteiroSegundo.setPosicao(segundo);
        }
    }

    private boolean secondIsValid(int segundo) {
        return segundo > 0 && segundo < 60;
    }

    private void definirPonteiroMinuto(int minuto) {
        if (minuteIsValid(minuto) && minuto > 10) {
            this.ponteiroMinuto.setPosicao(minuto / 5);
        } else {
            this.ponteiroMinuto.setPosicao(minuto);
        }
    }

    private boolean minuteIsValid(int minuto) {
        return minuto > 0 && minuto < 60;
    }

    private void definirPonteiroHora(int hora) {
        if (hourIsValid(hora) && hora > 12) {
            this.ponteiroHora.setPosicao(hora / 5);
        } else {
            this.ponteiroHora.setPosicao(hora);
        }
    }

    private boolean hourIsValid(int hora) {
        return hora > 0 && hora < 24;
    }

    public String mostrarHoras() {
        int hour = getHour();
        int minute = getMinute();
        int second = ponteiroSegundo.getPosicao();
        return String.format("%d:%d:%d", hour, minute, second);
    }

    private int getMinute() {
        return this.ponteiroMinuto.getPosicao() * 5;
    }

    private int getHour() {
        return this.ponteiroHora.getPosicao();
    }

    public String mostrarPonteiros() {
        return String.format("Hora: %d, Minuto: %d, Segundo: %d",
                this.ponteiroHora.getPosicao(), this.ponteiroMinuto.getPosicao(), this.ponteiroSegundo.getPosicao());
    }
}
