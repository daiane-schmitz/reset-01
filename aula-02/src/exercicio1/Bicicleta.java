package exercicio1;

public class Bicicleta extends Terrestre {

    int numeroRodas;

    public Bicicleta(String nome, double velocidadeMaxima, int lotacaoMaxima, String combustivel, int numeroRodas) {
        super(nome, velocidadeMaxima, lotacaoMaxima, combustivel);
        this.numeroRodas = numeroRodas;
    }
}
