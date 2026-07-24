package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste011 {
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
//        Map<Category, List<LigthNovel>> categoryLigthNovelMap = new HashMap<>();
//        List<LigthNovel> fantasy = new ArrayList<>();
//        List<LigthNovel> drama = new ArrayList<>();
//        List<LigthNovel> romance = new ArrayList<>();
//        for (LigthNovel lightNovel : lightNovels) {
//            switch (lightNovel.getCategory()){
//                case DRAMA -> {
//                    drama.add(lightNovel);
//                    break;
//                }
//                case FANTASY -> {
//                    fantasy.add(lightNovel);
//                    break;
//                }
//                case ROMANCE -> {
//                    romance.add(lightNovel);
//                    break;
//                }
//            }
//
//            categoryLigthNovelMap.put(Category.DRAMA, drama);
//            categoryLigthNovelMap.put(Category.FANTASY, fantasy);
//            categoryLigthNovelMap.put(Category.ROMANCE, romance);
//        }
//
//        System.out.println(categoryLigthNovelMap);

        Map<Category, List<LigthNovel>> categoryListMap = lightNovels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory));
        System.out.print(categoryListMap);


    }
}
