package academy.devdojo.maratonajava.javacore.Rdate.teste;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterYears = LocalDate.now().plusYears(2);
        
        Period p1 = Period.between(now , nowAfterYears);

        System.out.println(p1);
    }
}
