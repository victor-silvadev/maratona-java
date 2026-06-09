package academy.devdojo.maratonajava.javacore.Uregex.text;

import java.util.Scanner;

public class ScannerTeste01 {
    public static void main(String[] args) {
        String texto = "Levi,Eeren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");

        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
