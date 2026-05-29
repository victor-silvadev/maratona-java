package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {

    }

    private static String abreConecxao(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevdendo dados no arquivo");
            return "conexão aberta";

        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            System.out.println("Fechando recurso liberado pelo SO");

        }
        return null;
    }


    private static String abreConecxao2(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevdendo dados no arquivo");

        }finally {
            System.out.println("Fechando recurso liberado pelo SO");

        }
        return null;
    }
}
