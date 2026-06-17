package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("22222", "Sansumg");
        Smartphone s3 = new Smartphone("33333", "Xaiomi");

        List<Smartphone> smartphone = new ArrayList<>();
        smartphone.add(s1);
        smartphone.add(s2);
        smartphone.add(s3);

        for (Smartphone smartphones : smartphone){
            System.out.println(smartphones);
        }

        Smartphone s4 = new Smartphone("22222", "Sansumg");

        if (smartphone.contains(s4) == true){
            System.out.println("Existe");

        } else {
            System.out.println("Nao existe");
        }

//        System.out.println( smartphone.contains(s4));
        System.out.println( smartphone.indexOf(s2));
    }
}
