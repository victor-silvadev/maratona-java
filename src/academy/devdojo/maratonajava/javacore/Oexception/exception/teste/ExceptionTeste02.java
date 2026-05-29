package academy.devdojo.maratonajava.javacore.Oexception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste02 {
    public static void main(String[] args) throws IOException {
         criaNovoArquivo();
    }

    private static void criaNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);

        }catch (IOException e){
            e.printStackTrace();
            throw e;

        }
    }
}
