package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTeste03 {
    public static void main(String[] args) {
    List<List<String>> devdojo = new ArrayList<>();
    List<String> graphicdesigners = List.of("Victor", "Guimaraes", "da", "Silva");
    List<String> developers = List.of("Joao","Silva", "Nestor");
    List<String> students = List.of("Mario","Ferreira", "Gonzaga", "Fagundes");
        devdojo.add(graphicdesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }

        }

        System.out.println("--------------------");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }

}
