package _06_heranca_e_polimorfismo.exercicio_01;

public class Ponto3D extends Ponto2D {

    private int z;

    public Ponto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public String toString() {
        return super.toString() +
        ", z = " + z;
    }
}
