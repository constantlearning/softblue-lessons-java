package _07_classes_abstratas_e_interfaces.exercicio_03;

public class Porta implements Cloneable {

    private double altura;
    private double largura;
    private boolean aberta;

    public Porta(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void abrir() {
        this.aberta = true;
    }

    public void fechar() {
        this.aberta = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Porta porta = (Porta) o;

        if (Double.compare(porta.altura, altura) != 0) return false;
        if (Double.compare(porta.largura, largura) != 0) return false;
        return aberta == porta.aberta;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(altura);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(largura);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (aberta ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Porta:{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", aberta=" + aberta +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
