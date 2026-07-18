package academy.devdojo.maratonajava.javacore.ZZgconcorrencia.teste;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTeste01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Victor");
        System.out.printf("%s Added the value %s%n", Thread.currentThread().getName(), bq.peek());
        System.out.println("Trying to add another value");
        System.out.printf("%s Added the value %s%n", Thread.currentThread().getName(), bq.peek());
    }

    static class RemoveFromQueue implements Runnable{
        private final BlockingQueue<String> bq;

        public RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s going sleep for 2 seconds %s%n", Thread.currentThread().getName());

            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("%s removing  value from queue %s%n", Thread.currentThread().getName(), bq.take());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
