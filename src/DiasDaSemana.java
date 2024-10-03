public enum DiasDaSemana {
    SEGUNDA(false),
    TERCA(false),
    QUARTA(false),
    QUINTA(false),
    SEXTA(false),
    SABADO(true),
    DOMINGO(true);

    public final boolean ehFimDeSemana;

    private DiasDaSemana(boolean ehFimDeSemana) {
        this.ehFimDeSemana = ehFimDeSemana;
    }
}
