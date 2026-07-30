package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;


import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerServices;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
//        Producer producer = Producer.builder().name("Studio Deen").build();
//        ProducerServices.save(producer);

        Producer producerToUpdate = Producer.builder().id(1).name("Victor Silva").build();

//        ProducerServices.delete(2);
//        ProducerServices.delete(3);
//        ProducerServices.delete(4);
//        ProducerServices.delete(5);
//        ProducerServices.delete(6);

        ProducerServices.update(producerToUpdate);
    }

}
