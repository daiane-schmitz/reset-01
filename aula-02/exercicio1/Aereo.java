package exercicio1;

public class Aereo extends Veiculo {

    double altitudeMaxima;

    public Aereo(String nome, double velocidadeMaxima, int lotacaoMaxima, String terreno) {
        super(nome, velocidadeMaxima, lotacaoMaxima, terreno);
    }

    @Override
    public String toString() {
        return "Aereo{" +
                "altitudeMaxima=" + altitudeMaxima +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", terreno='" + terreno + '\'' +
                '}';
    }
}
