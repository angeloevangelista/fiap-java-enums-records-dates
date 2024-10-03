public class ExercicioEnumAndRecords {
    public enum GradeStatus {
        APPROVED("Aprovado"),
        REPROVED("Reprovado");

        public final String status;

        private GradeStatus(String status) {
            this.status = status;
        }
    }

    public record Student(String nome, double n1, double n2, double n3) {
        private static final String toStringTemplate = "A média do aluno foi %1s e ele está %2s.";

        public double getAverage() {
            return (n1 + n2 + n3) / 3;
        }

        public GradeStatus getGradeStatus() {
            double gradeAverage = this.getAverage();

            if(gradeAverage >= 7) {
                return GradeStatus.APPROVED;
            } else {
                return GradeStatus.REPROVED;
            }
        }

        @Override()
        public String toString() {
            return String.format(toStringTemplate, getAverage(), getGradeStatus().status);
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Lucas", 8, 7, 10);

        System.out.println(student);
    }
}
