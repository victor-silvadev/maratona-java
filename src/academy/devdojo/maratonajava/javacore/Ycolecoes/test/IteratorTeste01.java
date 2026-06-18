package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5,"Attack on titan", 19.99, 0));
        mangas.add(new Manga(2,"Bersek", 20.80,5));
        mangas.add(new Manga(1,"Hellsing Ultimate", 10.18,0));
        mangas.add(new Manga(4,"Pokemon", 30.78,2));
        mangas.add(new Manga(3,"Dragon Ball Z", 37.88,0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }


        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);
    }
}
