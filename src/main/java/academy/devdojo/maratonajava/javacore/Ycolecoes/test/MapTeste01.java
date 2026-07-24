package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTeste01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "Teclado");
        map.put("mouze", "Mouse");
        map.put("vc", "Voce");
        map.putIfAbsent("vc2", "Voce");
        System.out.println(map);

        for (String key : map.keySet()){
            System.out.println();
        }
    }
}
