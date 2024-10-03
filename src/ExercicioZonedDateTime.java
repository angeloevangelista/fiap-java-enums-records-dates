import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioZonedDateTime {
    public record Estudante(String nome, String zoneId) {
        public Estudante(String nome, String zoneId) {
            try {
                ZoneId.of(zoneId);
            } catch (Exception e) {
                throw new RuntimeException("ZoneId inválida");
            }

            this.nome = nome;
            this.zoneId = zoneId;
        }
    };

    public record Aula(String nome, ZonedDateTime horario) {
        public String toString() {
            return String.format(
                "Nome: %s | Horário: %s",
                this.nome,
                this.horario.toString()
            );
        }
    };

    public static void main(String[] args) {
        Scanner scannerPadrao = new Scanner(System.in);

        List<Estudante> estudantes = getEstudantes();
        List<Aula> aulas = getAulas();

        System.out.println("Alunos: ");
        for (int i = 0; i < estudantes.size(); i++) {
            System.out.printf("%s - %s: \n", i, estudantes.get(i).toString());
        }

        System.out.print("Informe o seu ID: ");
        int estudanteIndex = scannerPadrao.nextInt();

        System.out.println("Aulas: ");
        for (int i = 0; i < aulas.size(); i++) {
            System.out.printf("%s - %s: \n", i, aulas.get(i).toString());
        }

        System.out.print("Escolha a aula: ");
        int aulaIndex = scannerPadrao.nextInt();

        ZonedDateTime classRoomTimeWithZone = aulas.get(aulaIndex).horario.withZoneSameInstant(
            ZoneId.of(estudantes.get(estudanteIndex).zoneId)
        );

        System.out.printf("Sua aula iniciará: %s\n", classRoomTimeWithZone);
        scannerPadrao.close();
    }

    private static List<Estudante> getEstudantes() {
        List<Estudante> estudantes = new ArrayList<Estudante>() {};

        estudantes.add(new Estudante("Anna", "Africa/Sao_Tome"));
        estudantes.add(new Estudante("Lucas", "Europe/Rome"));
        estudantes.add(new Estudante("Bruno", "Pacific/Galapagos"));
        estudantes.add(new Estudante("Fernanda", "America/Sao_Paulo"));
        estudantes.add(new Estudante("Clarice", "Europe/London"));

        return estudantes;
    }

    private static List<Aula> getAulas() {
        List<Aula> classRooms = new ArrayList<Aula>() {};

        classRooms.add(new Aula(
            "Francês",
            ZonedDateTime.of(
                2024,
                10,
                10,
                16,
                0,
                0,
                0,
                ZoneId.systemDefault()
            )
        ));

        classRooms.add(new Aula(
            "Italiano",
            ZonedDateTime.of(
                2024,
                10,
                10,
                16,
                0,
                0,
                0,
                ZoneId.systemDefault()
            )
        ));
        return classRooms;
    }
}
