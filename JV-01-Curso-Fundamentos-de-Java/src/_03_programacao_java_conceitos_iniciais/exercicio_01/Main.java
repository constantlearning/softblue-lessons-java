package _03_programacao_java_conceitos_iniciais.exercicio_01;

public class Main {

    public static void main(String[] args) {
        double primeiraNota = 8.5;
        double segundaNota = 7.5;
        double terceiraNota = 6.0;
        int primeiroPeso = 3;
        int segundoPeso = 2;
        int terceiroPeso = 5;

        double media = (primeiraNota + segundaNota + terceiraNota) / (primeiroPeso + segundoPeso + terceiroPeso);

        System.out.println(media);

    }
}
