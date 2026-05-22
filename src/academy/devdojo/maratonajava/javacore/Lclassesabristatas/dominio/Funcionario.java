package academy.devdojo.maratonajava.javacore.Lclassesabristatas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected  double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }



    public abstract void calcularBonus();
}
