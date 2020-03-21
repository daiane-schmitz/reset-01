package TemaDeCasa2;

public abstract class PersonagemSacerdote extends Personagem{

    int fe;

    public PersonagemSacerdote(Classe classe, String nome, double vida, double ataque, double defesa, int fe) {
        super(classe, nome, vida, ataque, defesa);
        this.fe = fe;
    }

    public int getFe() {
        return fe;
    }

    void atacar(Personagem alvo, PoderDivino poderDivino){
        double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
        alvo.vida -= dano;
    }

    void imprimirEstado() {
        System.out.println(classe.getDescricao() + " - Nome: " + this.getNome() + " - Vida: " + this.getVida() + " - Fé: " + this.getFe());
    }



}
