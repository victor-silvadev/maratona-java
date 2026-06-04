package academy.devdojo.maratonajava.javacore.Rdate.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime =  LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        System.out.println("Data e Hora: "+localDateTime);
        System.out.println("Data: "+localDate);
        System.out.println("Hora: "+localTime);
    }
}
