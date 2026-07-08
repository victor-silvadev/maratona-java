package academy.devdojo.maratonajava.javacore.ZZDoptional.Repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepositorio {
    private static List<Manga> mangas = List.of(
            new Manga(1,"Naruto",200),
            new Manga(2,"D BallZ",124));


    public static Optional<Manga> findByTitle(String title){
        return findBy(n -> n.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id){
        return findBy(i -> i.getTitle().equals(id));
    }

    public static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;

        for (Manga manga : mangas){
            if (predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
