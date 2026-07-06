package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTeste01 {
    public static void main(String[] args) {
     criarArraiComUmObjeto(new Barco("Canoa MArota"));


    }

    private static <T> void criarArraiComUmObjeto(T t){
        List<T> list = List.of(t);
        System.out.println(list);

    }
}
