package TemaDeCasa1.ClassesPersonagens;

import TemaDeCasa1.TiposAtaque.Magias;

public class Magos {

    String nomeMago;
    int vidaMago;
    int ataqueMago;
    int defesaMago;
    int manaMago;
    Magias magias;

    public Magos() {
    }

    public Magos(String nomeMago, int vidaMago, int ataqueMago, int defesaMago, int manaMago, Magias magias) {
        super();
        this.nomeMago = nomeMago;
        this.vidaMago = vidaMago;
        this.ataqueMago = ataqueMago;
        this.defesaMago = defesaMago;
        this.manaMago = manaMago;
        this.magias = magias;
    }

    public String getNomeMago() {
        return nomeMago;
    }

    public void setNomeMago(String nomeMago) {
        this.nomeMago = nomeMago;
    }

    public int getVidaMago() {
        return vidaMago;
    }

    public void setVidaMago(int vidaMago) {
        this.vidaMago = vidaMago;
    }

    public int getAtaqueMago() {
        return ataqueMago;
    }

    public void setAtaqueMago(int ataqueMago) {
        this.ataqueMago = ataqueMago;
    }

    public int getDefesaMago() {
        return defesaMago;
    }

    public void setDefesaMago(int defesaMago) {
        this.defesaMago = defesaMago;
    }

    public int getManaMago() {
        return manaMago;
    }

    public void setManaMago(int manaMago) {
        this.manaMago = manaMago;
    }

    public Magias getMagias() {
        return magias;
    }

    public void setMagias(Magias magias) {
        this.magias = magias;
    }

    Magias fogo = new Magias("raio de fogo", 100, 50);

    //Mago ataca Barbaro
    public String atacarBarbaro(String nomeBarbaro, int deManasaBarbaro, int vidaBarbaro, int manaMago) {
        int danoMagoBarbaro = 0;
        if (this.vidaMago > 0) {
            int poderFinalAtaqueMachado = (getAtaqueMago() * fogo.getPoderMagia());
            danoMagoBarbaro = (poderFinalAtaqueMachado - deManasaBarbaro);
            System.out.println(getNomeMago() + " atacou " + nomeBarbaro + " com " + fogo.getNomeMagia() + " causando " + danoMagoBarbaro + " de dano.");
        } else if (vidaBarbaro <= 0) {
            System.out.println(getNomeMago() + " atacou " + nomeBarbaro + " com " + fogo.getNomeMagia() + " causando " + danoMagoBarbaro + " de dano e " + nomeBarbaro + "morreu!");
        } else if (manaMago < fogo.getCustoDeMana()) {
            System.out.println("Ataque ignorado, personagem " + nomeMago + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeMago + " está morto.");
        }
        return " - - - - - - ";
    }

    //Mago ataca Clerigo
    public String atacarClerigo(String nomeClerigo, int deManasaClerigo, int vidaClerigo, int manaMago) {
        int danoMagoClerigo = 0;
        if (this.vidaMago > 0) {
            int poderFinalAtaqueMachado = (getAtaqueMago() * fogo.getPoderMagia());
            danoMagoClerigo = (poderFinalAtaqueMachado - deManasaClerigo);
            System.out.println(getNomeMago() + " atacou " + nomeClerigo + " com " + fogo.getNomeMagia() + " causando " + danoMagoClerigo + " de dano.");
        } else if (vidaClerigo <= 0) {
            System.out.println(getNomeMago() + " atacou " + nomeClerigo + " com " + fogo.getNomeMagia() + " causando " + danoMagoClerigo + " de dano e " + nomeClerigo + "morreu!");
        } else if (manaMago < fogo.getCustoDeMana()) {
            System.out.println("Ataque ignorado, personagem " + nomeMago + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeMago + " está morto.");
        }
        return " - - - - - - ";
    }

    //Mago ataca Druida
    public String atacarDruida(String nomeDruida, int deManasaDruida, int vidaDruida, int manaMago) {
        int danoMagoDruida = 0;
        if (this.vidaMago > 0) {
            int poderFinalAtaqueMachado = (getAtaqueMago() * fogo.getPoderMagia());
            danoMagoDruida = (poderFinalAtaqueMachado - deManasaDruida);
            System.out.println(getNomeMago() + " atacou " + nomeDruida + " com " + fogo.getNomeMagia() + " causando " + danoMagoDruida + " de dano.");
        } else if (vidaDruida <= 0) {
            System.out.println(getNomeMago() + " atacou " + nomeDruida + " com " + fogo.getNomeMagia() + " causando " + danoMagoDruida + " de dano e " + nomeDruida + "morreu!");
        } else if (manaMago < fogo.getCustoDeMana()) {
            System.out.println("Ataque ignorado, personagem " + nomeMago + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeMago + " está morto.");
        }
        return " - - - - - - ";
    }

    //Mago ataca Feiticeiro
    public String atacarFeiticeiro(String nomeFeiticeiro, int deManasaFeiticeiro, int vidaFeiticeiro, int manaMago) {
        int danoMagoFeiticeiro = 0;
        if (this.vidaMago > 0) {
            int poderFinalAtaqueMachado = (getAtaqueMago() * fogo.getPoderMagia());
            danoMagoFeiticeiro = (poderFinalAtaqueMachado - deManasaFeiticeiro);
            System.out.println(getNomeMago() + " atacou " + nomeFeiticeiro + " com " + fogo.getNomeMagia() + " causando " + danoMagoFeiticeiro + " de dano.");
        } else if (vidaFeiticeiro <= 0) {
            System.out.println(getNomeMago() + " atacou " + nomeFeiticeiro + " com " + fogo.getNomeMagia() + " causando " + danoMagoFeiticeiro + " de dano e " + nomeFeiticeiro + "morreu!");
        } else if (manaMago < fogo.getCustoDeMana()) {
            System.out.println("Ataque ignorado, personagem " + nomeMago + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeMago + " está morto.");
        }
        return " - - - - - - ";
    }

    //Mago ataca Guerreiro
    public String atacarGuerreiro(String nomeGuerreiro, int deManasaGuerreiro, int vidaGuerreiro, int manaMago) {
        int danoMagoGuerreiro = 0;
        if (this.vidaMago > 0) {
            int poderFinalAtaqueMachado = (getAtaqueMago() * fogo.getPoderMagia());
            danoMagoGuerreiro = (poderFinalAtaqueMachado - deManasaGuerreiro);
            System.out.println(getNomeMago() + " atacou " + nomeGuerreiro + " com " + fogo.getNomeMagia() + " causando " + danoMagoGuerreiro + " de dano.");
        } else if (vidaGuerreiro <= 0) {
            System.out.println(getNomeMago() + " atacou " + nomeGuerreiro + " com " + fogo.getNomeMagia() + " causando " + danoMagoGuerreiro + " de dano e " + nomeGuerreiro + "morreu!");
        } else if (manaMago < fogo.getCustoDeMana()) {
            System.out.println("Ataque ignorado, personagem " + nomeMago + " está com pouca fé.");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeMago + " está morto.");
        }
        return " - - - - - - ";
    }


    @Override
    public String toString() {
        return "Magos {" +
                " nome = '" + nomeMago + '\'' +
                ", vida = " + vidaMago +
                ", ataque = " + ataqueMago +
                ", defesa = " + defesaMago +
                ", mana = " + manaMago +
                ", = " + magias +
                '}';
    }
}
