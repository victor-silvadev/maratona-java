package academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;


public class FileTeste02 {
    public static void main(String[] args) throws IOException {
        // Criando Arquivos

        File fileDiretorio = new File("pasta");
        boolean isDiretoriooCriado = fileDiretorio.mkdir();
        System.out.println(isDiretoriooCriado);

        File fileArquiivoDiretorio = new File(fileDiretorio,"arquivo.txt");
        boolean isFileCreated = fileArquiivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        // Renomeando Arquivos

        File fileRename = new File(fileDiretorio ,"arquivo_renomeado.txt");
        boolean isRename = fileArquiivoDiretorio.renameTo(fileRename);
        System.out.println(isRename);

        File diretorioRename = new File("pasta2");
        boolean isDiretorioRename = fileDiretorio.renameTo(diretorioRename);
        System.out.println(isDiretorioRename);
    }
}
