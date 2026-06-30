package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste02 {
    public static void main(String[] args) {
        Queue<Manga> mangaQueue = new PriorityQueue<>(new mangaPrecoComparato().reversed());
        mangaQueue.add(new Manga(5,"Attack on titan", 19.99));
        mangaQueue.add(new Manga(2,"Bersek", 20.80));
        mangaQueue.add(new Manga(1,"Hellsing Ultimate", 10.18));
        mangaQueue.add(new Manga(4,"Pokemon", 30.78));
        mangaQueue.add(new Manga(3,"Dragon Ball Z", 37.88));

        while (!mangaQueue.isEmpty()){
            System.out.println(mangaQueue.poll());
        }
    }
}
