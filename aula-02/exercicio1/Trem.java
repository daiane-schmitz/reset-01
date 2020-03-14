package exercicio1;

public class Trem extends Terrestre {

    public Trem(String nome, double velocidadeMaxima, int lotacaoMaxima, String terreno, String combustivel) {
        super(nome, velocidadeMaxima, lotacaoMaxima, terreno, combustivel);
    }

    @Override
    public String toString() {
        return "Trem{" +
                "combustivel='" + combustivel + '\'' +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", terreno='" + terreno + '\'' +
                '}';
    }

}
