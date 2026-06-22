package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.*;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class mangaPrecoComparato implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NaigableSetTeste01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(smartphone);


        NavigableSet<Manga> mangas = new TreeSet<>(new mangaPrecoComparato(

        ));
        mangas.add(new Manga(5,"Attack on titan", 19.99));
        mangas.add(new Manga(2,"Bersek", 20.80));
        mangas.add(new Manga(1,"Hellsing Ultimate", 10.18));
        mangas.add(new Manga(4,"Pokemon", 30.78));
        mangas.add(new Manga(3,"Dragon Ball Z", 37.88));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
