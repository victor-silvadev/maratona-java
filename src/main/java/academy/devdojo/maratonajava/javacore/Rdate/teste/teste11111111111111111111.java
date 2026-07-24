package academy.devdojo.maratonajava.javacore.Rdate.teste;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class teste11111111111111111111{
    public static void main(String[] args) throws InterruptedException {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("--- Mostrando segundos em tempo real (Ctrl+C para parar) ---");

        // Loop infinito para o relógio não parar
        while (true) {
            LocalTime hora = LocalTime.now();
            System.out.print("\r"+hora.format(formato));
            System.out.print("\r "+hora.getHour()+"Hora "+hora.getMinute()+"Minutos "+hora.getSecond()+"Segundos");

            // Faz o Java "dormir" por 1000 milissegundos (1 segundo) antes de atualizar
            Thread.sleep(1000);
        }

    }
}
