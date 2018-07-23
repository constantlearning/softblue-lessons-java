package _07_classes_abstratas_e_interfaces.exercicio_02;

public abstract class ContaBancaria {

    protected double saldo;

    public abstract double calcularSaldo();

    public void depositar(double valor) throws BancoException {

        if (!quantiaValida(valor)) {
            throw new BancoException("A quantia " + valor + " é inválida para depósito.");
        }

        this.saldo += valor;

    }

    public void sacar(double valor) throws BancoException {

        if (!quantiaValida(valor) || !contaPossuiSaldo(valor)) {
            throw new BancoException("Não é possível realizar o saque do valor " + valor +
                    " valor disponível na conta: " + this.saldo);
        }

        this.saldo -= valor;
    }

    public void transferir(double valor, ContaBancaria contaDestino) throws BancoException {

        if (!quantiaValida(valor) || !contaPossuiSaldo(valor)) {
            throw new BancoException("Não é possível realizar o saque do valor " + valor +
                    " valor disponível na conta: " + this.saldo);
        }

        sacar(valor);
        contaDestino.depositar(valor);
    }

    private boolean contaPossuiSaldo(double valor) {
        return valor <= this.saldo;
    }

    private boolean quantiaValida(double valor) {
        return valor > 0;
    }

}
