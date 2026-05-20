package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Alagoas");
        endereco.setCep("24306-123");

        Pessoa pessoa = new Pessoa("Naruto");
        pessoa.setCpf("157.896.568-03");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("=====================================");

        Funcionario funcionario = new Funcionario("Kakashi");
        funcionario.setCpf("123.445.678-08");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3200.00);

        funcionario.imprime();
    }
}
