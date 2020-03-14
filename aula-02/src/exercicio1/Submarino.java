package exercicio1;

public class Submarino extends Aquatico {

    double profundidadeMaxima;
    double alturaMaxima;

    @Override
    public String toString() {
        return "Submarino{" +
                "profundidadeMaxima=" + profundidadeMaxima +
                ", alturaMaxima=" + alturaMaxima +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", terreno='" + terreno + '\'' +
                '}';
    }

    public Submarino(String nome, double velocidadeMaxima, int lotacaoMaxima, String terreno, double profundidadeMaxima, double alturaMaxima) {
        super(nome, velocidadeMaxima, lotacaoMaxima, terreno);
        this.profundidadeMaxima = profundidadeMaxima;
        this.alturaMaxima = alturaMaxima;


    }
}

