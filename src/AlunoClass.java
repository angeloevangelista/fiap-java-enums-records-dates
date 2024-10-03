public class AlunoClass {
    private final String nome;
    private final int idade;

    public String getNome() {
      return this.nome;
    };

    public int getIdade() {
        return this.idade;
    };

    public AlunoClass(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
