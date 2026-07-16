package academy.devdojo.maratonajava.javacore.ZZFthreads.teste;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Members;
import academy.devdojo.maratonajava.javacore.ZZFthreads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTeste01 {
    public static void main(String[] args) {
        Members member = new Members();
        Thread naruto = new Thread(new EmailDeliveryService(member), "Naruto");
        Thread saske = new Thread(new EmailDeliveryService(member), "Saske");
        naruto.start();
        saske.start();

        while (true){
            String email = JOptionPane.showInputDialog("Entre com seu  email");
            if (email == null || email.isEmpty()){
                member.closed();
                break;
            }

            member.addMemberEmail(email);
        }
    }
}
