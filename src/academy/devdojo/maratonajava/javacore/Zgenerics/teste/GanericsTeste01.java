package academy.devdojo.maratonajava.javacore.Zgenerics.teste;


import java.util.ArrayList;
import java.util.List;

public class GanericsTeste01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Vcitor");
        lista.add("Silva");

        for (String listas : lista){
            System.out.println(listas);
        }
    }
}
