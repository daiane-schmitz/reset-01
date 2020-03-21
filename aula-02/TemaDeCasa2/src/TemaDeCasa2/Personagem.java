package TemaDeCasa2;

public abstract class Personagem {

    Classe classe;
    final String nome;
    double vida;
    final double ataque;
    final double defesa;
    Registro registro;
    Habilidade habilidade;

    public Personagem(Classe classe, final String nome, final double ataque, final double defesa, double vida) {
        this.classe = classe;
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vida = vida;
        this.registro = registro;
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

    public void registrar(Personagem alvo, String habilidade, double dano) {
        String output = this.nome + " atacou " + alvo.getNome() + " usando " + habilidade + " e causou " + dano + " de dano.";

        if (alvo.getVida() > 0) {
            registro.adicionarRegistro(output);
        } else {
            registro.adicionarRegistro(nome + " está morto.");
        }
    }

    public boolean atacar(Personagem alvo, Habilidade habilidade) {
        double dano = calcularDano(alvo.getDefesa(), habilidade.getPoderAtaque());
        alvo.vida -= dano;
        if (alvo.getVida() <= 0) {
            System.out.println("O personagem " + alvo + " morreu.");
        } else {
            System.out.println("A luta continua");
        }
        return true;
    }
}