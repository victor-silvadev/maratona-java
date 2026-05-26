package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivos;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivos();
        repositorio.salvar();
    }
}
