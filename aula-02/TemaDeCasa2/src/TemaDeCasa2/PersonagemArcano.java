package TemaDeCasa2;

public abstract class PersonagemArcano extends Personagem{

    int mana;

    public PersonagemArcano(Classe classe, String nome, double ataque, double defesa, double vida, int mana) {
        super(classe, nome, ataque, defesa, vida);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int custoMana) {
        this.mana -= mana;
    }

    void atacar(Personagem alvo, Magia magia) {
        double dano = calcularDano(alvo.getDefesa(), magia.getPoderAtaque());
        alvo.setVida(dano);
    }

    void imprimirEstado() {
        System.out.println(classe.getDescricao() + " - Nome: " + this.getNome() + " - Vida: " + this.getVida() + " - Mana: " + this.getMana());
    }
}
