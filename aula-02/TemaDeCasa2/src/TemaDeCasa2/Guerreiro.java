package TemaDeCasa2;

public class Guerreiro extends PersonagemArmado {

    public Guerreiro(Classe classe, String nome, double vida, double ataque, double defesa, Arma arma) {
        super(classe, nome, vida, ataque, defesa, arma);
    }

    void imprimirEstado() {
        System.out.println(classe.getDescricao() + " - Nome: " + this.nome + " - Vida: " + this.vida);
    }


    void equiparArma(Guerreiro nome, Arma espada){
        System.out.println(this.nome + " equipou " + espada + ". ");
    }


}
