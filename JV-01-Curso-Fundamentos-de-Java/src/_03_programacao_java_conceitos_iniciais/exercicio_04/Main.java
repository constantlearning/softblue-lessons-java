package _03_programacao_java_conceitos_iniciais.exercicio_04;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 15; i++) {
			System.out.println(fibonacci(i));
		}
		
	}

	public static long fibonacci(int numero) {
		
		if (numero < 2) {
			return numero;
		}
		
		return fibonacci(numero - 1) + fibonacci(numero - 2);
	}
}
