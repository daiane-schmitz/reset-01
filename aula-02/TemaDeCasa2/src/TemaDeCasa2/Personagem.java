package TemaDeCasa2;

public abstract class Personagem {

    Classe classe;
    final String nome;
    final double ataque;
    final double defesa;
    double vida;
    Habilidade habilidade;

    public Personagem(Classe classe, String nome, double ataque, double defesa, double vida) {
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

    public void setVida(double vida) {
        this.vida = vida;
    }

    public Habilidade getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Habilidade habilidade) {
        this.habilidade = habilidade;
    }
}
