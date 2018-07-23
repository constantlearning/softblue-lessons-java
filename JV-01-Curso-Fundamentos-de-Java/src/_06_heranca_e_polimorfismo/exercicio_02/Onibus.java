package _06_heranca_e_polimorfismo.exercicio_02;

public class Onibus extends Veiculo {

    @Override
    public void ligar() {
        super.ligar();
        System.out.println("Onibus ligado");
    }

    @Override
    public void desligar() {
        super.desligar();
        System.out.println("Onius desligado");
    }
}
