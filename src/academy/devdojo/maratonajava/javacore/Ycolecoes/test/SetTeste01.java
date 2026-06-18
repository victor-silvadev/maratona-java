package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTeste01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5,"Attack on titan", 19.99, 0));
        mangas.add(new Manga(2,"Bersek", 20.80,5));
        mangas.add(new Manga(1,"Hellsing Ultimate", 10.18,0));
        mangas.add(new Manga(4,"Pokemon", 30.78,2));
        mangas.add(new Manga(3,"Dragon Ball Z", 37.88,0));

        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
