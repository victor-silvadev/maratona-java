package academy.devdojo.maratonajava.javacore.ZZKjUnit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {
    private Employee employeeDeveloper;

    @Test
    public void intanceOf_ExecuteChildClassMethodo(){
    Employee employeeDeveloper = new Developer("1","Java");

    if (employeeDeveloper instanceof Developer){
        Developer developer = (Developer) employeeDeveloper ;
        Assertions.assertEquals("Java",developer.getMainLanguage());
    }

    if (employeeDeveloper instanceof Developer developer){
        Assertions.assertEquals("Java",developer.getMainLanguage());
    }
    }
}