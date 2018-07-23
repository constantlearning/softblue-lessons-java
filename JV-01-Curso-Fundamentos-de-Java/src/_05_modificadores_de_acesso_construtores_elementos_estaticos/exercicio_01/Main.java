package _05_modificadores_de_acesso_construtores_elementos_estaticos.exercicio_01;

public class Main {

    public static void main(String[] args) {
        Lampada lampada = new Lampada(true);
        lampada.imprimir();
        lampada.desligar();
        lampada.imprimir();
        lampada.ligar();
        lampada.imprimir();
    }
}
