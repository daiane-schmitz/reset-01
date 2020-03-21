package TemaDeCasa2;

import java.util.List;

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

    boolean atacarIndividual(Personagem alvo, Magia magia) {
       return super.atacar(alvo, magia);
    }

    boolean atacarArea(List<Personagem> alvos, Magia magia) {
        if (magia.getTiposMagia() == TiposMagiaPoder.DE_AREA)
            for (Personagem alvo : alvos) {
                this.atacarArea(alvos, magia);
            }
        this.mana -= magia.getCustoMana();
        return  true;
    }


    void imprimirEstado() {
        System.out.println(classe.getDescricao() + " - Nome: " + this.getNome() + " - Vida: " + this.getVida() + " - Mana: " + this.getMana());
    }
}
