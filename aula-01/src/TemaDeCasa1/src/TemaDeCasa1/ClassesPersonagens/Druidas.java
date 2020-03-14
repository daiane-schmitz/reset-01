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

    PoderesDivinos terra = new PoderesDivinos("cajado de terra", 60, 30);

    //Druida ataca Barbaro
    public String atacarBarbaro(String nomeBarbaro, int defesaBarbaro, int vidaBarbaro, int feDruida) {
        int danoDruidaBarbaro = 0;
        if (this.vidaDruida > 0) {
            int poderFinalAtaqueMachado = (getAtaqueDruida() * terra.getIntensidadePoderDivino());
            danoDruidaBarbaro = (poderFinalAtaqueMachado - defesaBarbaro);
            System.out.println(getNomeDruida() + " atacou " + nomeBarbaro + " com " + terra.getNomePoderDivino() + " causando " + danoDruidaBarbaro + " de dano.");
        } else if (vidaBarbaro <= 0) {
            System.out.println(getNomeDruida() + " atacou " + nomeBarbaro + " com " + terra.getNomePoderDivino() + " causando " + danoDruidaBarbaro + " de dano e " + nomeBarbaro + "morreu!");
        } else if (feDruida < terra.getCustoDeFe()) {
            System.out.println("Ataque ignorado, personagem " + nomeDruida + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeDruida + " está morto.");
        }
        return " - - - - - - ";
    }

    //Druida ataca Clerigo
    public String atacarClerigo(String nomeClerigo, int defesaClerigo, int vidaClerigo, int feDruida) {
        int danoDruidaClerigo = 0;
        if (this.vidaDruida > 0) {
            int poderFinalAtaqueMachado = (getAtaqueDruida() * terra.getIntensidadePoderDivino());
            danoDruidaClerigo = (poderFinalAtaqueMachado - defesaClerigo);
            System.out.println(getNomeDruida() + " atacou " + nomeClerigo + " com " + terra.getNomePoderDivino() + " causando " + danoDruidaClerigo + " de dano.");
        } else if (vidaClerigo <= 0) {
            System.out.println(getNomeDruida() + " atacou " + nomeClerigo + " com " + terra.getNomePoderDivino() + " causando " + danoDruidaClerigo + " de dano e " + nomeClerigo + "morreu!");
        } else if (feDruida < terra.getCustoDeFe()) {
            System.out.println("Ataque ignorado, personagem " + nomeDruida + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeDruida + " está morto.");
        }
        return " - - - - - - ";
    }

    //Druida ataca Feiticeiro
    public String atacarFeiticeiro(String nomeFeiticeiro, int defesaFeiticeiro, int vidaFeiticeiro, int feDruida) {
        int danoDruidaFeiticeiro = 0;
        if (this.vidaDruida > 0) {
            int poderFinalAtaqueMachado = (getAtaqueDruida() * terra.getIntensidadePoderDivino());
            danoDruidaFeiticeiro = (poderFinalAtaqueMachado - defesaFeiticeiro);
            System.out.println(getNomeDruida() + " atacou " + nomeFeiticeiro + " com " + terra.getNomePoderDivino() + " causando " + danoDruidaFeiticeiro + " de dano.");
        } else if (vidaFeiticeiro <= 0) {
            System.out.println(getNomeDruida() + " atacou " + nomeFeiticeiro + " com " + terra.getNomePoderDivino() + " causando " + danoDruidaFeiticeiro + " de dano e " + nomeFeiticeiro + "morreu!");
        } else if (feDruida < terra.getCustoDeFe()) {
            System.out.println("Ataque ignorado, personagem " + nomeDruida + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeDruida + " está morto.");
        }
        return " - - - - - - ";
    }

    //Druida ataca Guerreiro
    public String atacarGuerreiro(String nomeGuerreiro, int defesaGuerreiro, int vidaGuerreiro, int feDruida) {
        int danoDruidaGuerreiro = 0;
        if (this.vidaDruida > 0) {
            int poderFinalAtaqueMachado = (getAtaqueDruida() * terra.getIntensidadePoderDivino());
            danoDruidaGuerreiro = (poderFinalAtaqueMachado - defesaGuerreiro);
            System.out.println(getNomeDruida() + " atacou " + nomeGuerreiro + " com " + terra.getNomePoderDivino() + " causando " + danoDruidaGuerreiro + " de dano.");
        } else if (vidaGuerreiro <= 0) {
            System.out.println(getNomeDruida() + " atacou " + nomeGuerreiro + " com " + terra.getNomePoderDivino() + " causando " + danoDruidaGuerreiro + " de dano e " + nomeGuerreiro + "morreu!");
        } else if (feDruida < terra.getCustoDeFe()) {
            System.out.println("Ataque ignorado, personagem " + nomeDruida + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeDruida + " está morto.");
        }
        return " - - - - - - ";
    }

    //Druida ataca Mago
    public String atacarMago(String nomeMago, int defesaMago, int vidaMago, int feDruida) {
        int danoDruidaMago = 0;
        if (this.vidaDruida > 0) {
            int poderFinalAtaqueMachado = (getAtaqueDruida() * terra.getIntensidadePoderDivino());
            danoDruidaMago = (poderFinalAtaqueMachado - defesaMago);
            System.out.println(getNomeDruida() + " atacou " + nomeMago + " com " + terra.getNomePoderDivino() + " causando " + danoDruidaMago + " de dano.");
        } else if (vidaMago <= 0) {
            System.out.println(getNomeDruida() + " atacou " + nomeMago + " com " + terra.getNomePoderDivino() + " causando " + danoDruidaMago + " de dano e " + nomeMago + "morreu!");
        } else if (feDruida < terra.getCustoDeFe()) {
            System.out.println("Ataque ignorado, personagem " + nomeDruida + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeDruida + " está morto.");
        }
        return " - - - - - - ";
    }

        @Override
    public String toString() {
        return "Druidas {" +
                " nome = ' " + nomeDruida + '\'' +
                ", vida = " + vidaDruida +
                ", ataque = " + ataqueDruida +
                ", defesa = " + defesaDruida +
                ", fé = " + feDruida +
                ", = " + poderesDivinos +
                '}';
    }
}
