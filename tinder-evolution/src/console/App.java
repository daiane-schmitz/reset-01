package console;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        MenuMusica menuMusica = new MenuMusica();
        MenuFilme menuFilme = new MenuFilme();
        MenuSerie menuSerie = new MenuSerie();
        MenuJogo menuJogo = new MenuJogo();
        MenuEsporte menuEsporte = new MenuEsporte();
        MenuCuriosidade menuCuriosidade = new MenuCuriosidade();

        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X'){

            System.out.println("Selecione uma opção: ");
            System.out.println("| E | - Esportes");
            System.out.println("| C | - Curiosidades");
            System.out.println("| F | - Filmes");
            System.out.println("| J | - Jogos");
            System.out.println("| M | - Músicas");
            System.out.println("| S | - Séries");
            System.out.println("| X | - Encerrar");
            opcao = scanner.next().charAt(0);

            switch (opcao){
                case 'E':
                    menuEsporte.opcoes();
                    break;

                case 'C':
                    menuCuriosidade.opcoes();
                    break;

                case 'F':
                    menuFilme.opcoes();
                    break;

                case 'J':
                    menuJogo.opcoes();
                    break;

                case 'M':
                    menuMusica.opcoes();
                    break;

                case 'S':
                    menuSerie.opcoes();
                    break;

                case 'X':
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção não encontrada.");
            }
        }
    }
}