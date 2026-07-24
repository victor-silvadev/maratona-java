package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {

    public static void main(String[] args) {
        int idade = 20;

        if(idade > 20) {
            System.out.println("pode tomar bebida alcolica");
        } else {

            System.out.println("Nao pode tomar bebida alcolica");
        }

        int categoria = 20;

        if(categoria < 15) {
            System.out.println("juvenil");
        } else if(categoria < 17) {
            System.out.println("sub17");
        } else if(categoria < 21) {
            System.out.println("base");
        } else {
            System.out.println("profisional");
        }
    }
}
