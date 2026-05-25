package academy.devdojo.maratonajava.javacore.Minterfaces.teste;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader databaseloader = new DataBaseLoader();
        FileLoader fileloader = new FileLoader();

        databaseloader.load();
        databaseloader.remove();
        databaseloader.checkPermission();
        System.out.println(" ");
        fileloader.load();
        fileloader.remove();
        fileloader.checkPermission();
    }
}
