public class ExemploEnumAndRecords {
    public static void main(String[] args) {
        DiasDaSemana diaQualquer = DiasDaSemana.TERCA;

        if (diaQualquer.ehFimDeSemana) {
            System.out.println("Opa! Fim de semana");
        }

        //////

        AlunoRecord aluno = new AlunoRecord("Lucas");

        System.out.println(aluno);
        System.out.println("O aluno se chama " + aluno.nome());
        System.out.println("O aluno tem " + aluno.idade() + " anos");
    }

    //    - Crie uma Record para um estudante
    //    - Vamos guardar o nome dele e mais 3 notas das provas que ele fez
    //    - Adicione um método para retornar a situação desse aluno baseado nas notas das provas
    //    - Um aluno é considerado APROVADO se a média de suas notas for igual ou superior a 7
}