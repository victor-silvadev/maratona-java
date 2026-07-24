package academy.devdojo.maratonajava.introducao;

public class Aula06estruturasDeRepeticoes02 {
    public static void main(String[] args) {
        int numero = 4;

        while (numero < 100){
            numero++;
            if(numero % 2 == 0){
                System.out.println(numero);
            } else {
                System.out.println("");
            }
        }
    }
}
