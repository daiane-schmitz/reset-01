package TemaDeCasa2;

public class PersonagemSacerdote extends Personagem{

   int fe;

    public PersonagemSacerdote(String nome, double vida, double ataque, double defesa, int fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " - Vida: " + this.vida + " - Fé: " + this.fe);
    }

    void atacar(Personagem alvo, PoderDivino poderDivino) {
        double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
        alvo.vida -= dano;
        this.fe -= poderDivino.custoFe;
        registrar(alvo.nome, poderDivino.nome, dano);
    }
}
