package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "victor";  // String constatnt pool
        String nome2 = "victor";

        nome = nome.concat(" Guimaraes"); // nome += " Guimaraes";

        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("victor"); // 1 Variavel de referencia, 2 objetos de tipo String, 3 uma String na pool de String

        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
