package academy.devdojo.maratonajava.javacore.Rdate.teste;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2004, Month.SEPTEMBER , 3 , 12 , 0 , 0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println( ChronoUnit.DAYS.between(aniversario , now));
        System.out.println( ChronoUnit.YEARS.between(aniversario , now));


    }
}
