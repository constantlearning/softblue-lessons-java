package _04_classes_e_objetos.exercicio_04;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.addProva(new Prova("Prova 1", 4.0, 2.5));
        aluno1.addProva(new Prova("Prova 2", 1.0, 7.0));

        Aluno aluno2 = new Aluno();
        aluno2.addProva(new Prova("Prova 1", 6.5, 3.5));
        aluno2.addProva(new Prova("Prova 2", 0.0, 3.0));

        Aluno aluno3 = new Aluno();
        aluno3.addProva(new Prova("Prova 1", 5.0, 4.0));
        aluno3.addProva(new Prova("Prova 2", 6.0, 1.5));

        Turma turma = new Turma();
        turma.addAluno(aluno1);
        turma.addAluno(aluno2);
        turma.addAluno(aluno3);

        double mediaDaTurma = turma.calcularMedia();
        double mediaAluno1 = aluno1.calcularMedia();
        double mediaAluno2 = aluno2.calcularMedia();
        double mediaAluno3 = aluno3.calcularMedia();

        System.out.println("Média turma: " + mediaDaTurma);
        System.out.println("Média Aluno 1: " + mediaAluno1);
        System.out.println("Média Aluno 2: " + mediaAluno2);
        System.out.println("Média Aluno 3: " + mediaAluno3);
    }
}
