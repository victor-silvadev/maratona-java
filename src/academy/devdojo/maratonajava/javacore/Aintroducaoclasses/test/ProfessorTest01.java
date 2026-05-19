package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor profeesor = new Professor();
        profeesor.nome = "Mestre";
        profeesor.idade = 41;
        profeesor.sexo = 'M';

        System.out.println(profeesor.nome + " " + profeesor.idade + " " + profeesor.sexo);

    }
}
