package _04_classes_e_objetos.exercicio_03;

public class Main {

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo();
        triangulo.setBase(10);
        triangulo.setAltura(10);
        double areaTriangulo = triangulo.calcularArea();

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        double areaQuadrado = quadrado.calcularArea();

        Circulo circulo = new Circulo();
        circulo.setRaio(5);
        double areaCirculo = circulo.calcularArea();

        Trapezio trapezio = new Trapezio();
        trapezio.setBaseMaior(3);
        trapezio.setBaseMenor(2);
        trapezio.setAltura(4);
        double areaTrapezio = trapezio.calcularArea();

        System.out.println("AREA");
        System.out.println("Triângulo: " + areaTriangulo);
        System.out.println("Quadrado:" + areaQuadrado);
        System.out.println("Círculo: " + areaCirculo);
        System.out.println("Trapézio: " + areaTrapezio);
    }
}
