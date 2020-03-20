package TemaDeCasa2;

public class Magia extends Habilidade{

    double custoMana;

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


}
