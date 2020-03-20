package TemaDeCasa2;

public class Clerigo extends PersonagemSacerdote{

    private int fe;

    public Clerigo(final Classe classe, final String nome, final double vida, final double ataque, final double defesa, final int fe, PoderDivino poderDivino) {
        super(classe, nome, vida, ataque, defesa, fe, poderDivino);
    }

    void imprimirEstado() {
        System.out.println(classe.getDescricao() + " - Nome: " + this.nome + " - Vida: " + this.vida + " - Fé: " + this.fe);
    }

    PoderDivino luz = new PoderDivino("luz divina", 100, 40);
}
