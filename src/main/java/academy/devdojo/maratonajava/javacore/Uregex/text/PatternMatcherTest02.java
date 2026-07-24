package academy.devdojo.maratonajava.javacore.Uregex.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = busca todos os digitos
        // \D = busca tudo oque nao for digito
        // \s = busca todos os espaços em branco "\t \n \f \r"
        // \S = busca todos os caracteres menos os espaçoes
        // \w = busca tudas as letras a-Z, digitos, _
        // \W = busca tudo que nao for incluso no \w
        String regex = "\\W";
        String texto = "ãbbjjabõfdab";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group()+"\n");
        }

    }
}
