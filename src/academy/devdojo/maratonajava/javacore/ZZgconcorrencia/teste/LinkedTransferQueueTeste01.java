package academy.devdojo.maratonajava.javacore.ZZgconcorrencia.teste;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTeste01 {
    public static void main(String[] args) {
        TransferQueue<Object> tq =  new LinkedTransferQueue<>();
        System.out.println(tq.add("Victor"));
    }
}
