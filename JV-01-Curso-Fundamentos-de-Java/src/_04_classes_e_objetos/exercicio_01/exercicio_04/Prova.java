package _04_classes_e_objetos.exercicio_01.exercicio_04;

public class Prova {

    private String nomeProva;
    private Double primeiraParteNota;
    private Double segundaParteNota;

    public Prova(String nomeProva, Double primeiraParteNota, Double segundaParteNota) {
        this.nomeProva = nomeProva;
        this.primeiraParteNota = primeiraParteNota;
        this.segundaParteNota = segundaParteNota;
    }

    public Double calcularNotaTotal() {

        double total = primeiraParteNota + segundaParteNota;

        if(total > 10) {
            total = 10;
        }

        return total;
    }
}
