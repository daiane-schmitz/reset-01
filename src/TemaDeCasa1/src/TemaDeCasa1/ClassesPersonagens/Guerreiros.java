package TemaDeCasa1.ClassesPersonagens;

import TemaDeCasa1.TiposAtaque.Armas;

public class Guerreiros {

    String nomeGuerreiro;
    int vidaGuerreiro;
    int ataqueGuerreiro;
    int defesaGuerreiro;
    Armas armas;

    public Guerreiros(String nomeGuerreiro, int vidaGuerreiro, int ataqueGuerreiro, int defesaGuerreiro, Armas armas) {
        this.nomeGuerreiro = nomeGuerreiro;
        this.vidaGuerreiro = vidaGuerreiro;
        this.ataqueGuerreiro = ataqueGuerreiro;
        this.defesaGuerreiro = defesaGuerreiro;
        this.armas = armas;
    }

    public String getNomeGuerreiro() {
        return nomeGuerreiro;
    }

    public void setNomeGuerreiro(String nomeGuerreiro) {
        this.nomeGuerreiro = nomeGuerreiro;
    }

    public int getVidaGuerreiro() {
        return vidaGuerreiro;
    }

    public void setVidaGuerreiro(int vidaGuerreiro) {
        this.vidaGuerreiro = vidaGuerreiro;
    }

    public int getAtaqueGuerreiro() {
        return ataqueGuerreiro;
    }

    public void setAtaqueGuerreiro(int ataqueGuerreiro) {
        this.ataqueGuerreiro = ataqueGuerreiro;
    }

    public int getDefesaGuerreiro() {
        return defesaGuerreiro;
    }

    public void setDefesaGuerreiro(int defesaGuerreiro) {
        this.defesaGuerreiro = defesaGuerreiro;
    }

    public Armas getArmas() {
        return armas;
    }

    public void setArmas(Armas armas) {
        this.armas = armas;
    }

    Armas espada = new Armas("espada heróica", 15);

    //Guerreiro ataca Barbaro
    public String atacarBarbaro(String nomeBarbaro, int defesaBarbaro, int vidaBarbaro) {
        int danoGuerreiroBarbaro = 0;
        if (this.vidaGuerreiro > 0) {
            int poderFinalAtaqueespada = (getAtaqueGuerreiro() * espada.getPoderAtaqueArma());
            danoGuerreiroBarbaro = (poderFinalAtaqueespada - defesaBarbaro);
            int vidaFinalBarbaro = (vidaBarbaro - danoGuerreiroBarbaro);
            System.out.println(getNomeGuerreiro() + " atacou " + nomeBarbaro + " com " + espada.getNomeArma() + " causando " + danoGuerreiroBarbaro + " de dano.");
        } else if (vidaBarbaro <= 0) {
            System.out.println(getNomeGuerreiro() + " atacou " + nomeBarbaro + " com " + espada.getNomeArma() + " causando " + danoGuerreiroBarbaro + " de dano e " + nomeBarbaro + "morreu!");
        }else {
            System.out.println("Ataque ignorado, personagem " + nomeGuerreiro + " está morto.");
        }
        return " - - - - - - ";
    }

    //Guerreiro ataca Clerigo
    public String atacarClerigo(String nomeClerigo, int defesaClerigo, int vidaClerigo) {
        int danoGuerreiroClerigo = 0;
        if (this.vidaGuerreiro > 0) {
            int poderFinalAtaqueespada = (getAtaqueGuerreiro() * espada.getPoderAtaqueArma());
            danoGuerreiroClerigo = (poderFinalAtaqueespada - defesaClerigo);
            int vidaFinalClerigo = (vidaClerigo - danoGuerreiroClerigo);
            System.out.println(getNomeGuerreiro() + " atacou " + nomeClerigo + " com " + espada.getNomeArma() + " causando " + danoGuerreiroClerigo + " de dano.");
        } else if (vidaClerigo <= 0) {
            System.out.println(getNomeGuerreiro() + " atacou " + nomeClerigo + " com " + espada.getNomeArma() + " causando " + danoGuerreiroClerigo + " de dano e " + nomeClerigo + "morreu!");
        }else {
            System.out.println("Ataque ignorado, personagem " + nomeGuerreiro + " está morto.");
        }
        return " - - - - - - ";
    }

