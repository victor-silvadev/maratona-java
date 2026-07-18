package academy.devdojo.maratonajava.javacore.ZZFthreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;


    public boolean isOpen(){
        return open;
    }
    public int pendingEmails(){
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email){
        synchronized (this.emails){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "Adicionou email na lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retreiveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "checking if there are emails");
        synchronized (emails){
            while (this.emails.size() == 0){
                if (!open) return null;
                System.out.println(Thread.currentThread().getName()+ " Nao tem email disponivel na lista, entrando em modo de espera");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void closed(){
        open = false;
        synchronized (emails) {
            System.out.println(Thread.currentThread().getName()+ "Notificando todo mundo que nao pegamos mais emails");
            this.emails.notifyAll();
        }
    }
}