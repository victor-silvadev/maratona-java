package academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Prfessora six seven, vinte mais vinte mais vinte mais sete");
            bw.newLine();
            bw.flush();

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
