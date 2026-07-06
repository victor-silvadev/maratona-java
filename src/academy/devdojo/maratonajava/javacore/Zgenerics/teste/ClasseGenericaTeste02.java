package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.servico.BarcoRentalvelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.servico.CarroRentalvelService;

public class ClasseGenericaTeste02 {
    public static void main(String[] args) {
        BarcoRentalvelService barcoRentalvelService = new BarcoRentalvelService();
        Barco barco = barcoRentalvelService.buscarBarcosDisponiveis();
        System.out.println("Usando barco por 1 mes...");
        barcoRentalvelService.retornarBarcoAlugado(barco);
    }
}
