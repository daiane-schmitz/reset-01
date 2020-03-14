package exercicio1;

public class Submarino extends Veiculo {

    double profundidadeMaxima;

    public Submarino(String nome, double velocidadeMaxima, int lotacaoMaxima, double profundidadeMaxima) {
        super(nome, velocidadeMaxima, lotacaoMaxima);
        this.profundidadeMaxima = profundidadeMaxima;
    }

    @Override
    public String toString() {
        return "Submarino{" +
                "profundidadeMaxima=" + profundidadeMaxima +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
