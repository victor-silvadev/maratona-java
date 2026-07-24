package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTeste013 {
     private static List<LigthNovel> lightNovels = new ArrayList<>( List.of(
            new LigthNovel("Naruto",5.50, Category.DRAMA),
            new LigthNovel("Sask",8.31,Category.FANTASY),
            new LigthNovel("Sakura",9.99,Category.FANTASY),
            new LigthNovel("Gaara",6.11,Category.ROMANCE),
            new LigthNovel("Sasori",4.21,Category.DRAMA),
            new LigthNovel("Ino",8.99,Category.FANTASY),
            new LigthNovel("Kakashi",2.30, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collectCount = lightNovels.stream()
                .collect(groupingBy(LigthNovel::getCategory, Collectors.counting()));
        System.out.println(collectCount);

        Map<Category, Optional<LigthNovel>> collect = lightNovels.stream()
                .collect(groupingBy(LigthNovel::getCategory,
                        Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice))));
        System.out.println(collect);

        Map<Category, LigthNovel> collect2 = lightNovels.stream()
                .collect(groupingBy(LigthNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice)),
                                Optional::get)));
        System.out.println(collect2);
    }
}
