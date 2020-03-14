package exercicio1;

public class Aquatico extends Veiculo {

    public Aquatico(String nome, double velocidadeMaxima, int lotacaoMaxima, String terreno) {
        super(nome, velocidadeMaxima, lotacaoMaxima, terreno);
    }

    @Override
    public String toString() {
        return "Aquatico{" +
                "nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", terreno='" + terreno + '\'' +
                '}';
    }
}
