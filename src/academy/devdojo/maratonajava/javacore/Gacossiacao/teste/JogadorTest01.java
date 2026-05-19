package academy.devdojo.maratonajava.javacore.Gacossiacao.teste;

import academy.devdojo.maratonajava.javacore.Gacossiacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogadore : jogadores) {
            jogadore.imprime();
        }

    }
}
