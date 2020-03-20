package TemaDeCasa2;


public abstract class PersonagemArmado extends Personagem {

    Arma arma;

    public PersonagemArmado(Classe classe, String nome, double ataque, double defesa, double vida, Arma arma) {
        super(classe, nome, ataque, defesa, vida);
        this.arma = arma;
    }

    void atacar(Personagem alvo, Arma arma) {
        double dano = calcularDano(alvo.getDefesa(), arma.getPoderAtaque());
        alvo.setVida(dano);
    }

}


