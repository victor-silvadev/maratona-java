package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionarios {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salario) {
            System.out.println(salario +" ");
        }
    }

    public void mediaSalarial(){

        for(double salarios : salario){
            media += salarios;
        }
        media /= salario.length;
        System.out.println("Medioa Salarial "+ media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}
