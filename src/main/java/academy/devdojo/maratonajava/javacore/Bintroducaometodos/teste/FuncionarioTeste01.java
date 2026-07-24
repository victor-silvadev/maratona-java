package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionarios;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();
        funcionarios.setNome( "Jose");
        funcionarios.setIdade(43);
        funcionarios.setSalario( new double[]{1.245, 2.234, 480.59});

        funcionarios.imprime();
        funcionarios.mediaSalarial();
    }
}
