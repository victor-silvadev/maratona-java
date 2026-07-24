package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        System.out.println( dvisao(1, 0));
    }

    private static int dvisao(int a, int b){
        if (b == 0){
            throw new RuntimeException("Argumento ilegal");
        }
        return a/b;
    }
}
