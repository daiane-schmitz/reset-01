package exercicio1;

public class Caminhao extends Terrestre {

    int numeroRodas;

    public Caminhao(String nome, double velocidadeMaxima, int lotacaoMaxima, String combustivel, int numeroRodas) {
        super(nome, velocidadeMaxima, lotacaoMaxima, combustivel);
        this.numeroRodas = numeroRodas;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "numeroRodas=" + numeroRodas +
                ", combustivel='" + combustivel + '\'' +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
