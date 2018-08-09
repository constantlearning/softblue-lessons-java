package _08_tratamento_de_excecoes.exercicio_01;

public class ContaBancaria {

    private double saldo;

    public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {

        validarValor(valor);
        possuiSaldoSuficiente(valor);

        this.saldo = this.saldo - valor;

    }

    public void depositar(double valor) throws ValorInvalidoException {

        validarValor(valor);

        this.saldo += valor;
    }

    public void transferir(double valor, ContaBancaria contaDestino) throws ValorInvalidoException, SaldoInsuficienteException {

        validarValor(valor);
        possuiSaldoSuficiente(valor);

        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    private void possuiSaldoSuficiente(double valor) throws SaldoInsuficienteException {

        if (valor > saldo) {
            throw new SaldoInsuficienteException("Não possui saldo suficiente: " + this.saldo);
        }
    }

    private void validarValor(double valor) throws ValorInvalidoException {

        if (valor < 0) {
            throw new ValorInvalidoException("O valor: " + valor + " é inválido");
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "saldo=" + saldo +
                '}';
    }
}
