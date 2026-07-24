package academy.devdojo.maratonajava.javacore.Csobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominios.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 12, "Ação");

//        anime.setGenero("Ação");


//        anime.setNome("Naruto");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
        anime.imprime();
    }
}
