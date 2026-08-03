package academy.devdojo.maratonajava.javacore.ZZKjUnit.service;

import academy.devdojo.maratonajava.javacore.ZZKjUnit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class PersonServiceTest {
private Person adult;
private Person notAdult;
private PersonService personService;
    @BeforeEach
    public void setUp(){
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }

    @Test
    @DisplayName("A person should bo adult when age is lower than 18")
    void isAdult_ReturnFalse_WhenAngeIsLowerThan18() {
        Assertions.assertFalse(personService.isAdult(notAdult));
    }


    @Test
    @DisplayName("A person should bo adult when age is greater or equal than 18")
    void isAdult_ReturnTrue_WhenAngeIsGreatOrEqualsThan18() {
        Assertions.assertTrue(personService.isAdult(adult));
    }


    @Test
    @DisplayName("Should throw NullPointerException with message person is null")
    void isAdultShouldThrowExceprion_WhenPersonisNull() {
        Assertions.assertThrows(NullPointerException.class, () -> personService.isAdult(null));
    }
}