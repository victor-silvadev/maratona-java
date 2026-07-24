package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTeste01 {
    public static void main(String[] args) {
        String diretorioDoProjeto = "home/victor/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioDoProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
    }
}
