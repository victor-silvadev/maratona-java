package academy.devdojo.maratonajava.javacore.ZZgconcorrencia.teste;




import academy.devdojo.maratonajava.javacore.ZZgconcorrencia.dominio.Members;
import academy.devdojo.maratonajava.javacore.ZZgconcorrencia.service.EmailDeliveryService;

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
