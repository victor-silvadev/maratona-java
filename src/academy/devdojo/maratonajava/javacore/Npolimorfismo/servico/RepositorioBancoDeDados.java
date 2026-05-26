package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {



    @Override
    public void salvar() {
        System.out.println("salvando no banco de dados");
    }
}
