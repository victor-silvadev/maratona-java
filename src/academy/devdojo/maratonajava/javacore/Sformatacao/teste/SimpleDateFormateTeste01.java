package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateTeste01 {
    public static void main(String[] args) {
        String mascara = "'Brasil' dd 'de' MMMM \n  HH:mm 'Horas'";
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        System.out.println( sdf.format(new Date()));
    }
}
