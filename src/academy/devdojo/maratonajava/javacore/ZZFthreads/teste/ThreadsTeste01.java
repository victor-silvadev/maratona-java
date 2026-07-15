package academy.devdojo.maratonajava.javacore.ZZFthreads.teste;


class ThreadExample extends Thread{
private final  char c;

    public ThreadExample(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 50; i++){
            System.out.print(c);

            if (i % 100 == 0){
                System.out.println();
            }
        }
    }
}

class ThreadExempleRunnable implements Runnable{
    private final  char c;

    public ThreadExempleRunnable(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 50; i++) {
            System.out.print(c);

            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

public class ThreadsTeste01 {
    public static void main(String[] args) {
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');
        Thread t1 = new Thread(new ThreadExempleRunnable('A'));
        Thread t2 = new Thread(new ThreadExempleRunnable('B'));
        Thread t3 = new Thread(new ThreadExempleRunnable('C'));
        Thread t4 = new Thread(new ThreadExempleRunnable('D'));
    }
}
