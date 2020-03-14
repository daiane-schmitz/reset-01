package exercicio1;

public class Trem extends Terrestre {

    public Trem(String nome, double velocidadeMaxima, int lotacaoMaxima, String combustivel) {
        super(nome, velocidadeMaxima, lotacaoMaxima, combustivel);
    }

    @Override
    public String toString() {
        return "Trem{" +
                "combustivel='" + combustivel + '\'' +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }
}
