import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime diaDaIndependencia = LocalDateTime.of(1822, Month.SEPTEMBER, 7, 16, 30, 0);

        DateTimeFormatter meuFormatter = DateTimeFormatter.ofPattern("'Dia' dd, 'Mes' MM, 'Ano' yyyy HH:mm:ss");

        LocalDateTime agora = LocalDateTime.parse("Dia 02, Mes 10, Ano 2024 21:12:00", meuFormatter);

        System.out.println(diaDaIndependencia.format(meuFormatter));
        System.out.println(agora);
    }
}
