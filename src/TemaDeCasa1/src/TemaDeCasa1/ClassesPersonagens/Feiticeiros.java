package TemaDeCasa1.ClassesPersonagens;

import TemaDeCasa1.TiposAtaque.Magias;

public class Feiticeiros {

    String nomeFeiticeiro;
    int vidaFeiticeiro;
    int ataqueFeiticeiro;
    int defesaFeiticeiro;
    int manaFeiticeiro;
    Magias magias;

    public Feiticeiros(String nomeFeiticeiro, int vidaFeiticeiro, int ataqueFeiticeiro, int defesaFeiticeiro, int manaFeiticeiro, Magias magias) {
        this.nomeFeiticeiro = nomeFeiticeiro;
        this.vidaFeiticeiro = vidaFeiticeiro;
        this.ataqueFeiticeiro = ataqueFeiticeiro;
        this.defesaFeiticeiro = defesaFeiticeiro;
        this.manaFeiticeiro = manaFeiticeiro;
        this.magias = magias;

    }

    public String getNomeFeiticeiro() {
        return nomeFeiticeiro;
    }

    public void setNomeFeiticeiro(String nomeFeiticeiro) {
        this.nomeFeiticeiro = nomeFeiticeiro;
    }

    public int getVidaFeiticeiro() {
        return vidaFeiticeiro;
    }

    public void setVidaFeiticeiro(int vidaFeiticeiro) {
        this.vidaFeiticeiro = vidaFeiticeiro;
    }

    public int getAtaqueFeiticeiro() {
        return ataqueFeiticeiro;
    }

    public void setAtaqueFeiticeiro(int ataqueFeiticeiro) {
        this.ataqueFeiticeiro = ataqueFeiticeiro;
    }

    public int getDefesaFeiticeiro() {
        return defesaFeiticeiro;
    }

    public void setDefesaFeiticeiro(int defesaFeiticeiro) {
        this.defesaFeiticeiro = defesaFeiticeiro;
    }

    public int getManaFeiticeiro() {
        return manaFeiticeiro;
    }

    public void setManaFeiticeiro(int manaFeiticeiro) {
        this.manaFeiticeiro = manaFeiticeiro;
    }

    public Magias getMagias() {
        return magias;
    }

    public void setMagias(Magias magias) {
        this.magias = magias;
    }

    Magias gelo = new Magias("nevasca", 80, 40);

    //Feiticeiro ataca Barbaro
    public int atacarBarbaro(String nomeBarbaro, int deManasaBarbaro, int vidaBarbaro, int manaFeiticeiro) {
        int danoFeiticeiroBarbaro = 0;
        if (this.vidaFeiticeiro > 0) {
            int poderFinalAtaqueMachado = (getAtaqueFeiticeiro() * gelo.getPoderMagia());
            danoFeiticeiroBarbaro = (poderFinalAtaqueMachado - deManasaBarbaro);
            System.out.println(getNomeFeiticeiro() + " atacou " + nomeBarbaro + " com " + gelo.getNomeMagia() + " causando " + danoFeiticeiroBarbaro + " de dano.");
        } else if (vidaBarbaro <= 0) {
            System.out.println(getNomeFeiticeiro() + " atacou " + nomeBarbaro + " com " + gelo.getNomeMagia() + " causando " + danoFeiticeiroBarbaro + " de dano e " + nomeBarbaro + "morreu!");
        } else if (manaFeiticeiro < gelo.getCustoDeMana()) {
            System.out.println("Ataque ignorado, personagem " + nomeFeiticeiro + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeFeiticeiro + " está morto.");
        }
        return 0;
    }

    //Feiticeiro ataca Clerigo
    public int atacarClerigo(String nomeClerigo, int deManasaClerigo, int vidaClerigo, int manaFeiticeiro) {
        int danoFeiticeiroClerigo = 0;
        if (this.vidaFeiticeiro > 0) {
            int poderFinalAtaqueMachado = (getAtaqueFeiticeiro() * gelo.getPoderMagia());
            danoFeiticeiroClerigo = (poderFinalAtaqueMachado - deManasaClerigo);
            System.out.println(getNomeFeiticeiro() + " atacou " + nomeClerigo + " com " + gelo.getNomeMagia() + " causando " + danoFeiticeiroClerigo + " de dano.");
        } else if (vidaClerigo <= 0) {
            System.out.println(getNomeFeiticeiro() + " atacou " + nomeClerigo + " com " + gelo.getNomeMagia() + " causando " + danoFeiticeiroClerigo + " de dano e " + nomeClerigo + "morreu!");
        } else if (manaFeiticeiro < gelo.getCustoDeMana()) {
            System.out.println("Ataque ignorado, personagem " + nomeFeiticeiro + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeFeiticeiro + " está morto.");
        }
        return 0;
    }

