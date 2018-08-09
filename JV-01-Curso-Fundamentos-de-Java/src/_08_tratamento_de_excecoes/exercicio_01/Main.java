package _08_tratamento_de_excecoes.exercicio_01;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        try {
            conta1.depositar(2000);
            conta2.depositar(1000);

            System.out.println(conta1);
            System.out.println(conta2);

            conta1.sacar(500);
            conta2.sacar(500);

            System.out.println(conta1);
            System.out.println(conta2);

            conta1.transferir(1000, conta2);
            conta2.transferir(500, conta1);

            System.out.println(conta1);
            System.out.println(conta2);

//            conta1.depositar(-100);
//            conta1.sacar(90000);
//            conta1.transferir(100000, conta2);

        } catch (SaldoInsuficienteException | ValorInvalidoException e){
            e.printStackTrace();
        }

    }
}
