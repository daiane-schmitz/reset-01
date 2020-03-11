package TemaDeCasa1.ClassesPersonagens;

import TemaDeCasa1.TiposAtaque.Armas;

public class Guerreiros {

    String nomeGuerreiro;
    int vidaGuerreiro;
    int ataqueGuerreiro;
    int defesaGuerreiro;
    Armas armas;

    public Guerreiros(String nomeGuerreiro, int vidaGuerreiro, int ataqueGuerreiro, int defesaGuerreiro, Armas armas) {
        this.nomeGuerreiro = nomeGuerreiro;
        this.vidaGuerreiro = vidaGuerreiro;
        this.ataqueGuerreiro = ataqueGuerreiro;
        this.defesaGuerreiro = defesaGuerreiro;
        this.armas = armas;
    }

    public String getNomeGuerreiro() {
        return nomeGuerreiro;
    }

    public void setNomeGuerreiro(String nomeGuerreiro) {
        this.nomeGuerreiro = nomeGuerreiro;
    }

    public int getVidaGuerreiro() {
        return vidaGuerreiro;
    }

    public void setVidaGuerreiro(int vidaGuerreiro) {
        this.vidaGuerreiro = vidaGuerreiro;
    }

    public int getAtaqueGuerreiro() {
        return ataqueGuerreiro;
    }

    public void setAtaqueGuerreiro(int ataqueGuerreiro) {
        this.ataqueGuerreiro = ataqueGuerreiro;
    }

    public int getDefesaGuerreiro() {
        return defesaGuerreiro;
    }

    public void setDefesaGuerreiro(int defesaGuerreiro) {
        this.defesaGuerreiro = defesaGuerreiro;
    }

    public Armas getArmas() {
        return armas;
    }

    public void setArmas(Armas armas) {
        this.armas = armas;
    }

    Armas espada = new Armas("espada heróica", 15);






    @Override
    public String toString() {
        return "Guerreiros{" +
                "nomeGuerreiro='" + nomeGuerreiro + '\'' +
                ", vidaGuerreiro=" + vidaGuerreiro +
                ", ataqueGuerreiro=" + ataqueGuerreiro +
                ", defesaGuerreiro=" + defesaGuerreiro +
                ", armas=" + armas +
                '}';
    }
}
