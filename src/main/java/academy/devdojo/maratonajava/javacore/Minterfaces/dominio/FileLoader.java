package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements Dataloader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de um arquivo");
    }

    @Override
    public void checkPermission() {
        Dataloader.super.checkPermission();
        System.out.println("Checando permissoes no banco de um arquivo");
    }
}
