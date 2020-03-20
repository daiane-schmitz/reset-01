package TemaDeCasa2;

public abstract class Personagem {

    Classe classe;
    final String nome;
    double vida;
    final double ataque;
    final double defesa;

    public Personagem(Classe classe, final String nome, final double ataque, final double defesa, double vida) {
        this.classe = classe;
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vida = vida;
    }


    double calcularDano(double defesa, double poder) {
        return ((this.ataque * poder) - defesa);
    }


    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double dano) {
        this.vida -= dano;
        if (this.vida <= 0) {
            System.out.println("O personagem morreu.");
        }
    }


}
