package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste01 {
        private static List<Car> car = List.of(new Car("green",2011), new Car("black",1998), new Car("red",2019));



    public static void main(String[] args) {
        System.out.println( filterGreenCar(car));
        System.out.println( filterCarByColor(car,"red"));
        System.out.println( filterCarAge(car,2000));
    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars){
            if (car.getColor().equals("green")){
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color){
        List<Car> CarsColor = new ArrayList<>();
        for (Car car : cars){
            if (car.getColor().equals(color)){
                CarsColor.add(car);
            }
        }
        return CarsColor;
    }

    private static List<Car> filterCarAge(List<Car> cars, int year){
        List<Car> CarsYear = new ArrayList<>();
        for (Car car : cars){
            if (car.getYear() < year){
                CarsYear.add(car);
            }
        }
        return CarsYear;
    }





}
