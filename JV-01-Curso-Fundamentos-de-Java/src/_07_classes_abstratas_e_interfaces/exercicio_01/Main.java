package _07_classes_abstratas_e_interfaces.exercicio_01;

public class Main {

    public static void main(String[] args) {

        AreaCalculavel circulo = new Circulo(2);
        System.out.println(circulo.areaCalculavel());

        AreaCalculavel quadrado = new Quadrado(2);
        System.out.println(quadrado.areaCalculavel());

        AreaCalculavel retangulo = new Retangulo(4, 2);
        System.out.println(retangulo.areaCalculavel());
    }
}
