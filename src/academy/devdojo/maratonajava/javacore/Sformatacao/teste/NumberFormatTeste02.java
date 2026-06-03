package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTeste02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localPt = new Locale("pt", "BR");
        Locale localJP = Locale.JAPAN;
        Locale localIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localPt);
        nfa[3] = NumberFormat.getCurrencyInstance(localIT);

        double valor = 10_000_000.2130;

        for (NumberFormat numberFormat : nfa){
            System.out.println( numberFormat.format(valor));
        }
    }
}
