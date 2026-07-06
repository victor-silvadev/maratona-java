package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.Test;


import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BarcoNameComparator implements Comparator<Barco>{
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnonymousClassesTeste02 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>( List.of(new Barco("Canoa"), new Barco("Lacha")));

        barcoList.sort(Comparator.comparing(Barco::getNome));

        System.out.println(barcoList);
    }
}
