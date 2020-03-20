package TemaDeCasa2;

public abstract class PersonagemArcano extends Personagem{

    int mana;

    public PersonagemArcano(Classe classe, String nome, double ataque, double defesa, double vida, int mana) {
        super(classe, nome, ataque, defesa, vida);
        this.mana = mana;
    }

    void atacar(Personagem alvo, PoderDivino poderDivino) {
        double dano = calcularDano(alvo.getDefesa(), poderDivino.getPoderAtaque());
        alvo.setVida(dano);
    }


}
