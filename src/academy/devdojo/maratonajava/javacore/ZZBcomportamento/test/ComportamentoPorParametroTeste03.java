package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTeste03 {
        private static List<Car> car = List.of(new Car("green",2011), new Car("black",1998), new Car("red",2019));


    public static void main(String[] args) {

        List<Car> greenCars = filter(car,car -> car.getColor().equals("green"));
        List<Car> carsYears = filter(car,car -> car.getYear() < 2011);
    }


    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filterRedList = new ArrayList<>();

        for (T e : list){
            if (predicate.test(e)){
                filterRedList.add(e);
            }
        }
        return filterRedList;
    }

}
