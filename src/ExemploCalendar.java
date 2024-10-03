import java.util.Calendar;
import java.util.Date;

public class ExemploCalendar {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        agora.set(Calendar.YEAR, 2025);
        agora.roll(Calendar.DAY_OF_MONTH, 8);

        System.out.printf(
                "Dia %s, Mês %s, Ano %s. Hora %s, minutos %s",
                agora.get(Calendar.DAY_OF_MONTH),
                agora.get(Calendar.MONTH),
                agora.get(Calendar.YEAR),
                agora.get(Calendar.HOUR_OF_DAY),
                agora.get(Calendar.MINUTE)
        );
    }
}
