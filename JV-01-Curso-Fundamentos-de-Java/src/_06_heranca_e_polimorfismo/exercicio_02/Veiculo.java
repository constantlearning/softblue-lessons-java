package _06_heranca_e_polimorfismo.exercicio_02;

public class Veiculo {

    private boolean ligado;

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public boolean isLigado(){
        return this.ligado;
    }
}
