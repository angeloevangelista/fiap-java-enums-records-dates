import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class ExemploLocalDate {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        LocalDate diaDaIndependencia = LocalDate.of(1822, Month.SEPTEMBER, 7);

        Period periodoEntreDatas = Period.between(diaDaIndependencia, agora);

        String proximoDiaDaIndependecia = LocalDate.
                now().
                withYear(2025).
                withMonth(Month.SEPTEMBER.getValue()).
                withDayOfMonth(7).
                getDayOfWeek().
                name();

        System.out.println(agora);
        System.out.println(periodoEntreDatas.getYears());
        System.out.println(proximoDiaDaIndependecia);
    }
}
