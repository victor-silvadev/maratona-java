package academy.devdojo.maratonajava.javacore.Zgenerics.servico;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentalvelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes") ));

    public Carro buscarCarrosDisponiveis(){
        System.out.println("Buscando carros disponiveis....");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("ALUGANDO CARRO "+carro);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo "+carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(carrosDisponiveis);    }
}
