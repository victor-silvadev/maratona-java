package academy.devdojo.maratonajava.javacore.Gacossiacao.Exercicio.dominio;

public class Seminario {
    private String titulo;
    private Local local;
    private Professor professor;
    private Aluno[] alunos;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Professor professor) {
        this.titulo = titulo;
        this.local = local;
        this.professor = professor;
    }

    public Seminario(String titulo, Local local, Professor professor, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.professor = professor;
        this.alunos = alunos;
    }

    public void imprime(){
        if (alunos == null){
            System.out.println(this.titulo+", Local: "+local.getEndereco());
            System.out.println("Professor - "+professor.getNome()+", Materia: "+professor.getEspecialidade());
            System.out.println(" ");
            System.out.println("SEM ALUNOS RESITRADOS!");
            System.out.println(" ");

        } else {
            System.out.println(this.titulo+", Local: "+local.getEndereco());
            System.out.println(" ");
            System.out.println("Professor - "+professor.getNome()+", Materia: "+professor.getEspecialidade());
            System.out.println(" ");
            System.out.println("Alunos registrados:");
            System.out.println(" ");
            for (Aluno aluno : alunos) {
                System.out.println("- "+aluno.getNome()+", idade: "+aluno.getIdade());
            }
        }
    }































    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
