import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ExemploInstant {
    public static void main(String[] args) {
        Instant agora = Instant.now();

        Instant daquiADezMinutos = agora.plus(10, ChronoUnit.MINUTES);

        System.out.println(agora);
        System.out.println(daquiADezMinutos);

        ////

//        int counter = 0;
//        int counterLimit = 1_000_000;
//
//        Instant startInstant = Instant.now();
//
//        for (int i = 0; i < counterLimit; i++) {
//            counter++;
//            System.out.println(counter);
//        }
//
//        Instant endInstant = Instant.now();
//
//        Duration countDuration = Duration.between(startInstant, endInstant);
//
//        System.out.printf(
//                "Contei até: %s. Isso levou %s milissegundos",
//                counter,
//                countDuration.toMillis()
//        );
    }
}
