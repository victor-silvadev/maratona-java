package academy.devdojo.maratonajava.javacore.Gacossiacao.teste;

import java.util.Scanner;

public class LeituDoTecladoTeste02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("o grande software de previsao do futuro");
        System.out.println("digite sua pergunta e eu responderei sim ou nao");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) ==  ' '){
            System.out.println("Sim");
    } else {
            System.out.println("Nao");
        }

    }
}
