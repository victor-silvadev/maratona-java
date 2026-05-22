package academy.devdojo.maratonajava.javacore.Lclassesabristatas.teste;

import academy.devdojo.maratonajava.javacore.Lclassesabristatas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabristatas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabristatas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Namy", 5500);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Victor",  11200);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
