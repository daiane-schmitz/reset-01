package exercicio1;

public class Terrestre extends Veiculo {

    String combustivel;

    public Terrestre(String nome, double velocidadeMaxima, int lotacaoMaxima, String combustivel) {
        super(nome, velocidadeMaxima, lotacaoMaxima);
        this.combustivel = combustivel;
    }
}
