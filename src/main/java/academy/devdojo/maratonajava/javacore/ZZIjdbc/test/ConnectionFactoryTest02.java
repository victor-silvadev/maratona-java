package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
//        List<Producer> producer = ProducerRepositoryRowSet.findByNameJDBCRowSet("Studio");
//        log.info(producer);

//        Producer producer = Producer.builder().id(2).name("studio").build();
//        ProducerRepositoryRowSet.updateJDBCRowSet(producer);
//
        Producer producer = Producer.builder().id(2).name("studio").build();
        ProducerRepositoryRowSet.updateCachedRowSet(producer);
    }
}
