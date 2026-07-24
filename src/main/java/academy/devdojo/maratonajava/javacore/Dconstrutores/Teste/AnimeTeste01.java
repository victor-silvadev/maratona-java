package academy.devdojo.maratonajava.javacore.Dconstrutores.Teste;

import academy.devdojo.maratonajava.javacore.Dconstrutores.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Saske", "TV", 12, "Ação", "Produçao ig");
//        anime.init("Naruto", "TV", 12, "Ação");



        anime.imprime();
    }
}
