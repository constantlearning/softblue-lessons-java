package _04_classes_e_objetos.exercicio_01.exercicio_01;

public class Main {

    public static void main(String[] args) {

        Relogio relogio = new Relogio();
        relogio.acertarRelogio(3, 25, 50);
        System.out.println(relogio.mostrarHoras());
        System.out.println("Ponteiros: \n" + relogio.mostrarPonteiros());
    }
}
