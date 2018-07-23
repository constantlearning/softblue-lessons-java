package _07_classes_abstratas_e_interfaces.exercicio_01;

public class Quadrado implements AreaCalculavel {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double areaCalculavel() {
        return lado * lado;
    }
}
