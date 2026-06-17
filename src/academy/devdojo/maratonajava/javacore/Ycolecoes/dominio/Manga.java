package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private int id;
    private String nomeManga;
    private Double preco;

    public Manga(int id, String nomeManga, Double preco) {
        Objects.requireNonNull(id, "Id nao pode ser nulo");
        Objects.requireNonNull(nomeManga, "nome nao pode ser nulo");
        this.id = id;
        this.nomeManga = nomeManga;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && Objects.equals(nomeManga, manga.nomeManga) && Objects.equals(preco, manga.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeManga, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nomeManga='" + nomeManga + '\'' +
                ", preco=" + preco +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeManga() {
        return nomeManga;
    }

    public void setNomeManga(String nomeManga) {
        this.nomeManga = nomeManga;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga outroMnaga) {

        if (this.id < outroMnaga.getId()){
            return -1;

        }else if (this.id > outroMnaga.getId()){
            return 1;

        }else {
            return 0;
        }
    }
}
