package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste02 {
        private static List<Car> car = List.of(new Car("green",2011), new Car("black",1998), new Car("red",2019));


    public static void main(String[] args) {
//        filter(car, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });

        List<Car> greenCars = filter(car,car -> car.getColor().equals("green"));
        List<Car> carsYears = filter(car,car -> car.getYear() < 2011);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars){
            if (carPredicate.test(car)){
                filterCars.add(car);
            }
        }
        return filterCars;
    }
}
