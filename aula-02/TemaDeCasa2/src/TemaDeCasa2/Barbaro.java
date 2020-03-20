package TemaDeCasa2;

public class Barbaro extends PersonagemArmado {

    Arma arma;

    public Barbaro(Classe classe, String nome, double vida, double ataque, double defesa, Arma arma) {
        super(classe, nome, vida, ataque, defesa);
        this.arma = arma;
    }

    void imprimirEstado() {
        System.out.println(classe.getDescricao() + " - Nome: " + this.nome + " - Vida: " + this.vida);
    }

    Arma machado = new Arma("machado", 50);

    void equiparArma(String nome, Arma arma){
        System.out.println(this.nome + " equipou " + machado + ". ");
    }


}
