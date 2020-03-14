package exercicio1;

public class Veiculo {

    String nome;
    double velocidadeMaxima;
    int lotacaoMaxima;

    public Veiculo(String nome, double velocidadeMaxima, int lotacaoMaxima) {
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
