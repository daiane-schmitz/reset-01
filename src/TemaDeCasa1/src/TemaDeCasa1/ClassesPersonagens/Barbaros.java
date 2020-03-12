package TemaDeCasa1.ClassesPersonagens;

import TemaDeCasa1.TiposAtaque.Armas;

public class Barbaros {

    String nomeBarbaro;
    int vidaBarbaro;
    int ataqueBarbaro;
    int defesaBarbaro;
    Armas arma;

    public Barbaros(String nomeBarbaro, int vidaBarbaro, int ataqueBarbaro, int defesaBarbaro, Armas arma) {
        this.nomeBarbaro = nomeBarbaro;
        this.vidaBarbaro = vidaBarbaro;
        this.ataqueBarbaro = ataqueBarbaro;
        this.defesaBarbaro = defesaBarbaro;
        this.arma = arma;
    }

    public String getNomeBarbaro() {
        return nomeBarbaro;
    }

    public void setNomeBarbaro(String nomeBarbaro) {
        this.nomeBarbaro = nomeBarbaro;
    }

    public int getVidaBarbaro() {
        return vidaBarbaro;
    }

    public void setVidaBarbaro(int vidaBarbaro) {
        this.vidaBarbaro = vidaBarbaro;
    }

    public int getAtaqueBarbaro() {
        return ataqueBarbaro;
    }

    public void setAtaqueBarbaro(int ataqueBarbaro) {
        this.ataqueBarbaro = ataqueBarbaro;
    }

    public int getDefesaBarbaro() {
        return defesaBarbaro;
    }

    public void setDefesaBarbaro(int defesaBarbaro) {
        this.defesaBarbaro = defesaBarbaro;
    }

    public Armas getArma() {
        return arma;
    }

    Armas machado = new Armas("machado brutal", 20);

    //Barbaro ataca Clerigo
    public String atacarClerigo(String nomeClerigo, int defesaClerigo, int vidaClerigo) {
        int danoBarbaroClerigo = 0;
        if (this.vidaBarbaro > 0) {
            int poderFinalAtaqueMachado = (getAtaqueBarbaro() * machado.getPoderAtaqueArma());
            danoBarbaroClerigo = (poderFinalAtaqueMachado - defesaClerigo);
            vidaClerigo = (vidaClerigo - danoBarbaroClerigo);
            System.out.println(getNomeBarbaro() + " atacou " + nomeClerigo + " com " + machado.getNomeArma() + " causando " + danoBarbaroClerigo + " de dano.");
        } else if (vidaClerigo <= 0) {
            System.out.println(getNomeBarbaro() + " atacou " + nomeClerigo + " com " + machado.getNomeArma() + " causando " + danoBarbaroClerigo + " de dano e " + nomeClerigo + "morreu!");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeBarbaro + " está morto.");
        }
        return " - - - - - - ";
    }

    //Barbaro ataca Druida
    public String atacarDruida(String nomeDruida, int defesaDruida, int vidaDruida) {
        int danoBarbaroDruida = 0;
        if (this.vidaBarbaro > 0) {
            int poderFinalAtaqueMachado = (getAtaqueBarbaro() * machado.getPoderAtaqueArma());
            danoBarbaroDruida = (poderFinalAtaqueMachado - defesaDruida);
            System.out.println(getNomeBarbaro() + " atacou " + nomeDruida + " com " + machado.getNomeArma() + " causando " + danoBarbaroDruida + " de dano.");
        } else if (vidaDruida <= 0) {
            System.out.println(getNomeBarbaro() + " atacou " + nomeDruida + " com " + machado.getNomeArma() + " causando " + danoBarbaroDruida + " de dano e " + nomeDruida + "morreu!");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeBarbaro + " está morto.");
        }
        return " - - - - - - ";
    }

    //Barbaro ataca Feiticeiro
    public String atacarFeiticeiro (String nomeFeiticeiro, int defesaFeiticeiro, int vidaFeiticeiro) {
        int danoBarbaroFeiticeiro = 0;
        if (this.vidaBarbaro > 0) {
            int poderFinalAtaqueMachado = (getAtaqueBarbaro() * machado.getPoderAtaqueArma());
            danoBarbaroFeiticeiro = (poderFinalAtaqueMachado - defesaFeiticeiro);
            System.out.println(getNomeBarbaro() + " atacou " + nomeFeiticeiro + " com " + machado.getNomeArma() + " causando " + danoBarbaroFeiticeiro + " de dano.");
        } else if (vidaFeiticeiro <= 0) {
            System.out.println(getNomeBarbaro() + " atacou " + nomeFeiticeiro + " com " + machado.getNomeArma() + " causando " + danoBarbaroFeiticeiro + " de dano e " + nomeFeiticeiro + "morreu!");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeBarbaro + " está morto.");
        }
        return " - - - - - - ";
    }

    //Barbaro ataca Guerreiro
    public String atacarGuerreiro (String nomeGuerreiro, int defesaGuerreiro, int vidaGuerreiro) {
        int danoBarbaroGuerreiro = 0;
        if (this.vidaBarbaro > 0) {
            int poderFinalAtaqueMachado = (getAtaqueBarbaro() * machado.getPoderAtaqueArma());
            danoBarbaroGuerreiro = (poderFinalAtaqueMachado - defesaGuerreiro);
            System.out.println(getNomeBarbaro() + " atacou " + nomeGuerreiro + " com " + machado.getNomeArma() + " causando " + danoBarbaroGuerreiro + " de dano.");
        } else if (vidaGuerreiro <= 0) {
            System.out.println(getNomeBarbaro() + " atacou " + nomeGuerreiro + " com " + machado.getNomeArma() + " causando " + danoBarbaroGuerreiro + " de dano e " + nomeGuerreiro + "morreu!");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeBarbaro + " está morto.");
        }
        return " - - - - - - ";
    }

    //Barbaro ataca Mago
    public String atacarMago (String nomeMago, int defesaMago, int vidaMago) {
        int danoBarbaroMago = 0;
        if (this.vidaBarbaro > 0) {
            int poderFinalAtaqueMachado = (getAtaqueBarbaro() * machado.getPoderAtaqueArma());
            danoBarbaroMago = (poderFinalAtaqueMachado - defesaMago);
            System.out.println(getNomeBarbaro() + " atacou " + nomeMago + " com " + machado.getNomeArma() + " causando " + danoBarbaroMago + " de dano.");
        } else if (vidaMago <= 0) {
            System.out.println(getNomeBarbaro() + " atacou " + nomeMago + " com " + machado.getNomeArma() + " causando " + danoBarbaroMago + " de dano e " + nomeMago + "morreu!");
        } else {
            System.out.println("Ataque ignorado, personagem " + nomeBarbaro + " está morto.");
        }
        return " - - - - - - ";
    }

    @Override
    public String toString() {
        return "Barbaros {" +
                " nome '" + nomeBarbaro + '\'' +
                ", vida = " + vidaBarbaro +
                ", ataque = " + ataqueBarbaro +
                ", defesa =" + defesaBarbaro +
                ", = " + arma +
                '}';
    }
}
