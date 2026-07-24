package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private int id;
    private String nomeManga;
    private Double preco;
    private int quantidade;

    public Manga(int id, String nomeManga, Double preco) {
        Objects.requireNonNull(id, "Id nao pode ser nulo");
        Objects.requireNonNull(nomeManga, "nome nao pode ser nulo");
        this.id = id;
        this.nomeManga = nomeManga;
        this.preco = preco;
    }

    public Manga(int id, String nomeManga, Double preco, int quantidade) {
        this(id,nomeManga,preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && Objects.equals(nomeManga, manga.nomeManga);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeManga);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nomeManga='" + nomeManga + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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

//        if (this.id < outroMnaga.getId()){
//            return -1;
//
//        }else if (this.id > outroMnaga.getId()){
//            return 1;
//
//        }else {
//            return 0;
//        }
        return this.nomeManga.compareTo(outroMnaga.getNomeManga());
    }
}
