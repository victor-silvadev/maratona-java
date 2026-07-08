package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.Repositorio.MangaRepositorio;
import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.Optional;

public class OptionalTeste02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTittle = MangaRepositorio.findByTitle("Naruto");

        mangaByTittle.ifPresent(m -> m.setTitle(m.getTitle()+" Uzumake"));
        System.out.println(mangaByTittle);

        Manga newManga = MangaRepositorio.findByTitle("Pokemon").orElseGet(() -> new Manga(3, "Pokemon", 430));
        System.out.println(newManga);

        Manga byId = MangaRepositorio.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(byId);
    }
}
