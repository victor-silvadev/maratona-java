package academy.devdojo.maratonajava.javacore.Qstring.teste;

import java.awt.*;

public class StringPerformTeste01 {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatenaString(1_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String "+(fim - inicio)+" ms");


        inicio = System.currentTimeMillis();
        concatenaStringBilder(30_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBilder "+(fim - inicio)+" ms");


        inicio = System.currentTimeMillis();
        concatenaStringBuffer(10_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer "+(fim - inicio)+" ms");
    }


    private static void concatenaString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto +=i;
        }
    }

    private static void concatenaStringBilder(int tamanho){
        StringBuilder sb  = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatenaStringBuffer(int tamanho){
        StringBuffer sb  = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
