package _05_modificadores_de_acesso_construtores_elementos_estaticos.exercicio_02;

public class Main {

    public static void main(String[] args) {

        Data d1 = new Data(2000, 3, 10, 10, 30, 10);
        Data d2 = new Data(2000, 6, 15, 23, 15, 20);
        Data d3 = new Data(2005, 10, 5);

        try {
            d1.imprimir(Data.FORMATO_12H); // 10/3/2000 10:30:10 AM
            d1.imprimir(Data.FORMATO_24H); // 10/3/2000 10:30:10
            d2.imprimir(Data.FORMATO_12H); // 15/6/2000 11:15:20 PM
            d2.imprimir(Data.FORMATO_24H); // 15/6/2000 23:15:20
            d3.imprimir(Data.FORMATO_12H); // 5/10/2005
            d3.imprimir(Data.FORMATO_24H); // 5/10/2005
        } catch (BusinessException e) {
            System.out.println("Erro ao imprimir data: " + e.getMessage());
        }
    }
}
