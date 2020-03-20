package TemaDeCasa2;

public abstract class PersonagemSacerdote extends Personagem{

    int fe;

    public PersonagemSacerdote(Classe classe, String nome, double vida, double ataque, double defesa, int fe, PoderDivino poderDivino) {
        super(classe, nome, vida, ataque, defesa);
        this.fe = fe;
    }

    void atacar(Personagem alvo, Magia magia) {
        double dano = calcularDano(alvo.getDefesa(), magia.getPoderAtaque());
        alvo.setVida(dano);
    }


}
