package TemaDeCasa2;

public class PersonagemArmado extends Personagem{


    public PersonagemArmado(String nome, double vida, double ataque, double defesa) {
        super(nome, vida, ataque, defesa);
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " - Vida: " + this.vida);
    }

    void atacar(Personagem alvo, Arma arma) {
        double dano = calcularDano(alvo.defesa, arma.poderAtaque);
        alvo.vida -= dano;
        registrar(alvo.nome, arma.nome, dano);
    }


}
