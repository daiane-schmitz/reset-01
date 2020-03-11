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

    PoderesDivinos luz = new PoderesDivinos("luz divina", 50, 30);

    //Clerigo ataca Druida
    public int atacarDruida(String nomeDruida, int defesaDruida, int vidaDruida) {
        int danoClerigoDruida = 0;
        if (this.vidaClerigo > 0) {
            int poderFinalAtaqueMachado = (getAtaqueClerigo() * luz.getIntensidadePoderDivino());
            danoClerigoDruida = (poderFinalAtaqueMachado - defesaDruida);
            System.out.println(getNomeClerigo() + " atacou " + nomeDruida + " com " + luz.getNomePoderDivino() + " causando " + danoClerigoDruida + " de dano.");
        } else if (vidaDruida <= 0) {
            System.out.println(getNomeClerigo() + " atacou " + nomeDruida + " com " + luz.getNomePoderDivino() + " causando " + danoClerigoDruida + " de dano e " + nomeDruida + "morreu!");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeClerigo + " está morto.");
        }
        return 0;
    }

    //Clerigo ataca Barbaro
    public int atacarBarbaro(String nomeBarbaro, int defesaBarbaro, int vidaBarbaro, int feClerigo) {
        int danoClerigoBarbaro = 0;
        if (this.vidaClerigo > 0) {
            int poderFinalAtaqueMachado = (getAtaqueClerigo() * luz.getIntensidadePoderDivino());
            danoClerigoBarbaro = (poderFinalAtaqueMachado - defesaBarbaro);
            System.out.println(getNomeClerigo() + " atacou " + nomeBarbaro + " com " + luz.getNomePoderDivino() + " causando " + danoClerigoBarbaro + " de dano.");
        } else if (vidaBarbaro <= 0) {
            System.out.println(getNomeClerigo() + " atacou " + nomeBarbaro + " com " + luz.getNomePoderDivino() + " causando " + danoClerigoBarbaro + " de dano e " + nomeBarbaro + "morreu!");
        } else if (feClerigo < luz.getCustoDeFe()) {
            System.out.println("Ataque ignorado, personagem " + nomeClerigo + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeClerigo + " está morto.");
        }
        return 0;
    }

    //Clerigo ataca Feiticeiro
    public int atacarFeiticeiro(String nomeFeiticeiro, int defesaFeiticeiro, int vidaFeiticeiro, int feClerigo) {
        int danoClerigoFeiticeiro = 0;
        if (this.vidaClerigo > 0) {
            int poderFinalAtaqueMachado = (getAtaqueClerigo() * luz.getIntensidadePoderDivino());
            danoClerigoFeiticeiro = (poderFinalAtaqueMachado - defesaFeiticeiro);
            System.out.println(getNomeClerigo() + " atacou " + nomeFeiticeiro + " com " + luz.getNomePoderDivino() + " causando " + danoClerigoFeiticeiro + " de dano.");
        } else if (vidaFeiticeiro <= 0) {
            System.out.println(getNomeClerigo() + " atacou " + nomeFeiticeiro + " com " + luz.getNomePoderDivino() + " causando " + danoClerigoFeiticeiro + " de dano e " + nomeFeiticeiro + "morreu!");
        } else if (feClerigo < luz.getCustoDeFe()) {
            System.out.println("Ataque ignorado, personagem " + nomeClerigo + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeClerigo + " está morto.");
        }
        return 0;
    }

    //Clerigo ataca Guerreiro
    public int atacarGuerreiro(String nomeGuerreiro, int defesaGuerreiro, int vidaGuerreiro, int feClerigo) {
        int danoClerigoGuerreiro = 0;
        if (this.vidaClerigo > 0) {
            int poderFinalAtaqueMachado = (getAtaqueClerigo() * luz.getIntensidadePoderDivino());
            danoClerigoGuerreiro = (poderFinalAtaqueMachado - defesaGuerreiro);
            System.out.println(getNomeClerigo() + " atacou " + nomeGuerreiro + " com " + luz.getNomePoderDivino() + " causando " + danoClerigoGuerreiro + " de dano.");
        } else if (vidaGuerreiro <= 0) {
            System.out.println(getNomeClerigo() + " atacou " + nomeGuerreiro + " com " + luz.getNomePoderDivino() + " causando " + danoClerigoGuerreiro + " de dano e " + nomeGuerreiro + "morreu!");
        } else if (feClerigo < luz.getCustoDeFe()) {
            System.out.println("Ataque ignorado, personagem " + nomeClerigo + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeClerigo + " está morto.");
        }
        return 0;
    }

    //Clerigo ataca Mago
    public int atacarMago(String nomeMago, int defesaMago, int vidaMago, int feClerigo) {
        int danoClerigoMago = 0;
        if (this.vidaClerigo > 0) {
            int poderFinalAtaqueMachado = (getAtaqueClerigo() * luz.getIntensidadePoderDivino());
            danoClerigoMago = (poderFinalAtaqueMachado - defesaMago);
            System.out.println(getNomeClerigo() + " atacou " + nomeMago + " com " + luz.getNomePoderDivino() + " causando " + danoClerigoMago + " de dano.");
        } else if (vidaMago <= 0) {
            System.out.println(getNomeClerigo() + " atacou " + nomeMago + " com " + luz.getNomePoderDivino() + " causando " + danoClerigoMago + " de dano e " + nomeMago + "morreu!");
        } else if (feClerigo < luz.getCustoDeFe()) {
            System.out.println("Ataque ignorado, personagem " + nomeClerigo + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeClerigo + " está morto.");
        }
        return 0;
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