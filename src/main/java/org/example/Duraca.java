public class Duracao {
    private String tipo;
    private double tempoEmBatidas;

    public Duracao(String tipo, double tempoEmBatidas) {
        this.tpo = tipo;
        this.tempoEmBatidas = tempoEmBatidas;
    }

    public String getTipo() {
        return tipo;
    }

    public double getTempoEmBatidas() {
        return tempoEmBatidas;
    }

    @Override
    public String toString() {
        return tipo + " (" + tempoEmBatidas + " batida[s])";
    }
}