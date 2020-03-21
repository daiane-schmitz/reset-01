package TemaDeCasa2;

public abstract class Personagem {

    Classe classe;
    final String nome;
    double vida;
    final double ataque;
    final double defesa;

    public Personagem(Classe classe, final String nome, final double ataque, final double defesa, double vida) {
        this.classe = classe;
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vida = vida;
    }


    double calcularDano(double defesa, double poder) {
        return ((this.ataque * poder) - defesa);
    }


    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double dano) {
        this.vida -= dano;
        if (this.vida <= 0) {
            System.out.println("O personagem morreu.");
        }
    }

    public boolean vivo() {
        if (this.vida > 0) {
            return true;
        } else {
            return false;
        }

    }
}
    //sei que tá redundante, mas me confundo com boolean

/*    public void atacar(Personagem alvo, Habilidade habilidade) {
        double dano = calcularDano(alvo.getDefesa(), habilidade.getPoderAtaque());
        alvo.vida -= dano;
        if (alvo.getVida() <= 0) {
            System.out.println("O personagem " + alvo + " morreu.");
        } else {
            System.out.println("A luta continua");


 */