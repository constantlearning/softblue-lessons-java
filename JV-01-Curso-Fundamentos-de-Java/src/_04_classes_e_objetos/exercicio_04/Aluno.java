package _04_classes_e_objetos.exercicio_04;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private List<Prova> provas;

    public Aluno() {
        this.provas = new ArrayList<>();
    }

    public void addProva(Prova prova){
        this.provas.add(prova);
    }

    public double calcularMedia() {

        Double media = 0.0;

        for (Prova prova : this.provas) {
            media += prova.calcularNotaTotal();
        }

        media = media / this.provas.size();

        return media;
    }
}
