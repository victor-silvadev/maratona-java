package academy.devdojo.maratonajava.javacore.Rdate.teste;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTeste01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, Month.SEPTEMBER,3);
        System.out.println("data do meu aniversario: "+date);
        LocalDate hoje = LocalDate.now();
        System.out.println("data de hoje: "+hoje);
    }
}
