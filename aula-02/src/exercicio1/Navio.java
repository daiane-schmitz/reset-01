package exercicio1;

public class Navio extends Aquatico {

    public Navio(String nome, double velocidadeMaxima, int lotacaoMaxima) {
        super(nome, velocidadeMaxima, lotacaoMaxima);
    }

    @Override
    public String toString() {
        return "Navio{" +
                "nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
