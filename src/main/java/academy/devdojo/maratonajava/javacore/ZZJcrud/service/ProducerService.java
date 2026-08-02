package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.Repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;

import java.util.Optional;
import java.util.Scanner;

import static academy.devdojo.maratonajava.javacore.ZZJcrud.Repository.ProducerRepository.update;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            default -> throw new IllegalStateException("Unexpected value: " + op);
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        ProducerRepository.findByName(name)
                .forEach(p -> System.out.printf("(%d)  %s\n", p.getId(), p.getName()));
    }


    private static void delete() {
        System.out.println("Type one of the ids below to delete");
        findByName();
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("s".equalsIgnoreCase(choice)) {
            ProducerRepository.delet(id);
        }

    }


    private static void save() {
        System.out.println("Type one name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }


    private static void update() {
        System.out.println("type the id of the object you want to update");
        Optional<Producer> producerOptional = ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (producerOptional.isEmpty()) {
            System.out.println("Producer not found");
            return;
        }
        Producer producerFromdb = producerOptional.get();
        System.out.println("Producer found " + producerFromdb);
        System.out.println("type the new name to keep the same");
        String name = SCANNER.nextLine();

        name = name.isEmpty() ? producerFromdb.getName() : name;

        Producer producerToupdate = Producer.builder()
                .id(producerFromdb.getId())
                .name(name)
                .build();
        ProducerRepository.update(producerToupdate);
    }
}