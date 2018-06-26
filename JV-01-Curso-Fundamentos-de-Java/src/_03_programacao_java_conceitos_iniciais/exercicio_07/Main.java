package _03_programacao_java_conceitos_iniciais.exercicio_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<Double> notas = lerNotas();
		Double somaNotas = obterSomaDeNotas(notas);
		Double media = somaNotas / notas.size();

		System.out.println("A média é: " + media);

	}

	private static List<Double> lerNotas() {
		
		Scanner sc = new Scanner(System.in);
		
		List<Double> notas = new ArrayList<>();
		
		while (sc.hasNext()) {
			Double nota = sc.nextDouble();
					
			if (nota < 0) {
				break;
			}
			
			notas.add(nota);
		}
		sc.close();
		
		return notas;
	}

	private static Double obterSomaDeNotas(List<Double> notas) {
		
		Double somaNotas = 0.0;
		
		for (Double nota : notas) {
			somaNotas += nota;
		}
		
		return somaNotas;
	}
}
