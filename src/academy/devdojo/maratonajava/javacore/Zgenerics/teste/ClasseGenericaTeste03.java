package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.servico.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes") ));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa") ));
        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponiveis();
        System.out.println("Usando carro por 1 mes...");
        rentalService.retornarObjetoAlugado(carro);

        System.out.println("==============================");

        RentalService<Barco> rentalService1 = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalService1.buscarObjetoDisponiveis();
        System.out.println("Usando barco por 1 mes...");
        rentalService1.retornarObjetoAlugado(barco);
    }
}
