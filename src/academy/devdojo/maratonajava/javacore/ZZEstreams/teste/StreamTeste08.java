package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTeste08 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print( n+" "));

        System.out.println();

        Stream.of("Eleve "," O"," Cosmo"," no seu coraçao")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s +" "));


    }
}
