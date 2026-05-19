package academy.devdojo.maratonajava.javacore.Gacossiacao.teste;

import academy.devdojo.maratonajava.javacore.Gacossiacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gacossiacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Flamengo");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
