package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;


import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerServices;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
//        Producer producer = Producer.builder().name("Studio Deen").build();
//        Producer producer2 = Producer.builder().name("Studio").build();
//        ProducerServices.save(producer);
//        ProducerServices.save(producer2);


//        ProducerServices.delete(2);
//        ProducerServices.delete(3);
//        ProducerServices.delete(4);
//        ProducerServices.delete(5);
//        ProducerServices.delete(6);


//        Producer producerToUpdate = Producer.builder().id(1).name("Victor Silva").build();
//        ProducerServices.update(producerToUpdate);

//        List<Producer> all = ProducerServices.findAll();
//        log.info("Producers found '{}'",all);

//        List<Producer> all = ProducerServices.findByName("Studio");
//        log.info("Producers found '{}'",all);

//        ProducerServices.showProducerMetaDate();

//        ProducerServices.showDriverMetaDate();

        ProducerServices.showTypeScrollWorking();



    }

}
