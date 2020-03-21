package TemaDeCasa2;

public class Magia extends Habilidade{

    double custoMana;
    TiposMagiaPoder tiposMagia;

    public Magia(String nome, double poderAtaque, double custoMana) {
        super(nome, poderAtaque);
        this.custoMana = custoMana;
    }

    public double getCustoMana() {
        return custoMana;
    }

    public void setCustoMana(double custoMana) {
        this.custoMana = custoMana;
    }

    public TiposMagiaPoder getTiposMagia() {
        return tiposMagia;
    }

    public void setTiposMagia(TiposMagiaPoder tiposMagia) {
        this.tiposMagia = tiposMagia;
    }
}
