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


   private double calcularDano(double defesa, double poder) {
        return ((this.ataque * poder) - defesa);
    }

    void atacar(Personagem alvo) {
        System.out.println("atacou " + alvo + " com " + habilidade.getNome());
        alvo.vida -= calcularDano(alvo.defesa, habilidade.poderAtaque);
        System.out.println("A vida do alvo após o ataque é: " + alvo.vida);
    }


}
