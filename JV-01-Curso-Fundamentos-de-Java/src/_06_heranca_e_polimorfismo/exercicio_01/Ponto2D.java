package _06_heranca_e_polimorfismo.exercicio_01;

public class Ponto2D {

    private int x;
    private int y;

    public Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x +
               ", y = " + y;
    }
}
