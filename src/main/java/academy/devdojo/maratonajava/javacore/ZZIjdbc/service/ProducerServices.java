package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

public class ProducerServices {

    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }


    public static void delete(Integer id){
            requiredValidId(id);
            ProducerRepository.delet(id);
    }

    public static void update(Producer producer){
            requiredValidId(producer.getId());
            ProducerRepository.update(producer);
    }

    private static void requiredValidId(Integer id){
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
