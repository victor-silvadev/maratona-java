package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 23;
        dias[0][2] = 21;

        dias[1][0] = 32;
        dias[1][1] = 24;
        dias[1][2] = 22;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("Posição [" + i + "][" + j + "] = " + dias[i][j]);

            }
        }
        System.out.println("-----------------------------");


        for (int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println("Posição = " +num);
            }
        }


    }
}
