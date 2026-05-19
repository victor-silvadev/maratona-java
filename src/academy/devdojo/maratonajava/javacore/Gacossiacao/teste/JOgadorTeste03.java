package academy.devdojo.maratonajava.javacore.Gacossiacao.teste;

import academy.devdojo.maratonajava.javacore.Gacossiacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gacossiacao.dominio.Time;

public class JOgadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("cafu");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();

        System.out.println("--- Time ---");

        time.imprime();
    }
}
