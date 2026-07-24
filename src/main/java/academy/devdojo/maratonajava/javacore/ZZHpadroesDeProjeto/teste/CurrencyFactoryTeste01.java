package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.teste;

import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio.Country;
import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio.Currency;
import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio.CurrencyFactory;

public class CurrencyFactoryTeste01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRASIL);
        System.out.println(currency.getSymbol());
    }
}
