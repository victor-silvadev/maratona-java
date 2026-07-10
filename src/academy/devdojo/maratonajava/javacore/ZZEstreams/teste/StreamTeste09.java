package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTeste09 {
    public static void main(String[] args) {
        Stream.iterate(1,n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));

        System.out.println("-----------");

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::print);

        System.out.println("-----------");

        ThreadLocalRandom randow = ThreadLocalRandom.current();

        Stream.generate(() -> randow.nextInt(1,100))
                .limit(50)
                .forEach(System.out::print);
    }
}
