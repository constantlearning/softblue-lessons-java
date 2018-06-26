package _04_classes_e_objetos.exercicio_01.exercicio_03;

public class Triangulo {

    private double base;

    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return this.base * this.altura / 2;
    }
}
