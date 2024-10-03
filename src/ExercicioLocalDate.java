import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class ExercicioLocalDate {
    public static void main(String[] args) {
        Scanner scannerPadrao = new Scanner(System.in);

        System.out.print("Informe a data da consulta (YYYY-MM-DD): ");
        String dataConsultaInput = scannerPadrao.nextLine();
        LocalDate dataConsulta = LocalDate.parse(dataConsultaInput);

        if (dataConsulta.isBefore(LocalDate.now())) {
            System.out.println("Você não pode agendar a consulta para uma data passada");
            scannerPadrao.close();
            return;
        }

        LocalDate dataRetorno = dataConsulta.plusDays(30);

        // Voce pode usar um loop...
        //  while (
        //      dataRetorno.getDayOfWeek() == DayOfWeek.SATURDAY ||
        //      dataRetorno.getDayOfWeek() == DayOfWeek.SUNDAY
        //  ) {
        //      dataRetorno = dataRetorno.plusDays(1);
        //  }

        // Ou garantir que a data é a próxima Segunga-feira após o fim de semana
        if (
            dataRetorno.getDayOfWeek() == DayOfWeek.SATURDAY ||
            dataRetorno.getDayOfWeek() == DayOfWeek.SUNDAY
        ) {
            dataRetorno = dataRetorno.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        }

        LocalDate dataLembrete = dataRetorno.minusDays(3);

        System.out.printf("A data do retorno será: %s\n", dataRetorno);
        System.out.printf("Você receberá um lembrete no dia: %s\n", dataLembrete);

        scannerPadrao.close();
    }
}
