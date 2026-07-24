package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazzy {
    private static  AircraftSingletonLazzy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;


    private AircraftSingletonLazzy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

        public static AircraftSingletonLazzy getINSTANCE(){
            if (INSTANCE == null) {
                synchronized (AircraftSingletonLazzy.class) {
                    if (INSTANCE == null) {
                        INSTANCE = new AircraftSingletonLazzy("787-900");

                    }
                }
            }
            return INSTANCE;
        }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
