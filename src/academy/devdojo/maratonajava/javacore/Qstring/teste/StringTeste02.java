package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "  Silva  ";
        String numeros = "012345";

        System.out.println(nome.charAt(3));

        System.out.println(nome.length());

        System.out.println(nome.replace("S", "G"));

        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());

        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,3));

        System.out.println(nome.trim());

    }
}
