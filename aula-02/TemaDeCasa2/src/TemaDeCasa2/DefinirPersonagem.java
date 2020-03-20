package TemaDeCasa2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DefinirPersonagem {


    public static void main(String[] args) {

        Magia fogo = new Magia("fogo", 35, 20);
        Magia gelo = new Magia ("gelo", 30, 18);
        Arma espada = new Arma("espada", 50);
        Arma machado = new Arma("machado", 50);
        PoderDivino luz = new PoderDivino("luz divina", 100, 40);
        PoderDivino raio = new PoderDivino("raio", 80, 30);



        List<Personagem> personagens = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        System.out.println("Selecione o número de personagens que você deseja criar: ");
        int numero = in.nextInt();
        int personagem;
        for (personagem = 0; personagem < numero ; personagem++) {

            System.out.println();
            System.out.println("Crie seu personagem... ");
            System.out.println();
            System.out.println("Escolha a classe do seu personagem: ");

            System.out.println("B - Bárbaro");
            System.out.println("C - Clérigo");
            System.out.println("D - Druida");
            System.out.println("F - Feiticeiro");
            System.out.println("G - Guerreiro");
            System.out.println("M - Mago");
            System.out.println();
            System.out.print("Classe: ");
            char classePersonagem = in.next().charAt(0);

            System.out.println("Defina os outros atributos do personagem... ");
            System.out.println();
            System.out.print("Nome: ");
            String nome = in.next();
            System.out.print("Vida: ");
            double vida = in.nextDouble();
            System.out.print("Ataque: ");
            double ataque = in.nextDouble();
            System.out.print("Defesa: ");
            double defesa = in.nextDouble();

            switch (classePersonagem) {

                case 'B':
                    System.out.println("Criando bárbaro...");
                    System.out.println();
                    Barbaro barbaro = new Barbaro(Classe.BARBARO, nome, vida, ataque, defesa, machado);
                    personagens.add(barbaro);
                    barbaro.imprimirEstado();
                    break;

                case 'C':
                    int fe;
                    System.out.print("Fé: ");
                    fe = in.nextInt();
                    System.out.println("Criando clérigo...");
                    System.out.println();
                    Clerigo clerigo = new Clerigo(Classe.CLERIGO, nome, vida, ataque, defesa, fe, luz);
                    personagens.add(clerigo);
                    clerigo.imprimirEstado();
                    break;

                case 'D':

                    System.out.print("Fé: ");
                    fe = in.nextInt();
                    System.out.println("Criando druida...");
                    System.out.println();
                    Druida druida = new Druida(Classe.DRUIDA, nome, vida, ataque, defesa, fe, raio);
                    personagens.add(druida);
                    System.out.println();

                    break;

                case 'F':
                    int mana;
                    System.out.print("Mana: ");
                    mana = in.nextInt();
                    System.out.println("Criando feiticeiro...");
                    System.out.println();
                    Feiticeiro feiticeiro = new Feiticeiro(Classe.FEITICEIRO, nome, vida, ataque, defesa, mana, gelo);
                    personagens.add(feiticeiro);
                    feiticeiro.imprimirEstado();
                    break;

                case 'G':
                    System.out.println("Criando guerreiro...");
                    System.out.println();
                    Guerreiro guerreiro = new Guerreiro(Classe.GUERREIRO, nome, vida, ataque, defesa, espada);
                    personagens.add(guerreiro);
                    guerreiro.imprimirEstado();
                    break;

                case 'M':
                    System.out.print("Mana: ");
                    mana = in.nextInt();
                    System.out.println("Criando mago...");
                    System.out.println();
                    Mago mago = new Mago(Classe.MAGO, nome, vida, ataque, defesa, mana, fogo);
                    personagens.add(mago);
                    mago.imprimirEstado();
                    break;

                default:
                    System.out.println("Esta não é uma classe válida.");
            }

        }

    }
}
