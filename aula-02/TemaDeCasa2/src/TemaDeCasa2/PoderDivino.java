package TemaDeCasa2;

public class PoderDivino extends Habilidade{

    double custoFe;
    TiposMagiaPoder tiposPoderDivino;

    public PoderDivino(String nome, double poderAtaque, double custoFe, TiposMagiaPoder tiposPoderDivino) {
        super(nome, poderAtaque);
        this.custoFe = custoFe;
        this.tiposPoderDivino = tiposPoderDivino;
    }

    public double getCustoFe() {
        return custoFe;
    }

    public void setCustoFe(double custoFe) {
        this.custoFe = custoFe;
    }

    public TiposMagiaPoder getTiposPoderDivino() {
        return tiposPoderDivino;
    }

    public void setTiposPoderDivino(TiposMagiaPoder tiposPoderDivino) {
        this.tiposPoderDivino = tiposPoderDivino;
    }
}
