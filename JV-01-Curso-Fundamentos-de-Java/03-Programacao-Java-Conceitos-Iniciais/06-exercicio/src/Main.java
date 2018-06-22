import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int ano = sc.nextInt();

		boolean isValid = validarData(dia, mes, ano);
		
		if(isValid) {
			System.out.println("Data válida!");
		}
		else {
			System.out.println("Data inválida!");
		}
	}

	private static boolean validarData(int dia, int mes, int ano) {
		boolean isValid = false;
		isValid = validarAno(ano);
		isValid = validarMes(mes);
		isValid = validarDia(mes, dia);
		
		return isValid;
	}

	private static boolean validarDia(int mes, int dia) {
		if(mes == 2 && dia > 28){
			return false;
		}
		if(dia > 0 && dia <= 31) {
			return true;
		}
		return false;
	}

	private static boolean validarAno(int ano) {
		if (ano > 0 && ano <= 9999) {
			return true;
		}
		return false;
	}

	private static boolean validarMes(int mes) {
		if (mes > 1 && mes < 12) {
			return true;
		}
		return false;
	}

}
