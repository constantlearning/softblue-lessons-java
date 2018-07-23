package _06_heranca_e_polimorfismo.exercicio_02;

public class Motocicleta extends Veiculo {

    @Override
    public void ligar() {
        super.ligar();
        System.out.println("Motocicleta ligada");
    }

    @Override
    public void desligar() {
        super.desligar();
        System.out.println("Motocicleta desligada");
    }
}
