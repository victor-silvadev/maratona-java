package academy.devdojo.maratonajava.introducao;

public class Aula06estruturasDeRepeticoes01 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10){
            count++;
        System.out.println(count);
        }
        do {
            System.out.println("o do foi executado");
        } while (count < 10);

        for(int i = 0; i < 10; i++){
            System.out.println("for "+ i);
        }
    }
}
