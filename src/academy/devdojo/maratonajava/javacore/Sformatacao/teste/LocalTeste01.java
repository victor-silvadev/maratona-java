package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTeste01 {
    public static void main(String[] args) {
        Locale localItaly = new Locale("it", "IT");
        Locale localCh = new Locale("it", "CH");
        Locale localBR = new Locale("pt", "BR");
        Locale localES = new Locale("en", "ES");


        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localCh);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localBR);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localES);

        System.out.println("Italy "+df1.format(calendar.getTime()));
        System.out.println("Suiça "+df2.format(calendar.getTime()));
        System.out.println("Brasil "+df3.format(calendar.getTime()));
        System.out.println("EUS "+df4.format(calendar.getTime()));
    }
}
