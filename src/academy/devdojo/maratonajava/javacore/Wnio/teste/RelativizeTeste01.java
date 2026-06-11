package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTeste01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/victor");
        Path clasz = Paths.get("/home/victor/devdojobrabo/olaMundo.java");

        Path relativize = dir.relativize(clasz);
        System.out.println(relativize);



    }
}
