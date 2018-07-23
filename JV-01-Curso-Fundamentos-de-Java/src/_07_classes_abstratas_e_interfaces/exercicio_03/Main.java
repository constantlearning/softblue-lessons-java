package _07_classes_abstratas_e_interfaces.exercicio_03;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Porta porta = new Porta(3, 1.5);
        porta.abrir();
        porta.fechar();
        System.out.println(porta);

        Porta clone = (Porta) porta.clone();
        System.out.println(clone);

        System.out.println("Is the same object? " + (porta == clone));
        System.out.println("The objects have the same values? " + porta.equals(clone));
    }
}
