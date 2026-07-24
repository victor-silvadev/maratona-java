package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "vou doar";
        String MensagemNaoDoar = "Nao vou doar";
        //(condiçao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : MensagemNaoDoar;

        System.out.println(resultado);

    }
}
