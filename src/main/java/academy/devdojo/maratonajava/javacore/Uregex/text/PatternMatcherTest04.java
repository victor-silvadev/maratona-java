package academy.devdojo.maratonajava.javacore.Uregex.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFAABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group()+"\n");
        }

    }
}
