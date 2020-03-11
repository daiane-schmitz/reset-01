package TemaDeCasa1.TiposAtaque;

public class Armas {

    String nomeArma;
    int poderAtaqueArma;

    public Armas() {
    }

    public Armas(String nomeArma, int poderAtaqueArma) {
        this.nomeArma = nomeArma;
        this.poderAtaqueArma = poderAtaqueArma;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public int getPoderAtaqueArma() {
        return poderAtaqueArma;
    }

    public void setPoderAtaqueArma(int poderAtaqueArma) {
        this.poderAtaqueArma = poderAtaqueArma;
    }


    @Override
    public String toString() {
        return "Armas{" +
                "nomeArma='" + nomeArma + '\'' +
                ", poderAtaqueArma=" + poderAtaqueArma +
                '}';
    }
}