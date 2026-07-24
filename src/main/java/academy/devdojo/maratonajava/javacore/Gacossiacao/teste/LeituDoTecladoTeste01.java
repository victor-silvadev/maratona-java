package academy.devdojo.maratonajava.javacore.Gacossiacao.teste;

import java.util.Scanner;

public class LeituDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo");
        String nome = entrada.nextLine();

        System.out.println("digite sua idade:");
        int idade = entrada.nextInt();

        System.out.println("digite m ou f para sexo");
        char sexo = entrada.next().charAt(0);
        System.out.println("------------------------");
        System.out.println("nome: "+ nome);
        System.out.println("idade: "+ idade);
        System.out.println("sexo: "+ sexo);
    }
}
