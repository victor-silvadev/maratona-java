package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.Dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

//    0 - bloco de inicializaçao e executado quando a JVM carrega classe
//    1 - alocado espaço em memoria pro objeto
//    2 - cada atributo de classe e criado e inicializado com valores default ou que forem impostos
//    3 - construtor e executado

    static {
        System.out.println("bloco de inicializaçao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
