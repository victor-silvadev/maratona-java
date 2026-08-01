package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerServices;

import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Algebra barra").build();
        Producer producer2 = Producer.builder().name("Tailandia").build();
        Producer producer3 = Producer.builder().name("Crolofina").build();

        ProducerServices.saveTransaction(List.of(producer1,producer2,producer3));

    }
}
