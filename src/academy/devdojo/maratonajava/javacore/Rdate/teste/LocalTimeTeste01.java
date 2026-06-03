package academy.devdojo.maratonajava.javacore.Rdate.teste;

import java.time.LocalTime;

public class LocalTimeTeste01 {
    public static void main(String[] args) {
       LocalTime time =  LocalTime.now();
        System.out.println(time);
        System.out.println("São "+time.getHour()+" Horas e "+time.getMinute()+" Minutos");
    }
}
