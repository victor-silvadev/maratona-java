package academy.devdojo.maratonajava.javacore.ZZgconcorrencia.service;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreService {

    public double getPriceSync(String storename){
        System.out.printf("Getting prices sync for store %S\n",storename);
        return priceGenerator();
    }

    private double priceGenerator(){
        System.out.printf("%s generating price \n",Thread.currentThread().getName());
        return ThreadLocalRandom.current().nextInt(1,500) * 10;
    }

    private void delay() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }
}
