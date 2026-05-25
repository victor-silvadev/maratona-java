package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface Dataloader {
    // interface sao public abstract por padrao

    void load();

    default void checkPermission(){
        System.out.println("Fazedo checagem de permissoes");
    }
}
