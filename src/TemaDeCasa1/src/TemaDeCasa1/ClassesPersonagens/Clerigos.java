package TemaDeCasa1.ClassesPersonagens;

import TemaDeCasa1.TiposAtaque.PoderesDivinos;

public class Clerigos {

    String nomeClerigo;
    int vidaClerigo;
    int ataqueClerigo;
    int defesaClerigo;
    int feClerigo;
    PoderesDivinos poderesDivinos;

    public Clerigos(String nomeClerigo, int vidaClerigo, int ataqueClerigo, int defesaClerigo, int feClerigo, PoderesDivinos poderesDivinos) {
        this.nomeClerigo = nomeClerigo;
        this.vidaClerigo = vidaClerigo;
        this.ataqueClerigo = ataqueClerigo;
        this.defesaClerigo = defesaClerigo;
        this.feClerigo = feClerigo;
        this.poderesDivinos = poderesDivinos;
    }

    public String getNomeClerigo() {
        return nomeClerigo;
    }

    public void setNomeClerigo(String nomeClerigo) {
        this.nomeClerigo = nomeClerigo;
    }

    public int getVidaClerigo() {
        return vidaClerigo;
    }

    public void setVidaClerigo(int vidaClerigo) {
        this.vidaClerigo = vidaClerigo;
    }

    public int getAtaqueClerigo() {
        return ataqueClerigo;
    }

    public void setAtaqueClerigo(int ataqueClerigo) {
        this.ataqueClerigo = ataqueClerigo;
    }

    public int getDefesaClerigo() {
        return defesaClerigo;
    }

    public void setDefesaClerigo(int defesaClerigo) {
        this.defesaClerigo = defesaClerigo;
    }

    public int getFeClerigo() {
        return feClerigo;
    }

    public void setFeClerigo(int feClerigo) {
        this.feClerigo = feClerigo;
    }

    public PoderesDivinos getPoderesDivinos() {
        return poderesDivinos;
    }

    public void setPoderesDivinos(PoderesDivinos poderesDivinos) {
        this.poderesDivinos = poderesDivinos;
    }

    @Override
    public String toString() {
        return "Clerigos{" +
                "nomeClerigo='" + nomeClerigo + '\'' +
                ", vidaClerigo=" + vidaClerigo +
                ", ataqueClerigo=" + ataqueClerigo +
                ", defesaClerigo=" + defesaClerigo +
                ", feClerigo=" + feClerigo +
                ", poderesDivinos=" + poderesDivinos +
                '}';
    }
}