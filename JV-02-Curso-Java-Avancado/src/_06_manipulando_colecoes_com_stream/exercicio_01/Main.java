package _06_manipulando_colecoes_com_stream.exercicio_01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> angulosGraus = Arrays.asList(90, 30, 60, 45, 180);

        List<Double> angulosRadianos = angulosGraus.stream()
                .map(Math::toRadians)
                .collect(Collectors.toList());

        System.out.println(angulosRadianos);
    }
}
