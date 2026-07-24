package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTeste01 {
    public static void main(String[] args) {
        List<String> nameList = List.of("Victor", "Guimaraes", "da Silva");
        forEach(nameList,names -> System.out.println(names));
    }

private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list){
            consumer.accept(e);
        }
    }

}

