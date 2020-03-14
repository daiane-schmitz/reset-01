package exercicio1;

public class Carro extends Terrestre {

    int numeroRodas;

    public Carro(String nome, double velocidadeMaxima, int lotacaoMaxima, String terreno, String combustivel, int numeroRodas) {
        super(nome, velocidadeMaxima, lotacaoMaxima, terreno, combustivel);
        this.numeroRodas = numeroRodas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroRodas=" + numeroRodas +
                ", combustivel='" + combustivel + '\'' +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", terreno='" + terreno + '\'' +
                '}';
    }
}


