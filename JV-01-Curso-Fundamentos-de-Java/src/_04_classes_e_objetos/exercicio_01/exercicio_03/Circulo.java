package _04_classes_e_objetos.exercicio_01.exercicio_03;

public class Circulo {

    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }
}
