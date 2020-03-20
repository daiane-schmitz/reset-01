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

    public void setFe(int custoFe) {
        this.fe -= fe;
    }

    void atacar(Personagem alvo, PoderDivino poderDivino) {
        double dano = calcularDano(alvo.getDefesa(), poderDivino.getPoderAtaque());
        alvo.setVida(dano);
    }

    void imprimirEstado() {
        System.out.println(classe.getDescricao() + " - Nome: " + this.getNome() + " - Vida: " + this.getVida() + " - Fé: " + this.getFe());
    }
}
