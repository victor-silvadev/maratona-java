package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localPt = new Locale("pt", "BR");
        Locale localJP = Locale.JAPAN;
        Locale localIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localJP);
        nfa[2] = NumberFormat.getInstance(localPt);
        nfa[3] = NumberFormat.getInstance(localIT);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat : nfa){
            System.out.println( numberFormat.format(valor));
        }


    }
}
