package academy.devdojo.maratonajava.javacore.ZZgconcorrencia.teste;

import java.util.concurrent.*;

public class FutureTeste01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        Future<?> dollar = scheduledExecutorService.submit(() -> {
            TimeUnit.SECONDS.sleep(5);
            return 4.35D;
        });
        System.out.println(doSomething());
        Object dollarResponse = dollar.get(3,TimeUnit.SECONDS);
        System.out.println("Dollar : "+dollarResponse);
        scheduledExecutorService.shutdown();
    }

    private static long doSomething(){
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000; i++) {
            sum += i;
        }
        return sum;
    }
}
