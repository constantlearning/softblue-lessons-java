package _07_classes_abstratas_e_interfaces.exercicio_01;

public class Circulo implements AreaCalculavel {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double areaCalculavel() {
        return Math.PI * Math.pow(this.raio, 2);
    }
}
