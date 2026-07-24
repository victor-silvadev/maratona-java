package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTeste01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1, "Victor", "40028922");
        Turma turma = new Turma("Os sem saude mental apos o JAVA");
        aluno.setTurma(turma);
        serealizar(aluno);
        deserealizar();
    }

    private static void serealizar(Aluno aluno)  {
        Path path = Paths.get("pasta\\aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);

        } catch (IOException e){
            e.printStackTrace();
        }
    }


    private static void deserealizar()  {
        Path path = Paths.get("pasta\\aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno =(Aluno) ois.readObject();
            System.out.println(aluno);

        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
