package exercicio1;

public class Terrestre extends Veiculo {

    String combustivel;

    public Terrestre(String nome, double velocidadeMaxima, int lotacaoMaxima, String terreno, String combustivel) {
        super(nome, velocidadeMaxima, lotacaoMaxima, terreno);
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Terrestre{" +
                "combustivel='" + combustivel + '\'' +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", terreno='" + terreno + '\'' +
                '}';
    }
}
