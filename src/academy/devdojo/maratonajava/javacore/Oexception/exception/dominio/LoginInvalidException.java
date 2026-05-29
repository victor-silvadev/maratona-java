package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class LoginInvalidException extends Exception{
    public LoginInvalidException() {
        super("Login invalido");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}
