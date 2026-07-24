package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements Dataloader, DataRemover{
    // private -> default -> protected -> public

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes no banco de dados");
    }
}
