package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeForMetterTeste01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String BasicFormate = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String IsoFormate = date.format(DateTimeFormatter.ISO_DATE);
        String IsoLocalFormate = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("LocalDate Formate");
        System.out.println(BasicFormate);
        System.out.println(IsoFormate);
        System.out.println(IsoLocalFormate);

        System.out.println("-------------------------------");

        LocalDate BasicParse = LocalDate.parse("20260605", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate IsoParse = LocalDate.parse("2026-06-05", DateTimeFormatter.ISO_DATE);
        LocalDate IsoLocalParse = LocalDate.parse("2026-06-05", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("LocalDate Parse");
        System.out.println(BasicParse);
        System.out.println(IsoParse);
        System.out.println(IsoLocalParse);

        System.out.println("----------------------------");

        LocalDateTime now = LocalDateTime.now();
        String s1 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("LocalDateTime Format");
        System.out.println(s1);

        LocalDateTime s2 = LocalDateTime.parse("2026-06-05T19:57:14.7359238");
        System.out.println("LocalDateTime Parse");
        System.out.println(s2);

        System.out.println("-----------------------");

        DateTimeFormatter dateTimeFormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(dateTimeFormatterBR);
        System.out.println(formatBR);

        LocalDate parseBR = LocalDate.parse("05/06/2026", dateTimeFormatterBR);
        System.out.println(parseBR);

        System.out.println("-----------------------");

        DateTimeFormatter formateGr = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMANY);
        String formatGR = LocalDate.now().format(formateGr);
        System.out.println(formatGR);
    }
}
