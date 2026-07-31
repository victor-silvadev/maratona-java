package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

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

    public static void updatePreparedStstement(Producer producer){
            requiredValidId(producer.getId());
            ProducerRepository.updatePreparedStstement(producer);
    }

    public static List<Producer> findAll(){
        return ProducerRepository.findAll();
    }

    public static void showProducerMetaDate(){
        ProducerRepository.showProducerMetaDate();
    }

    public static void showDriverMetaDate(){
        ProducerRepository.showDriverMetaDate();
    }

    public static void showTypeScrollWorking(){
        ProducerRepository.showTypeScrollWorking();
    }

    public static List<Producer> findByName(String name){
        return ProducerRepository.findByName(name);
    }

    public static List<Producer> findByNamePrepareStatement(String name){
        return ProducerRepository.findByNamePrepareStatement(name);
    }

    public static List<Producer> findByNameCallableStatement(String name){
        return ProducerRepository.findByNameCallableStatement(name);
    }

     public static List<Producer> findByNameAndUpdateToUpperCase(String name){
        return ProducerRepository.findByNameAndUpdateToUpperCase(name);
    }

     public static List<Producer> findByNameAndInsertWhenNotFound(String name){
        return ProducerRepository.findByNameAndInsertWhenNotFound(name);
    }

     public static void findByNameAndDelte(String name){
         ProducerRepository.findByNameAndDelte(name);
    }

    private static void requiredValidId(Integer id){
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
