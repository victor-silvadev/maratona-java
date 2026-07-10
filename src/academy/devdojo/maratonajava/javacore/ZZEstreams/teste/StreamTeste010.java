package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste010 {
    private static List<LigthNovel> lightNovels = new ArrayList<>( List.of(
            new LigthNovel("Naruto",5.50),
            new LigthNovel("Sask",8.31),
            new LigthNovel("Sakura",9.99),
            new LigthNovel("Gaara",6.11),
            new LigthNovel("Sasori",4.21),
            new LigthNovel("Ino",8.99),
            new LigthNovel("Kakashi",2.30)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream().max(Comparator.comparing(LigthNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice)))
                .ifPresent(System.out::println);

        lightNovels.stream().mapToDouble(LigthNovel::getPrice).sum();
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LigthNovel::getPrice)));

        lightNovels.stream().mapToDouble(LigthNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LigthNovel::getPrice)));

        DoubleSummaryStatistics summaryStatistics = lightNovels.stream().collect(Collectors.summarizingDouble(LigthNovel::getPrice));
        System.out.println(summaryStatistics);

        String titles = lightNovels.stream().map(LigthNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
