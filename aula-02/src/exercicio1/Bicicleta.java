package exercicio1;

public class Bicicleta extends Terrestre {

    int numeroRodas;

    public Bicicleta(String nome, double velocidadeMaxima, int lotacaoMaxima, String combustivel, int numeroRodas) {
        super(nome, velocidadeMaxima, lotacaoMaxima, combustivel);
        this.numeroRodas = numeroRodas;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "numeroRodas=" + numeroRodas +
                ", combustivel='" + combustivel + '\'' +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
