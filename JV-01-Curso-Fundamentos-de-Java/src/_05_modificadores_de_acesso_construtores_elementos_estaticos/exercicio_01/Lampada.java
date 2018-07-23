package _05_modificadores_de_acesso_construtores_elementos_estaticos.exercicio_01;

public class Lampada {

    private boolean ligada;

    public Lampada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void imprimir() {

        if (this.ligada) {
            System.out.println("Lâmpada ligada");
        } else {
            System.out.println("Lâmpada desligada");
        }
    }
}
