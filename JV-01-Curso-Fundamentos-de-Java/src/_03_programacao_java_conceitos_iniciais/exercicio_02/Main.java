package _03_programacao_java_conceitos_iniciais.exercicio_02;

public class Main {

	public static void main(String[] args) {
		imprimirNumerosInteiros(10, 25);
		imprimirNumerosPulandoCasas(1, 100, 2);
		imprimirSomaDeSequenciaDeNumerosAteValor(100);
		imprimirTabuladaDoNove();

	}

	private static void imprimirNumerosInteiros(int inicio, int fim) {
		
		System.out.println("Imprima todos os números inteiros de " + inicio + " a " + fim
				+ " utilizando uma estrutura de repetição.");
		for (int i = inicio; i <= fim; i++) {
			System.out.println(i);
		}
	}

	private static void imprimirNumerosPulandoCasas(int inicio, int fim, int casas) {
		
		System.out.println("Imprima a soma dos números de " + inicio + " a " + fim + ", pulando de " + casas + " em "
				+ casas + " (1, 3, 5, 7, etc.).");
		for (int i = inicio; i <= fim; i = i + casas) {
			System.out.println(i);
		}
	}

	private static void imprimirSomaDeSequenciaDeNumerosAteValor(int valor) {
		
		System.out.println("Começando em 0, imprima os números seguintes, enquanto a soma dos números já\n"
				+ "impressos for menor que " + valor + ".");
		for (int i = 0; i < valor; i++) {
			System.out.println(i);
			i += i;
		}
	}

	private static void imprimirTabuladaDoNove() {
		
		System.out.println("Imprima a tabuada do 9 (até o décimo valor).");
		for (int i = 0; i <= 10; i++) {
			System.out.println("9 x " + i + " = " + 9 * i);
		}
	}

}
