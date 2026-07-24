package academy.devdojo.maratonajava.javacore.ZZDoptional.test;


import java.util.List;
import java.util.Optional;

public class OptionalTeste01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.ofNullable(null);

        Optional<String> optionalString = Optional.ofNullable(findName("VIctor"));
        String vazio = optionalString.orElse("Vazio");
        System.out.println(vazio);
    }

    private static String findName(String name){
        List<String> list = List.of("VIctor", "Guimaraes");

        int i = list.indexOf(name);
        if(i != 0){
            return list.get(i);
        }
        return null;
    }
}
