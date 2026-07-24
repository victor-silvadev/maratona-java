package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.servico.CarroRentalvelService;

public class ClasseGenericaTeste01 {
    public static void main(String[] args) {
        CarroRentalvelService carroRentalvelService = new CarroRentalvelService();
        Carro carro = carroRentalvelService.buscarCarrosDisponiveis();
        System.out.println("Usando carro por 1 mes...");
        carroRentalvelService.retornarCarroAlugado(carro);
    }
}
