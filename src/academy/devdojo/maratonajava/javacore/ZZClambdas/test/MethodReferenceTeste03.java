package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTeste03 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>( List.of("Victor", "Guimaraes", "da Silva"));
        strings.sort(String::compareTo);
        System.out.println(strings);

        Function<String, Integer> numStrongToInteger = Integer::parseInt;
        System.out.println(numStrongToInteger.apply("10"));

        BiPredicate<List<String>,  String> checkedName = List::contains;
        System.out.println(checkedName.test(strings,"da Silva"));
    }
}
