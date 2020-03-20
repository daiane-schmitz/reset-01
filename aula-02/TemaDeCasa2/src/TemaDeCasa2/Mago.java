package TemaDeCasa2;

public class Mago extends PersonagemArcano {

    public Mago(Classe classe, String nome, double ataque, double defesa, double vida, int mana) {
        super(classe, nome, ataque, defesa, vida, mana);
    }

    void imprimirEstado() {
        System.out.println(classe.getDescricao() + " - Nome: " + this.nome + " - Vida: " + this.vida + " - Mana: " + this.mana);
    }


    }

