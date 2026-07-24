package academy.devdojo.maratonajava.javacore.ZZgconcorrencia.teste;

import academy.devdojo.maratonajava.javacore.ZZgconcorrencia.service.StoreService;

public class CompletableFutureTeste01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPriceSync(storeService);
    }

    private static void searchPriceSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed searchPriceSync %d\n",(end-start));
    }
}
