package _04_classes_e_objetos.exercicio_01.exercicio_03;

public class Trapezio {

    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio() {
    }

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double calcularArea() {
        return (this.baseMaior + this.baseMenor) / 2 * this.altura;
    }
}
