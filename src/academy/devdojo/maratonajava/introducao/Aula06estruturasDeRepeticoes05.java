package academy.devdojo.maratonajava.introducao;

public class Aula06estruturasDeRepeticoes05 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("parcela "+ parcela+ " R$ "+valorParcela);
        }



        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Aqui o Java diz: "Pule o que resta e volte para o topo!"
            }
            System.out.println("Número: " + i);
        }
    }
}

