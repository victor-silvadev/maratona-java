package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;

public class StreamTeste014 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LigthNovel::getCategory,
                        summarizingDouble(LigthNovel::getPrice)));
        System.out.println(collect);

        Map<Category, List<Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(LigthNovel::getCategory,
                        mapping(StreamTeste014::getPromotion,
                                toList())));
        System.out.println(collect1);
    }

    private static Promotion getPromotion(LigthNovel ln){
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
