package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTeste03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Naruto");
        Consumidor consumidor2 = new Consumidor("Saske");

        Manga manga1 = new Manga(5, "Attack on titan", 19.99);
        Manga manga2 = new Manga(2,"Bersek", 20.80);
        Manga manga3 = new Manga(1,"Hellsing Ultimate", 10.18);
        Manga manga4 = new Manga(4,"Pokemon", 30.78);
        Manga manga5 = new Manga(3,"Dragon Ball Z", 37.88);

        List<Manga> mangaConsumidorMap = List.of(manga1,manga2,manga3);
        List<Manga> mangaConsumidorMap2 = List.of(manga3,manga4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidorMap);
        consumidorMangaMap.put(consumidor2, mangaConsumidorMap2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.print(entry.getKey().getNome()+": ");
            for (Manga manga : entry.getValue()) {
                System.out.print(manga.getNomeManga()+" - ");
            }

        }
    }
}
