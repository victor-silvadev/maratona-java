package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTeste02 {
    //    0 - bloco de inicializaçao estatica da super classe e executado quando a JVM carrega classe pai
    //    1 - bloco de inicializaçao estatica da sub classe e executado quando a JVM carrega classe filha

    //    2 - alocado espaço em memoria pro objeto da superclasse
    //    3 - cada atributo de superclasse e criado e inicializado com valores default ou que forem impostos da classe pai
    //    4 - bloco de inicializaçao da superclasse e executado na ordem em que aparece
    //    5 - construtor da superclasse e executado

    //    6 - alocado espaço em memoria pro objeto da subclasse
    //    7 - cada atributo de subclasse e criado e inicializado com valores default ou que forem impostos da classe pai
    //    8 - bloco de inicializaçao da subclasse e executado na ordem em que aparece
    //    9 - construtor da sublasse e executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Madara");

    }
}
