package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.Dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTeste02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Naruto", 5),
                new Anime("Pikachu", 10),
                new Anime("D Ball Z", 200),
                new Anime("Zoopidem", 300)));

        animeList.sort(animeComparators::compareByEpisodesNoStatic);
        animeList.sort((a1,a2) -> animeComparators.compareByEpisodesNoStatic(a1,a2));
        System.out.println(animeList);
    }
}
