
public class Main {

	public static void main(String[] args) {
		System.out.println(fatorialIterativo(7));
		System.out.println(fatorialRecursivo(7));
	}
	
	private static int fatorialIterativo(int valor) {
		int fatorial = 1;
		for (int i = 1; i <= valor; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
	
	private static int fatorialRecursivo(int valor) {
		if(valor == 0 || valor == 1) {
			return 1;
		}
		return fatorialRecursivo(valor - 1) * valor;
	}

}
