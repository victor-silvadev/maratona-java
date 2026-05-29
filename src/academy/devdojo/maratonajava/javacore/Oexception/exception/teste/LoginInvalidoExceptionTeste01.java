package academy.devdojo.maratonajava.javacore.Oexception.exception.teste;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidException e) {
            throw new RuntimeException(e);
        }
    }


    private static void logar() throws  LoginInvalidException {
        Scanner teclado = new Scanner(System.in);

        String usernameDB = "Naruto";
        String senhaDB = "2208";
        System.out.println("Usuario:");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha:");
        String senhaDigitado = teclado.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado)){
            throw new LoginInvalidException("Usuario ou senha invalida");
        }

        System.out.println("Usuario logado com sucesso");
    }
}
