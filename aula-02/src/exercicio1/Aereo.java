package exercicio1;

public class Aereo extends Veiculo {

    double altitudeMaxima;

    public Aereo(String nome, double velocidadeMaxima, int lotacaoMaxima, double altitudeMaxima) {
        super(nome, velocidadeMaxima, lotacaoMaxima);
        this.altitudeMaxima = altitudeMaxima;
    }

    @Override
    public String toString() {
        return "Aereo{" +
                "altitudeMaxima=" + altitudeMaxima +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
