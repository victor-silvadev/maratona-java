package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTeste01 {
    private static List<LigthNovel> lightNovels = new ArrayList<>( List.of(
            new LigthNovel("Naruto",5.50),
            new LigthNovel("Sask",8.31),
            new LigthNovel("Sakura",9.99),
            new LigthNovel("Gaara",6.11),
            new LigthNovel("Sasori",4.21),
            new LigthNovel("Ino",8.99),
            new LigthNovel("Kakashi",2.30)));

    public static void main(String[] args) {
        List<String> listTitle = lightNovels.stream()
                .sorted(Comparator.comparing(LigthNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 7)
                .limit(3)
                .map(LigthNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(listTitle);

    }
}
