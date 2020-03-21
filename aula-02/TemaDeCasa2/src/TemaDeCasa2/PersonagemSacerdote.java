package TemaDeCasa2;

import java.util.List;

public abstract class PersonagemSacerdote extends Personagem {

    int fe;

    public PersonagemSacerdote(Classe classe, String nome, double vida, double ataque, double defesa, int fe) {
        super(classe, nome, vida, ataque, defesa);
        this.fe = fe;
    }

    public int getFe() {
        return fe;
    }

    boolean atacarIndividual(Personagem alvo, PoderDivino poderDivino) {
        return super.atacar(alvo, poderDivino);
    }


    boolean atacarArea(List<Personagem> alvos, PoderDivino poderDivino) {
        if (poderDivino.getTiposPoderDivino() == TiposMagiaPoder.DE_AREA)
            for (Personagem alvo : alvos) {
                this.atacarArea(alvos, poderDivino);
            }
        this.fe -= poderDivino.getCustoFe();
    return  true;
    }

    void imprimirEstado() {
        System.out.println(classe.getDescricao() + " - Nome: " + this.getNome() + " - Vida: " + this.getVida() + " - Fé: " + this.getFe());
    }



}
