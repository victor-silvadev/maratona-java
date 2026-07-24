package academy.devdojo.maratonajava.javacore.Rdate.teste;

import java.time.*;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);

        System.out.println(ZoneId.systemDefault());

        ZoneId kolkataZone = ZoneId.of("Asia/Kolkata");
        System.out.println(kolkataZone);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = localDateTime.atZone(kolkataZone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(kolkataZone);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = localDateTime.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime);
    }
}
