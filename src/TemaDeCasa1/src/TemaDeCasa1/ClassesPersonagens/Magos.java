package TemaDeCasa1.ClassesPersonagens;

import TemaDeCasa1.TiposAtaque.Magias;

public class Magos {

    String nomeMago;
    int vidaMago;
    int ataqueMago;
    int defesaMago;
    int manaMago;
    Magias magias;

    public Magos() {
    }

    public Magos(String nomeMago, int vidaMago, int ataqueMago, int defesaMago, int manaMago, Magias magias) {
        super();
        this.nomeMago = nomeMago;
        this.vidaMago = vidaMago;
        this.ataqueMago = ataqueMago;
        this.defesaMago = defesaMago;
        this.manaMago = manaMago;
        this.magias = magias;
    }

    public String getNomeMago() {
        return nomeMago;
    }

    public void setNomeMago(String nomeMago) {
        this.nomeMago = nomeMago;
    }

    public int getVidaMago() {
        return vidaMago;
    }

    public void setVidaMago(int vidaMago) {
        this.vidaMago = vidaMago;
    }

    public int getAtaqueMago() {
        return ataqueMago;
    }

    public void setAtaqueMago(int ataqueMago) {
        this.ataqueMago = ataqueMago;
    }

    public int getDefesaMago() {
        return defesaMago;
    }

    public void setDefesaMago(int defesaMago) {
        this.defesaMago = defesaMago;
    }

    public int getManaMago() {
        return manaMago;
    }

    public void setManaMago(int manaMago) {
        this.manaMago = manaMago;
    }

    public Magias getMagias() {
        return magias;
    }

    public void setMagias(Magias magias) {
        this.magias = magias;
    }

    @Override
    public String toString() {
        return "Magos{" +
                "nomeMago='" + nomeMago + '\'' +
                ", vidaMago=" + vidaMago +
                ", ataqueMago=" + ataqueMago +
                ", defesaMago=" + defesaMago +
                ", manaMago=" + manaMago +
                ", magias=" + magias +
                '}';
    }
}
