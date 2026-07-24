package academy.devdojo.maratonajava.javacore.ZZFthreads.teste;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTeste01 implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTeste01 threadAccountTeste01 = new ThreadAccountTeste01();
        Thread t1 = new Thread(threadAccountTeste01, "Lestia ");
        Thread t2 = new Thread(threadAccountTeste01, "Bornechira ");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);

            if (account.getBalance() < 0){
                System.out.println("FOUDE-O");
            }
        }
    }

    private synchronized void withdrawal(int amount){
        if (account.getBalance() >= amount){
            System.out.println(getThreadName() + "esta indo sacar dinheiro");
            account.withdrawal(amount);
            System.out.println(getThreadName() + "completou o saque, valor atual da conta" + account.getBalance());
        }else {
            System.out.println("Nao tem dinheiro para "+ getThreadName() + "efetuar o sque "+account.getBalance());
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
