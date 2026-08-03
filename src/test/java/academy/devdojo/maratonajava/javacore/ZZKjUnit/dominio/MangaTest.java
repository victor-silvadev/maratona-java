package academy.devdojo.maratonajava.javacore.ZZKjUnit.dominio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MangaTest {
    private Manga manga1;
    private Manga manga2;

    @BeforeEach
    public void setUp(){
        manga1 = new Manga("Naruto",950);
        manga2 = new Manga("Naruto",950);
    }

    @Test
    public void accesoras_Return_Data_WhenInitialized(){
        Assertions.assertEquals("Naruto",manga1.name());
        Assertions.assertEquals(950,manga1.episodes());
    }

    @Test
    public void equals_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assertEquals(manga1,manga2);
    }

    @Test
    public void hashCode_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assertEquals(manga1.hashCode(),manga2.hashCode());
    }

}