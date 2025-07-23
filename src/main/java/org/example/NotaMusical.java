public class NotaMusical {
    private Altura altura;
    private Duracao duracao;

    public NotaMusical(Altura altura, Duracao duracao) {
        this.altura = altura;
        this.duracao = duracao;
    }

    public Altura getAltura() {
        return altura;
    }

    public Duracao getDuracal() {
        return duracao;
    }

     @Override
    public String toString() {
        return altura + " - " + duracao;
    }

}