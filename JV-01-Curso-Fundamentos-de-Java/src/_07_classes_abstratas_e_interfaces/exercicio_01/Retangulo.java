package _07_classes_abstratas_e_interfaces.exercicio_01;

public class Retangulo implements AreaCalculavel {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double areaCalculavel() {
        return base * altura;
    }
}
