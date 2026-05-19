package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTestExercicio {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.Nome = "Fiat";
        carro.Modelo = "Uno";
        carro.Ano = 2004;


        Carro carro2 = new Carro();
        carro2.Nome = "Ferrari";
        carro2.Modelo = "Italy";
        carro2.Ano = 2022;

        System.out.println(" Nome do carro: "+carro.Nome+ "   " + "\n Modelo: "+carro.Modelo+ "   " + "\n Ano de fabricação: "+carro.Ano);
        System.out.println("-----------------------");
        System.out.println(" Nome do carro: "+carro2.Nome+ "   " + "\n Modelo: "+carro2.Modelo+ "   " + "\n Ano de fabricação: "+carro2.Ano);


    }
}
