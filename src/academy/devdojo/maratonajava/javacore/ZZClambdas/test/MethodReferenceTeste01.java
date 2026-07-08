package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.Dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTeste01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 5), new Anime("Pikachu", 10), new Anime("D Ball Z", 200), new Anime("Zoopidem", 300)));
//        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        Collections.sort(animeList,(a1,a2) -> AnimeComparators.compareByTitle(a1,a2));

        Collections.sort(animeList,AnimeComparators::compareByTitle);
        System.out.println("Por Nome");
        System.out.println(animeList);

        System.out.println("\n");

        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
        System.out.println("Por Episodios");
        System.out.println(animeList);
    }
}
