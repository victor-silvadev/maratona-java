package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidException, FileNotFoundException{
        System.out.println("Salvando pessoa");
    }
}
