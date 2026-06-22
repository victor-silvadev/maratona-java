package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTeste02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Naruto");
        Consumidor consumidor2 = new Consumidor("Saske");

        Manga manga1 = new Manga(5, "Attack on titan", 19.99);
        Manga manga2 = new Manga(2,"Bersek", 20.80);
        Manga manga3 = new Manga(1,"Hellsing Ultimate", 10.18);
        Manga manga4 = new Manga(4,"Pokemon", 30.78);
        Manga manga5 = new Manga(3,"Dragon Ball Z", 37.88);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }
}
