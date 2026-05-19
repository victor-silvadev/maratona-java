package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros1 = {1, 2, 3, 4, 5};
        int[] numeros2 = new int[]{1, 2, 3, 4};

        for (int i = 0; i < numeros1.length; i++) {
            System.out.println(numeros1[i]);
        }

        for (int num:numeros2){
            System.out.println();
        }
    }
}
