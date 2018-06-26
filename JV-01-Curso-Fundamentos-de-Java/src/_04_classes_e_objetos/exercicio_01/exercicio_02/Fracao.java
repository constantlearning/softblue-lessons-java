package _04_classes_e_objetos.exercicio_01.exercicio_02;

public class Fracao {

    private int numerador;
    private int denominador;

    public Fracao() {
    }

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fracao calcularFracoes(Fracao fracao) {
        Fracao resultado = new Fracao();
        resultado.setNumerador(this.numerador * fracao.getNumerador());
        resultado.setDenominador(this.denominador * fracao.getDenominador());
        return resultado;
    }

    @Override
    public String toString() {
        return numerador + "\n__\n" + denominador;
    }
}
