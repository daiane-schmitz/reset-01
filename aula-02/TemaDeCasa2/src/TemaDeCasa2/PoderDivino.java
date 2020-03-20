package TemaDeCasa2;

public class PoderDivino extends Habilidade{

    double custoFe;

    public PoderDivino(String nome, double poderAtaque, double custoFe) {
        super(nome, poderAtaque);
        this.custoFe = custoFe;
    }

    public double getCustoFe() {
        return custoFe;
    }

    public void setCustoFe(double custoFe) {
        this.custoFe = custoFe;
    }


}
