package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("dentro do bloco inicializaçao estatico de funcionario");
    }

    {
        System.out.println("dentro do bloco de inicializaçao de funcionario 1");
    }

    {
        System.out.println("dentro do bloco de inicializaçao de funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("dentro do construtor de funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu - "+this.nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
