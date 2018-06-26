package _04_classes_e_objetos.exercicio_01.exercicio_04;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private List<Aluno> alunos;

    public Turma() {
        this.alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public double calcularMedia() {

        double media = 0.0;

        for (Aluno aluno : this.alunos) {
            media += aluno.calcularMedia();
        }

        media = media / this.alunos.size();

        return media;
    }
}
