package TemaDeCasa2;

public class PersonagemArcano extends Personagem{

    int mana;

    public PersonagemArcano(String nome, double vida, double ataque, double defesa, int mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " - Vida: " + this.vida + " - Mana: " + this.mana);
    }

    void atacar(Personagem alvo, Magia magia) {
        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano);
    }
}
