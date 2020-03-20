package TemaDeCasa2;

public class Habilidade {

    String nome;
    double poderAtaque;

    public Habilidade(String nome, double poderAtaque) {
        this.nome = nome;
        this.poderAtaque = poderAtaque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }
}
