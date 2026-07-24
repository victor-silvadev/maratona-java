package academy.devdojo.maratonajava.javacore.Uregex.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = busca todos os digitos
        // \D = busca tudo oque nao for digito
        // \s = busca todos os espaços em branco "\t \n \f \r"
        // \S = busca todos os caracteres menos os espaçoes
        // \w = busca tudas as letras a-Z, digitos, _
        // \W = busca tudo que nao for incluso no \w
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m} de n ate m
        // () agrupa comandos passados no pattern
        // | esse e o "ou"
        // $ fim da linha
        // . 1.3 = 123 1.23 1@3, 1e3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "naruto@gmail.com, victor22@hotmail.com, &*$sake@mail.br";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group()+"\n");
        }

    }
}
