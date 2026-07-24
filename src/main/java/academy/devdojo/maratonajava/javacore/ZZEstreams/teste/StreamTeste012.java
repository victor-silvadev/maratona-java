package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste012 {
    private static List<LigthNovel> lightNovels = new ArrayList<>( List.of(
            new LigthNovel("Naruto",5.50, Category.DRAMA),
            new LigthNovel("Sask",8.31,Category.FANTASY),
            new LigthNovel("Sakura",9.99,Category.FANTASY),
            new LigthNovel("Gaara",6.11,Category.ROMANCE),
            new LigthNovel("Sasori",4.21,Category.DRAMA),
            new LigthNovel("Ino",8.99,Category.FANTASY),
            new LigthNovel("Kakashi",2.30,Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<LigthNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
        ));
        System.out.println(collect);

        System.out.println(" ");

        Map<Category, Map<Promotion, List<LigthNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
        )));
        System.out.println(collect1);
    }
}
