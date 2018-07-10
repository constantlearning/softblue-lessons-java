package _06_manipulando_colecoes_com_stream.exercicio_03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> numeros = new ArrayList<>();
        numeros.add("5");
        numeros.add("31");
        numeros.add("22");
        numeros.add("14");
        numeros.add("9");
        numeros.add("30");
        numeros.add("18");

        Integer firstSumOfNumbers = numeros.stream()
                .map(Integer::parseInt)
                .collect(Collectors.summingInt(Integer::intValue));

        System.out.println(firstSumOfNumbers);

        Integer secondSumOfNumbers = numeros.stream()
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println(secondSumOfNumbers);
    }
}
