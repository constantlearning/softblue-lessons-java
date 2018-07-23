package _06_heranca_e_polimorfismo.exercicio_02;

public class Main {

    public static void main(String[] args) {

        Veiculo automovel = new Automovel();
        automovel.ligar();
        automovel.desligar();
        System.out.println(automovel.isLigado());

        Veiculo motocicleta = new Motocicleta();
        motocicleta.desligar();
        motocicleta.ligar();
        System.out.println(motocicleta.isLigado());

        Veiculo onibus = new Onibus();
        onibus.ligar();
        onibus.desligar();
        System.out.println(onibus.isLigado());
    }
}