    //Feiticeiro ataca Druida
    public int atacarDruida(String nomeDruida, int deManasaDruida, int vidaDruida, int manaFeiticeiro) {
        int danoFeiticeiroDruida = 0;
        if (this.vidaFeiticeiro > 0) {
            int poderFinalAtaqueMachado = (getAtaqueFeiticeiro() * gelo.getPoderMagia());
            danoFeiticeiroDruida = (poderFinalAtaqueMachado - deManasaDruida);
            System.out.println(getNomeFeiticeiro() + " atacou " + nomeDruida + " com " + gelo.getNomeMagia() + " causando " + danoFeiticeiroDruida + " de dano.");
        } else if (vidaDruida <= 0) {
            System.out.println(getNomeFeiticeiro() + " atacou " + nomeDruida + " com " + gelo.getNomeMagia() + " causando " + danoFeiticeiroDruida + " de dano e " + nomeDruida + "morreu!");
        } else if (manaFeiticeiro < gelo.getCustoDeMana()) {
            System.out.println("Ataque ignorado, personagem " + nomeFeiticeiro + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeFeiticeiro + " está morto.");
        }
        return 0;
    }

    //Feiticeiro ataca Guerreiro
    public int atacarGuerreiro(String nomeGuerreiro, int deManasaGuerreiro, int vidaGuerreiro, int manaFeiticeiro) {
        int danoFeiticeiroGuerreiro = 0;
        if (this.vidaFeiticeiro > 0) {
            int poderFinalAtaqueMachado = (getAtaqueFeiticeiro() * gelo.getPoderMagia());
            danoFeiticeiroGuerreiro = (poderFinalAtaqueMachado - deManasaGuerreiro);
            System.out.println(getNomeFeiticeiro() + " atacou " + nomeGuerreiro + " com " + gelo.getNomeMagia() + " causando " + danoFeiticeiroGuerreiro + " de dano.");
        } else if (vidaGuerreiro <= 0) {
            System.out.println(getNomeFeiticeiro() + " atacou " + nomeGuerreiro + " com " + gelo.getNomeMagia() + " causando " + danoFeiticeiroGuerreiro + " de dano e " + nomeGuerreiro + "morreu!");
        } else if (manaFeiticeiro < gelo.getCustoDeMana()) {
            System.out.println("Ataque ignorado, personagem " + nomeFeiticeiro + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeFeiticeiro + " está morto.");
        }
        return 0;
    }

    //Feiticeiro ataca Mago
    public int atacarMago(String nomeMago, int deManasaMago, int vidaMago, int manaFeiticeiro) {
        int danoFeiticeiroMago = 0;
        if (this.vidaFeiticeiro > 0) {
            int poderFinalAtaqueMachado = (getAtaqueFeiticeiro() * gelo.getPoderMagia());
            danoFeiticeiroMago = (poderFinalAtaqueMachado - deManasaMago);
            System.out.println(getNomeFeiticeiro() + " atacou " + nomeMago + " com " + gelo.getNomeMagia() + " causando " + danoFeiticeiroMago + " de dano.");
        } else if (vidaMago <= 0) {
            System.out.println(getNomeFeiticeiro() + " atacou " + nomeMago + " com " + gelo.getNomeMagia() + " causando " + danoFeiticeiroMago + " de dano e " + nomeMago + "morreu!");
        } else if (manaFeiticeiro < gelo.getCustoDeMana()) {
            System.out.println("Ataque ignorado, personagem " + nomeFeiticeiro + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeFeiticeiro + " está morto.");
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Feiticeiros{" +
                "nomeFeiticeiro='" + nomeFeiticeiro + '\'' +
                ", vidaFeiticeiro=" + vidaFeiticeiro +
                ", ataqueFeiticeiro=" + ataqueFeiticeiro +
                ", defesaFeiticeiro=" + defesaFeiticeiro +
                ", manaFeiticeiro=" + manaFeiticeiro +
                ", magias=" + magias +
                '}';
    }
}
