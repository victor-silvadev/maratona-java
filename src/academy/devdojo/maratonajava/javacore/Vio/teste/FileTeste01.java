package academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;

public class FileTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {


            boolean exists = file.exists();
            if(exists){
                System.out.println("Deletado "+file.delete());

            } else {
                boolean isCreated = file.createNewFile();
                System.out.println("Criado "+isCreated );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
