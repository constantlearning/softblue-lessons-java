package _08_tratamento_de_excecoes.exercicio_01;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
