package academy.devdojo.maratonajava.javacore.Eblocosdeinicializaçao.teste;

import academy.devdojo.maratonajava.javacore.Eblocosdeinicializaçao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("one peace");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
