package _06_manipulando_colecoes_com_stream.exercicio_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {

        List<String> cores = Arrays.asList(
                "Azul", "Branco", "Preto", "Preto", "Amarelo", "Azul"
        );

        AtomicInteger id = new AtomicInteger();

        List<Papel> papeis = new ArrayList<>();

        cores.forEach(cor -> {
            Papel papel = new Papel(id.getAndIncrement(), Papel.Cor.valueOf(cor));
            papeis.add(papel);
        });

        System.out.println(papeis);
    }
}
