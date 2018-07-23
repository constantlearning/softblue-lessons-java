package _07_classes_abstratas_e_interfaces.exercicio_02;

public class Main {

    public static void main(String[] args) {

        ContaBancaria contaCorrente = new ContaCorrente();
        try{
            contaCorrente.depositar(1100.00);
            contaCorrente.sacar(100);
            System.out.println("Saldo Conta Corrente: " + contaCorrente.calcularSaldo());

        } catch (BancoException e){
            System.out.println(e.getMessage());
        }

        ContaBancaria contaInvestimento = new ContaInvestimento();
        try {
            contaInvestimento.depositar(1100);
            contaInvestimento.sacar(100);
            System.out.println("Saldo Conta Investimento: " + contaInvestimento.calcularSaldo());
        } catch (BancoException e) {
            System.out.println(e.getMessage());
        }

    }
}
