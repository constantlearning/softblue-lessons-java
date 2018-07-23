package _07_classes_abstratas_e_interfaces.exercicio_02;

public class ContaInvestimento extends ContaBancaria {

    @Override
    public double calcularSaldo() {
        return this.saldo + (this.saldo * 0.05);
    }
}
