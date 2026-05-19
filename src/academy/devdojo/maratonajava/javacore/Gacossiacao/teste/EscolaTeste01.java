package academy.devdojo.maratonajava.javacore.Gacossiacao.teste;

import academy.devdojo.maratonajava.javacore.Gacossiacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gacossiacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor("guilherme");
        Professor professor2 = new Professor("jean");
        Professor[] professores = {professor, professor2
        };
        Escola escola = new Escola("Estrada nori doria", professores);

        escola.imprime();
    }
}
