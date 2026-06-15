package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.nio.file.*;

public class PathMatcherTeste01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta1/file.bkp");
        Path path2 = Paths.get("pasta/subpasta1/file.txt");
        Path path3 = Paths.get("pasta/subpasta1/file.java");

        matchers(path1, "glob:**/*.{bkp,txt}");

    }

    private static void matchers(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
