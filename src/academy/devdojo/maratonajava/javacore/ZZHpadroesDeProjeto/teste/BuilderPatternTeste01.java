package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.teste;

import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio.Person;

public class BuilderPatternTeste01 {
    public static void main(String[] args) {
        Person build =  Person.PersonBuilder
                .builder()
                .firstName("Victor")
                .lastName("Guimaraes")
                .userName("GarotoDev")
                .email("Victor@gmail.com")
                .build();

        System.out.println(build);
    }
}
