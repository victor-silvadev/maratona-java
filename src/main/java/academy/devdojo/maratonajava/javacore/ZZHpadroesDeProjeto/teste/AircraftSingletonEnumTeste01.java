package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.teste;

import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio.AircraftSingletonEnum;

public class AircraftSingletonEnumTeste01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }


    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
