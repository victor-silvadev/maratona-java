package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTeste01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path  aquivosParaZipar = Paths.get("C:\\Users\\conta\\Documents\\estudos\\JAVA\\maratona-java\\pasta\\subPasta1\\");
        zip(arquivoZip, aquivosParaZipar);

    }


    private static void zip(Path arquivoZip, Path arquivosParaZipar){
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) {

            for (Path file : directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Sucesso!");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
