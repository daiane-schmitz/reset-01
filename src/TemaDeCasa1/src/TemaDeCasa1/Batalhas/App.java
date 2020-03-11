package TemaDeCasa1.Batalhas;

import TemaDeCasa1.ClassesPersonagens.*;
import TemaDeCasa1.TiposAtaque.Armas;
import TemaDeCasa1.TiposAtaque.Magias;
import TemaDeCasa1.TiposAtaque.PoderesDivinos;

public class App {

    public static void main(String[] args) {

    Armas machado = new Armas("machado brutal", 20);
    Armas espada = new Armas("espada heróica", 15);
    Magias fogo = new Magias("raio de fogo", 100, 50);
    Magias gelo = new Magias("nevasca", 80, 40);
    PoderesDivinos luz = new PoderesDivinos("luz divina", 50, 30);
    PoderesDivinos terra = new PoderesDivinos("cajado de terra", 60, 30);

    Barbaros barbaro = new Barbaros("Ragst", 1000, 30, 15, machado);
    Clerigos clerigo = new Clerigos("Shine", 750, 22, 4, 600, luz);
    Druidas druida = new Druidas("Leafboar", 500, 18, 2, 400, terra);
    Feiticeiros feiticeiro = new Feiticeiros("Nanmar", 650, 20, 5, 500, gelo);
    Guerreiros guerreiro = new Guerreiros("Lithan", 950, 25, 18, espada);
    Magos mago = new Magos("Kithae", 25, 800, 6, 500, fogo);


    int poderFinalAtaqueEspada = (espada.getPoderAtaqueArma() * guerreiro.getAtaqueGuerreiro());
    int poderFinalAtaqueFogo = (fogo.getPoderMagia() * mago.getAtaqueMago());
    int poderFinalAtaqueGelo = (gelo.getPoderMagia() * feiticeiro.getAtaqueFeiticeiro());
    int poderFinalAtaqueLuz = (luz.getIntensidadePoderDivino() * clerigo.getAtaqueClerigo());
    int poderFinalAtaqueTerra = (terra.getIntensidadePoderDivino() * druida.getAtaqueDruida());

    //Barbaro ataca Clerigo

        System.out.println(barbaro.atacarClerigo(clerigo.getNomeClerigo(), clerigo.getDefesaClerigo(), clerigo.getVidaClerigo()));



    }

}

