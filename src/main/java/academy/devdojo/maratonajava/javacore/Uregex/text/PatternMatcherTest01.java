package academy.devdojo.maratonajava.javacore.Uregex.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String texto = "abbbjjaboeeeertaabdfrfdab";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find()){
            System.out.println(matcher.start()+" ");
        }

    }
}
