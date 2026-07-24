package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTeste015 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumFor(num);
        sumStreamInterate(num);
        sumLongStreamInterate(num);



    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + "ms");

    }

    private static void sumStreamInterate(long num) {
        System.out.println("Sum StreamInterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + "ms");

    }

    private static void sumLongStreamInterate(long num) {
        System.out.println("Sum LongStreamInterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + "ms");

    }

    private static void sumParalleleStreamInterate(long num) {
        System.out.println("Sum ParalleleStreamInterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + "ms");

    }

}
