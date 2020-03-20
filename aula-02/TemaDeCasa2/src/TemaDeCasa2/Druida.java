package TemaDeCasa2;

public class Druida extends PersonagemSacerdote{


    Druida(Classe classe, String nome, double vida, double ataque, double defesa, int fe, PoderDivino poderDivino) {
        super(classe, nome, vida, ataque, defesa, fe, poderDivino);
    }

    void imprimirEstado() {
        System.out.println(classe.getDescricao() + " - Nome: " + this.nome + " - Vida: " + this.vida + " - Fé: " + this.fe);
    }


    }



