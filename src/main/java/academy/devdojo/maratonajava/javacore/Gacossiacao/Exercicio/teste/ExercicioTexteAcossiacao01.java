package academy.devdojo.maratonajava.javacore.Gacossiacao.Exercicio.teste;

import academy.devdojo.maratonajava.javacore.Gacossiacao.Exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gacossiacao.Exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gacossiacao.Exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gacossiacao.Exercicio.dominio.Seminario;

public class ExercicioTexteAcossiacao01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("joao", 17);
        Aluno aluno2 = new Aluno("gustavo", 13);

        Aluno[] alunos = {aluno, aluno2};

        Professor professor = new Professor("jean", "Matematica");
        Professor professor2 = new Professor("bruno", "Geografia");

        Local local = new Local("Rua goitacases");
        Local local2 = new Local("Rua Jardim das flores");

        Seminario seminario = new Seminario("Brincando com numeros", local, professor, alunos);
        Seminario seminario2 = new Seminario("Teorias do mundo", local2, professor2);


        seminario.imprime();

        System.out.println("=================================");

        seminario2.imprime();
    }
}
