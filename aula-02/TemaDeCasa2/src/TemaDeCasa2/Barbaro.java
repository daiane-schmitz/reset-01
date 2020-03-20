package TemaDeCasa2;

public class Barbaro extends PersonagemArmado {

    Arma arma;

    public Barbaro(Classe classe, String nome, double vida, double ataque, double defesa, Arma arma) {
        super(classe, nome, vida, ataque, defesa, arma);
        this.arma = arma;
    }

    void imprimirEstado() {
        System.out.println(classe.getDescricao() + " - Nome: " + this.nome + " - Vida: " + this.vida);
    }

    void equiparArma(String nome, Arma machado){
        System.out.println("O " + this.getClasse().getDescricao() + this.getNome() + " equipou " + machado + ".");
    }


}
