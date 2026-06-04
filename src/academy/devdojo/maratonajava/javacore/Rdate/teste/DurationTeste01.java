package academy.devdojo.maratonajava.javacore.Rdate.teste;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTeste01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterYears = LocalDateTime.now().plusYears(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        Duration duration1 = Duration.between(now, nowAfterYears);
        Duration duration2 = Duration.between(timeNow, timeMinus7Hours);

        System.out.println(duration1);
        System.out.println(duration2);

    }
}
