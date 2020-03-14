package TemaDeCasa1.TiposAtaque;

public class Magias {

    String nomeMagia;
    int poderMagia;
    int custoDeMana;

    public Magias(String nomeMagia, int poderMagia, int custoDeMana) {
        this.nomeMagia = nomeMagia;
        this.poderMagia = poderMagia;
        this.custoDeMana = custoDeMana;
    }

    public String getNomeMagia() {
        return nomeMagia;
    }

    public void setNomeMagia(String nomeMagia) {
        this.nomeMagia = nomeMagia;
    }

    public int getPoderMagia() {
        return poderMagia;
    }

    public void setPoderMagia(int poderMagia) {
        this.poderMagia = poderMagia;
    }

    public int getCustoDeMana() {
        return custoDeMana;
    }

    public void setCustoDeMana(int custoDeMana) {
        this.custoDeMana = custoDeMana;
    }

    @Override
    public String toString() {
        return "Magias {" +
                "nome da magia = '" + nomeMagia + '\'' +
                ", poder da magia = " + poderMagia +
                ", custo De mana = " + custoDeMana +
                '}';
    }
}

