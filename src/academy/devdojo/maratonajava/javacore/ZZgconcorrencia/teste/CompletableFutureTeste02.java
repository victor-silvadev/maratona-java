package academy.devdojo.maratonajava.javacore.ZZgconcorrencia.teste;

import academy.devdojo.maratonajava.javacore.ZZgconcorrencia.service.StoreService;

public class CompletableFutureTeste02 {
    public static void main(String[] args) {

    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService){
        long start = System.currentTimeMillis();

        storeService.getPriceSync("Store 1");
    }
}