    //Guerreiro ataca Druida
    public String atacarDruida(String nomeDruida, int defesaDruida, int vidaDruida) {
        int danoGuerreiroDruida = 0;
        if (this.vidaGuerreiro > 0) {
            int poderFinalAtaqueespada = (getAtaqueGuerreiro() * espada.getPoderAtaqueArma());
            danoGuerreiroDruida = (poderFinalAtaqueespada - defesaDruida);
            int vidaFinalDruida = (vidaDruida - danoGuerreiroDruida);
            System.out.println(getNomeGuerreiro() + " atacou " + nomeDruida + " com " + espada.getNomeArma() + " causando " + danoGuerreiroDruida + " de dano.");
        } else if (vidaDruida <= 0) {
            System.out.println(getNomeGuerreiro() + " atacou " + nomeDruida + " com " + espada.getNomeArma() + " causando " + danoGuerreiroDruida + " de dano e " + nomeDruida + "morreu!");
        }else {
            System.out.println("Ataque ignorado, personagem " + nomeGuerreiro + " está morto.");
        }
        return " - - - - - - ";
    }

    //Guerreiro ataca Feiticeiro
    public String atacarFeiticeiro(String nomeFeiticeiro, int defesaFeiticeiro, int vidaFeiticeiro) {
        int danoGuerreiroFeiticeiro = 0;
        if (this.vidaGuerreiro > 0) {
            int poderFinalAtaqueespada = (getAtaqueGuerreiro() * espada.getPoderAtaqueArma());
            danoGuerreiroFeiticeiro = (poderFinalAtaqueespada - defesaFeiticeiro);
            int vidaFinalFeiticeiro = (vidaFeiticeiro - danoGuerreiroFeiticeiro);
            System.out.println(getNomeGuerreiro() + " atacou " + nomeFeiticeiro + " com " + espada.getNomeArma() + " causando " + danoGuerreiroFeiticeiro + " de dano.");
        } else if (vidaFeiticeiro <= 0) {
            System.out.println(getNomeGuerreiro() + " atacou " + nomeFeiticeiro + " com " + espada.getNomeArma() + " causando " + danoGuerreiroFeiticeiro + " de dano e " + nomeFeiticeiro + "morreu!");
        }else {
            System.out.println("Ataque ignorado, personagem " + nomeGuerreiro + " está morto.");
        }
        return " - - - - - - ";
    }

    //Guerreiro ataca Mago
    public String atacarMago(String nomeMago, int defesaMago, int vidaMago) {
        int danoGuerreiroMago = 0;
        if (this.vidaGuerreiro > 0) {
            int poderFinalAtaqueespada = (getAtaqueGuerreiro() * espada.getPoderAtaqueArma());
            danoGuerreiroMago = (poderFinalAtaqueespada - defesaMago);
            int vidaFinalMago = (vidaMago - danoGuerreiroMago);
            System.out.println(getNomeGuerreiro() + " atacou " + nomeMago + " com " + espada.getNomeArma() + " causando " + danoGuerreiroMago + " de dano.");
        } else if (vidaMago <= 0) {
            System.out.println(getNomeGuerreiro() + " atacou " + nomeMago + " com " + espada.getNomeArma() + " causando " + danoGuerreiroMago + " de dano e " + nomeMago + "morreu!");
        }else {
            System.out.println("Ataque ignorado, personagem " + nomeGuerreiro + " está morto.");
        }
        return " - - - - - - ";
    }


    @Override
    public String toString() {
        return "Guerreiros {" +
                "nome = ' " + nomeGuerreiro + '\'' +
                ", vida = " + vidaGuerreiro +
                ", ataque = " + ataqueGuerreiro +
                ", defesa = " + defesaGuerreiro +
                ", armas = " + armas +
                '}';
    }
}
