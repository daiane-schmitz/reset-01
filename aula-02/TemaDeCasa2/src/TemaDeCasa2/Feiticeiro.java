package TemaDeCasa2;

public class Feiticeiro extends PersonagemArcano {

    public Feiticeiro(final Classe classe, final String nome, final double vida, final double ataque, final double defesa, final int mana) {
        super(classe, nome, vida, ataque, defesa, mana);
    }

    void imprimirEstado() {
        System.out.println(classe.getDescricao() + " - Nome: " + this.nome + " - Vida: " + this.vida + " - Mana: " + this.mana);
    }
}
