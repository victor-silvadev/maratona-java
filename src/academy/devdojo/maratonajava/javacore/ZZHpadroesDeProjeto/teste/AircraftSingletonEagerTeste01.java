package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.teste;

import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio.Aircraft;
import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTeste01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANCE());
        AircraftSingletonEager aircraft = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
