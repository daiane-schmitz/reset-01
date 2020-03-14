package exercicio1;

public class Aquatico extends Veiculo {

    public Aquatico(String nome, double velocidadeMaxima, int lotacaoMaxima) {
        super(nome, velocidadeMaxima, lotacaoMaxima);
    }

    @Override
    public String toString() {
        return "Aquatico{" +
                "nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
