package academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)){
            fw.write("Prfessora six seven\n vinte mais vinte mais vinte mais sete");
            fw.flush();

        } catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
