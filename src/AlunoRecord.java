public record AlunoRecord(String nome, int idade) {
    public AlunoRecord(String nome) {
      this(nome, 18);
    };

    @Override()
    public String toString() {
      return String.format(
              "O aluno se chama %s e tem %d anos.",
              this.nome,
              this.idade
      );
    };
};
