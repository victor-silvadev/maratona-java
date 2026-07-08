package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

public class LigthNovel {
    private String title;
    private double price;

    public LigthNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }


    @Override
    public String toString() {
        return "LigthNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
