import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class ExemploLocalTime {
    public static void main(String[] args) {
        LocalTime meioDia = LocalTime.of(12, 00);
        LocalTime horaDaIndependencia = LocalTime.of(16, 30);

        if (horaDaIndependencia.isBefore(meioDia)) {
            System.out.println("O grito da independiancia foi antes do meio dia");
        } else {
            System.out.println("O grito da independiancia foi depois do meio dia");
        }
    }
}
