package TemaDeCasa2;

public class Guerreiro extends PersonagemArmado {

    public Guerreiro(Classe classe, String nome, double vida, double ataque, double defesa, Arma espada) {
        super(classe, nome, vida, ataque, defesa);
    }

    void imprimirEstado() {
        System.out.println(classe.getDescricao() + " - Nome: " + this.nome + " - Vida: " + this.vida);
    }


    Arma espada = new Arma("espada", 50);

    void equiparArma(Guerreiro nome, Arma arma){
        System.out.println(this.nome + " equipou " + espada + ". ");
    }


}
