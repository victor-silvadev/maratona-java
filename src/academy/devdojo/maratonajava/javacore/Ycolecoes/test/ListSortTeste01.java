package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTeste01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Attack on titan");
        mangas.add("Bersek");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(2.21);
        dinheiros.add(19.1);
        dinheiros.add(30.50);
        dinheiros.add(100.00);

        Collections.sort(dinheiros);



        for(String manga : mangas){
            System.out.println(manga);
        }

        System.out.println("¨¨¨¨¨¨¨¨¨¨");

        for(Double dinheiro : dinheiros){
            System.out.println(dinheiro);
        }
    }
}
