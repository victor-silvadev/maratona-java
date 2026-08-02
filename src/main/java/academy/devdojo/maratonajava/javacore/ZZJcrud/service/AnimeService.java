package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.Repository.AnimeRepository;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;

import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        AnimeRepository.findAnimeByName(name)
                .forEach(p -> System.out.printf("(%d)  %s\n", p.getId(), p.getName(), p.getEpisodes(), p.getProducer().getName()));
    }


    private static void delete() {
        System.out.println("Type one of the ids below to delete");
        findByName();
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("s".equalsIgnoreCase(choice)) {
            AnimeRepository.delet(id);
        }

    }


    private static void save() {
        System.out.println("Type one name of the anime");
        String name = SCANNER.nextLine();
        System.out.println("Type the number of episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id of yhe producer");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());
        Anime anime = Anime.builder()
                .episodes(episodes)
                .name(name)
                .producer(Producer.builder().id(producerId).build())
                .build();
        AnimeRepository.save(anime);
    }


    private static void update() {
        System.out.println("type the id of the object you want to update");
        Optional<Anime> animeOptional = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (animeOptional.isEmpty()) {
            System.out.println("Anime not found");
            return;
        }
        Anime animeFromdb = animeOptional.get();
        System.out.println("Anime found " + animeFromdb);

        System.out.println("type the new name to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromdb.getName() : name;

        System.out.println("type the new number of episodes");
        int episodes = Integer.parseInt( SCANNER.nextLine());


        Anime animeToupdate = Anime.builder()
                .id(animeFromdb.getId())
                .episodes(episodes)
                .producer(animeFromdb.getProducer())
                .name(name)
                .build();
        AnimeRepository.update(animeToupdate);
    }
}