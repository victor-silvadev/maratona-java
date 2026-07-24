package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {
    try{
        throw new RuntimeException();

    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Dentro do ArrayIndexOutOfBoundsException");

    }catch (IndexOutOfBoundsException e){
        System.out.println("dentro do IndexOutOfBoundsException");

    }catch (IllegalArgumentException e){
        System.out.println("dentro do IllegalArgumentException");

    }catch (ArithmeticException e){
        System.out.println("dentro do ArithmeticException");

    }catch (RuntimeException e){
        System.out.println("dentro da RuntimeException");
    }


    try{
        talvesLanceExeption();
    }catch (SQLException | FileNotFoundException e) {
        e.printStackTrace();
    }

    }

    private static void talvesLanceExeption() throws SQLException, FileNotFoundException{

    }

}
