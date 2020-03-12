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

    Barbaros barbaro = new Barbaros("Ragst", 10000, 30, 15, machado);
    Clerigos clerigo = new Clerigos("Shine", 7500, 22, 4, 600, luz);
    Druidas druida = new Druidas("Leafboar", 5000, 18, 2, 400, terra);
    Feiticeiros feiticeiro = new Feiticeiros("Nanmar", 6500, 20, 5, 500, gelo);
    Guerreiros guerreiro = new Guerreiros("Lithan", 9500, 25, 18, espada);
    Magos mago = new Magos("Kithae", 5500, 800, 6, 500, fogo);

    int poderFinalAtaqueMachado = (barbaro.getAtaqueBarbaro() * machado.getPoderAtaqueArma());
    int poderFinalAtaqueEspada = (espada.getPoderAtaqueArma() * guerreiro.getAtaqueGuerreiro());
    int poderFinalAtaqueFogo = (fogo.getPoderMagia() * mago.getAtaqueMago());
    int poderFinalAtaqueGelo = (gelo.getPoderMagia() * feiticeiro.getAtaqueFeiticeiro());
    int poderFinalAtaqueLuz = (luz.getIntensidadePoderDivino() * clerigo.getAtaqueClerigo());
    int poderFinalAtaqueTerra = (terra.getIntensidadePoderDivino() * druida.getAtaqueDruida());


    //Personagens
        System.out.println(" - - - Personagens das Batalhas - - -");
        System.out.println();
        System.out.println(guerreiro.toString());
        System.out.println();
        System.out.println(barbaro.toString());
        System.out.println();
        System.out.println(feiticeiro.toString());
        System.out.println();
        System.out.println(mago.toString());
        System.out.println();
        System.out.println(druida.toString());
        System.out.println();
        System.out.println(clerigo.toString());
        System.out.println();

        //Primeira batalha
        System.out.println(" - - - Primeira Batalha - - - Bárbaro x Clérigo - - - ");
        System.out.println();

    //Barbaro ataca Clerigo - 1
        System.out.println(barbaro.atacarClerigo(clerigo.getNomeClerigo(), clerigo.getDefesaClerigo(), clerigo.getVidaClerigo()));
    //Clerigo ataca Barbaro - 1
        System.out.println(clerigo.atacarBarbaro(barbaro.getNomeBarbaro(), barbaro.getDefesaBarbaro(), barbaro.getVidaBarbaro(), clerigo.getFeClerigo()));

        //Barbaro ataca Clerigo - 2
        System.out.println(barbaro.atacarClerigo(clerigo.getNomeClerigo(), clerigo.getDefesaClerigo(), clerigo.getVidaClerigo()));
        //Clerigo ataca Barbaro - 2
        System.out.println(clerigo.atacarBarbaro(barbaro.getNomeBarbaro(), barbaro.getDefesaBarbaro(), barbaro.getVidaBarbaro(), clerigo.getFeClerigo()));

        //Vida final
        int danoBarbaroClerigo = ((poderFinalAtaqueMachado - clerigo.getDefesaClerigo())*2);
        clerigo.setVidaClerigo((clerigo.getVidaClerigo() - danoBarbaroClerigo));

        int danoClerigoBarbaro1 = ((poderFinalAtaqueLuz - barbaro.getDefesaBarbaro())*2);
        barbaro.setVidaBarbaro((barbaro.getVidaBarbaro() - danoClerigoBarbaro1));

        ////////fazer if pra sysout !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println("A vida final de " + clerigo.getNomeClerigo() + " é: " + clerigo.getVidaClerigo());

        System.out.println("A vida final de " + barbaro.getNomeBarbaro() + " é: " + barbaro.getVidaBarbaro());

        System.out.println();

        //Segunda batalha
        System.out.println(" - - - Segunda Batalha - - - Guerreiro x Mago - - - ");
        System.out.println();

        //Guerreiro ataca Mago - 1
        System.out.println(guerreiro.atacarMago(mago.getNomeMago(), mago.getDefesaMago(), mago.getVidaMago()));

        //Mago ataca Guerreiro - 1
        System.out.println(mago.atacarGuerreiro(guerreiro.getNomeGuerreiro(), guerreiro.getDefesaGuerreiro(), guerreiro.getVidaGuerreiro(), mago.getManaMago()));

        //Guerreiro ataca Mago - 2
        System.out.println(guerreiro.atacarMago(mago.getNomeMago(), mago.getDefesaMago(), mago.getVidaMago()));

        //Mago ataca Guerreiro - 2
        System.out.println(mago.atacarGuerreiro(guerreiro.getNomeGuerreiro(), guerreiro.getDefesaGuerreiro(), guerreiro.getVidaGuerreiro(), mago.getManaMago()));


        //Vida final
        int danoGuerreiroMago = ((poderFinalAtaqueMachado - mago.getDefesaMago())*2);
        mago.setVidaMago((mago.getVidaMago() - danoGuerreiroMago));

        int danoMagoGuerreiro1 = ((poderFinalAtaqueLuz - guerreiro.getDefesaGuerreiro())*2);
        guerreiro.setVidaGuerreiro((guerreiro.getVidaGuerreiro() - danoMagoGuerreiro1));

        System.out.println("A vida final de " + mago.getNomeMago() + " é: " + mago.getVidaMago());
        System.out.println("A vida final de " + guerreiro.getNomeGuerreiro() + " é: " + guerreiro.getVidaGuerreiro());

        //Terceira batalha
        System.out.println(" - - - Terceira Batalha - - - Druida x Feiticeiro - - - ");
        System.out.println();

        //Druida ataca Feiticeiro - 1
        System.out.println(druida.atacarFeiticeiro(feiticeiro.getNomeFeiticeiro(), feiticeiro.getDefesaFeiticeiro(), feiticeiro.getVidaFeiticeiro(), feiticeiro.getManaFeiticeiro()));

        //Feiticeiro ataca Druida - 1
        System.out.println(feiticeiro.atacarDruida(druida.getNomeDruida(), druida.getDefesaDruida(), druida.getVidaDruida(), druida.getFeDruida()));

        //Druida ataca Feiticeiro - 2
        System.out.println(druida.atacarFeiticeiro(feiticeiro.getNomeFeiticeiro(), feiticeiro.getDefesaFeiticeiro(), feiticeiro.getVidaFeiticeiro(), feiticeiro.getManaFeiticeiro()));

        //Feiticeiro ataca Druida - 2
        System.out.println(feiticeiro.atacarDruida(druida.getNomeDruida(), druida.getDefesaDruida(), druida.getVidaDruida(), druida.getFeDruida()));


        //Vida final
        int danoDruidaFeiticeiro = ((poderFinalAtaqueMachado - feiticeiro.getDefesaFeiticeiro())*2);
        feiticeiro.setVidaFeiticeiro((feiticeiro.getVidaFeiticeiro() - danoDruidaFeiticeiro));

        int danoFeiticeiroDruida1 = ((poderFinalAtaqueLuz - druida.getDefesaDruida())*2);
        druida.setVidaDruida((druida.getVidaDruida() - danoFeiticeiroDruida1));

        System.out.println("A vida final de " + feiticeiro.getNomeFeiticeiro() + " é: " + feiticeiro.getVidaFeiticeiro());
        System.out.println("A vida final de " + druida.getNomeDruida() + " é: " + druida.getVidaDruida());
    }

}

