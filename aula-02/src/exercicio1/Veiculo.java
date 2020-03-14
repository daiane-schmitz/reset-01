package exercicio1;

public class Veiculo {

    String nome;
    double velocidadeMaxima;
    int lotacaoMaxima;
    String terreno;

    public Veiculo(String nome, double velocidadeMaxima, int lotacaoMaxima, String terreno) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.lotacaoMaxima = lotacaoMaxima;
        this.terreno = terreno;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", terreno='" + terreno + '\'' +
                '}';
    }
}
