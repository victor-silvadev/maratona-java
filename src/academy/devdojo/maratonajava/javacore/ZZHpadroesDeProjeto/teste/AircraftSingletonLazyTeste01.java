package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.teste;

import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio.AircraftSingletonLazzy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTeste01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonLazzy.getINSTANCE());
        System.out.println(AircraftSingletonLazzy.getINSTANCE());
        Constructor<AircraftSingletonLazzy> declaredConstructor = AircraftSingletonLazzy.class.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        AircraftSingletonLazzy aircraftSingletonLazzy = declaredConstructor.newInstance("787-900");
        System.out.println(aircraftSingletonLazzy);
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonLazzy.getINSTANCE());
        AircraftSingletonLazzy aircraft = AircraftSingletonLazzy.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
