package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.Dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;



public class MethodReferenceTeste04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimecomparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimecomparators.get();

        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Naruto", 5),
                new Anime("Pikachu", 10),
                new Anime("D Ball Z", 200),
                new Anime("Zoopidem", 300)));

        animeList.sort(animeComparators::compareByEpisodesNoStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (titles,episodes) -> new Anime(titles,episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Buruto", 200));
        System.out.println(animeBiFunction.apply("Xuruto", 5690));
    }
}
