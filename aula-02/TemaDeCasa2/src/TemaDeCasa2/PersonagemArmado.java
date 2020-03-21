package TemaDeCasa2;


public abstract class PersonagemArmado extends Personagem {

    Arma arma;

    public PersonagemArmado(Classe classe, String nome, double ataque, double defesa, double vida) {
        super(classe, nome, ataque, defesa, vida);
        this.arma = arma;
    }

    public void equiparArma(Arma arma){
        this.arma = arma;
    }

    boolean atacar(Personagem alvo) {
        return super.atacar(alvo, arma);
    }



}


