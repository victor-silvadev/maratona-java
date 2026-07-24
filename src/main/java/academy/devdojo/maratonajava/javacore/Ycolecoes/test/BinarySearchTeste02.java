package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5,"Attack on titan", 19.99));
        mangas.add(new Manga(2,"Bersek", 20.80));
        mangas.add(new Manga(1,"Hellsing Ultimate", 10.18));
        mangas.add(new Manga(4,"Pokemon", 30.78));
        mangas.add(new Manga(3,"Dragon Ball Z", 37.88));

        Collections.sort(mangas);

        for(Manga manga : mangas){
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(3, "Dragon Ball Z", 37.88);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));

    }
}
