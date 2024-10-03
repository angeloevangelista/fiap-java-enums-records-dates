import java.time.*;
import java.util.Set;

public class ExemploZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime diaDaIndependenciaDoBrazil = ZonedDateTime.of(
                1822,
                Month.SEPTEMBER.getValue(),
                7,
                16,
                30,
                0,
                0,
                ZoneId.systemDefault()
        );

        ZonedDateTime diaDaIndependenciaDoBrazilEmLondres = diaDaIndependenciaDoBrazil.
                withZoneSameInstant(ZoneId.of("Europe/London"));

//        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
//
//        for (String zoneId: zoneIds) {
//            System.out.println(zoneId);
//        }

        //America/Bahia
        //Europe/London


        System.out.println(diaDaIndependenciaDoBrazil);
        System.out.println(diaDaIndependenciaDoBrazilEmLondres);
    }
}
