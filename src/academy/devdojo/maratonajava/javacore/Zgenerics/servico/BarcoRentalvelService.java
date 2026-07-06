package academy.devdojo.maratonajava.javacore.Zgenerics.servico;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentalvelService {
    private List<Barco> BarcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa") ));

    public Barco buscarBarcosDisponiveis(){
        System.out.println("Buscando barcos disponiveis....");
        Barco barco = BarcosDisponiveis.remove(0);
        System.out.println("ALUGANDO CARRO "+barco);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(BarcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo "+barco);
        BarcosDisponiveis.add(barco);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(BarcosDisponiveis);    }
}
