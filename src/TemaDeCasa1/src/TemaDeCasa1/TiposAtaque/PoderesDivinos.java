package TemaDeCasa1.TiposAtaque;

public class PoderesDivinos {

    String nomePoderDivino;
    int intensidadePoderDivino;
    int custoDeFe;

    public PoderesDivinos(String nomePoderDivino, int intensidadePoderDivino, int custoDeFe) {
        this.nomePoderDivino = nomePoderDivino;
        this.intensidadePoderDivino = intensidadePoderDivino;
        this.custoDeFe = custoDeFe;
    }

    public String getNomePoderDivino() {
        return nomePoderDivino;
    }

    public void setNomePoderDivino(String nomePoderDivino) {
        this.nomePoderDivino = nomePoderDivino;
    }

    public int getIntensidadePoderDivino() {
        return intensidadePoderDivino;
    }

    public void setIntensidadePoderDivino(int intensidadePoderDivino) {
        this.intensidadePoderDivino = intensidadePoderDivino;
    }

    public int getCustoDeFe() {
        return custoDeFe;
    }

    public void setCustoDeFe(int custoDeFe) {
        this.custoDeFe = custoDeFe;
    }

    @Override
    public String toString() {
        return "Poder Divino {" +
                "nome = '" + nomePoderDivino + '\'' +
                ", intensidade = " + intensidadePoderDivino +
                ", custo de fé = " + custoDeFe +
                '}';
    }
}
