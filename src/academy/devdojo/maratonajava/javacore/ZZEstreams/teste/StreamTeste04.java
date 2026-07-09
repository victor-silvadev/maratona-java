package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTeste04 {
    public static void main(String[] args) {
        List<String> list = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = list.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String[]> collect = list.stream()
                .map(w -> w.split(""))
                .collect(Collectors.toList());
        Stream<Object> stream = Arrays.stream(letters);

        List<String> list1 = list.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
