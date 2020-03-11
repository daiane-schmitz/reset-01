package TemaDeCasa1.ClassesPersonagens;

import TemaDeCasa1.TiposAtaque.Magias;

public class Feiticeiros {

    String nomeFeiticeiro;
    int vidaFeiticeiro;
    int ataqueFeiticeiro;
    int defesaFeiticeiro;
    int manaFeiticeiro;
    Magias magias;

    public Feiticeiros(String nomeFeiticeiro, int vidaFeiticeiro, int ataqueFeiticeiro, int defesaFeiticeiro, int manaFeiticeiro, Magias magias) {
        this.nomeFeiticeiro = nomeFeiticeiro;
        this.vidaFeiticeiro = vidaFeiticeiro;
        this.ataqueFeiticeiro = ataqueFeiticeiro;
        this.defesaFeiticeiro = defesaFeiticeiro;
        this.manaFeiticeiro = manaFeiticeiro;
        this.magias = magias;

    }

    public String getNomeFeiticeiro() {
        return nomeFeiticeiro;
    }

    public void setNomeFeiticeiro(String nomeFeiticeiro) {
        this.nomeFeiticeiro = nomeFeiticeiro;
    }

    public int getVidaFeiticeiro() {
        return vidaFeiticeiro;
    }

    public void setVidaFeiticeiro(int vidaFeiticeiro) {
        this.vidaFeiticeiro = vidaFeiticeiro;
    }

    public int getAtaqueFeiticeiro() {
        return ataqueFeiticeiro;
    }

    public void setAtaqueFeiticeiro(int ataqueFeiticeiro) {
        this.ataqueFeiticeiro = ataqueFeiticeiro;
    }

    public int getDefesaFeiticeiro() {
        return defesaFeiticeiro;
    }

    public void setDefesaFeiticeiro(int defesaFeiticeiro) {
        this.defesaFeiticeiro = defesaFeiticeiro;
    }

    public int getManaFeiticeiro() {
        return manaFeiticeiro;
    }

    public void setManaFeiticeiro(int manaFeiticeiro) {
        this.manaFeiticeiro = manaFeiticeiro;
    }

    public Magias getMagias() {
        return magias;
    }

    public void setMagias(Magias magias) {
        this.magias = magias;
    }

    @Override
    public String toString() {
        return "Feiticeiros{" +
                "nomeFeiticeiro='" + nomeFeiticeiro + '\'' +
                ", vidaFeiticeiro=" + vidaFeiticeiro +
                ", ataqueFeiticeiro=" + ataqueFeiticeiro +
                ", defesaFeiticeiro=" + defesaFeiticeiro +
                ", manaFeiticeiro=" + manaFeiticeiro +
                ", magias=" + magias +
                '}';
    }
}
