package exercicio1;

public class Navio extends Aquatico {

    public Navio(String nome, double velocidadeMaxima, int lotacaoMaxima, String terreno) {
        super(nome, velocidadeMaxima, lotacaoMaxima, terreno);
    }

    @Override
    public String toString() {
        return "Navio{" +
                "nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", terreno='" + terreno + '\'' +
                '}';
    }
}
