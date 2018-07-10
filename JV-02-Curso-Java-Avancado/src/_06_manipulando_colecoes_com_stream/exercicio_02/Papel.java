package _06_manipulando_colecoes_com_stream.exercicio_02;

public class Papel {

    public enum Cor{
        Branco, Preto, Azul, Amarelo
    }

    private int id;
    private Cor cor;

    public Papel(int id, Cor cor) {
        this.id = id;
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Papel{" +
                "id=" + id +
                ", cor=" + cor +
                '}';
    }
}
