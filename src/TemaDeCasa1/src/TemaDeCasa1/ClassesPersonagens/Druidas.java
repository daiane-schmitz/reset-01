package TemaDeCasa1.ClassesPersonagens;

import TemaDeCasa1.TiposAtaque.PoderesDivinos;

public class Druidas {

    String nomeDruida;
    int vidaDruida;
    int ataqueDruida;
    int defesaDruida;
    int feDruida;
    PoderesDivinos poderesDivinos;

    public Druidas(String nomeDruida, int vidaDruida, int ataqueDruida, int defesaDruida, int feDruida, PoderesDivinos poderesDivinos) {
        this.nomeDruida = nomeDruida;
        this.vidaDruida = vidaDruida;
        this.ataqueDruida = ataqueDruida;
        this.defesaDruida = defesaDruida;
        this.feDruida = feDruida;
        this.poderesDivinos = poderesDivinos;
    }

    public String getNomeDruida() {
        return nomeDruida;
    }

    public void setNomeDruida(String nomeDruida) {
        this.nomeDruida = nomeDruida;
    }

    public int getVidaDruida() {
        return vidaDruida;
    }

    public void setVidaDruida(int vidaDruida) {
        this.vidaDruida = vidaDruida;
    }

    public int getAtaqueDruida() {
        return ataqueDruida;
    }

    public void setAtaqueDruida(int ataqueDruida) {
        this.ataqueDruida = ataqueDruida;
    }

    public int getDefesaDruida() {
        return defesaDruida;
    }

    public void setDefesaDruida(int defesaDruida) {
        this.defesaDruida = defesaDruida;
    }

    public int getFeDruida() {
        return feDruida;
    }

    public void setFeDruida(int feDruida) {
        this.feDruida = feDruida;
    }

    public PoderesDivinos getPoderesDivinos() {
        return poderesDivinos;
    }

    public void setPoderesDivinos(PoderesDivinos poderesDivinos) {
        this.poderesDivinos = poderesDivinos;
    }

    @Override
    public String toString() {
        return "Druidas{" +
                "nomeDruida='" + nomeDruida + '\'' +
                ", vidaDruida=" + vidaDruida +
                ", ataqueDruida=" + ataqueDruida +
                ", defesaDruida=" + defesaDruida +
                ", feDruida=" + feDruida +
                ", poderesDivinos=" + poderesDivinos +
                '}';
    }
}
