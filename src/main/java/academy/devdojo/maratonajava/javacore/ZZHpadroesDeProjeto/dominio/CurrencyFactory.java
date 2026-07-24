package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio;

public class CurrencyFactory {
    public static Currency  newCurrency(Country country){
        switch (country){
            case USA -> {
                return new usDollar();
            }
            case BRASIL -> {
                return new Real();
            }
            default -> throw new IllegalArgumentException("No currency found for this country");
        }


    }
}
