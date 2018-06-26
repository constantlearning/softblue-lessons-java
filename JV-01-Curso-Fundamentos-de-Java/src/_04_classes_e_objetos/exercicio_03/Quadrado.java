package _04_classes_e_objetos.exercicio_03;

public class Quadrado {

    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.pow(this.lado, 2);
    }
}
