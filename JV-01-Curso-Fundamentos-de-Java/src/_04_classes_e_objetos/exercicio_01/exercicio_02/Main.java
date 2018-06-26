package _04_classes_e_objetos.exercicio_01.exercicio_02;

public class Main {

    public static void main(String[] args) {
        Fracao fracao = new Fracao(2,3);
        Fracao resultado = fracao.calcularFracoes(new Fracao(3,4));
        System.out.println(resultado);
    }
}
