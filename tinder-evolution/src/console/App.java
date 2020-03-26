package console;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        MenuMusica menuMusica = new MenuMusica();
        MenuFilme menuFilme = new MenuFilme();
        MenuSerie menuSerie = new MenuSerie();

        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X'){

            System.out.println("Selecione uma opção: ");
            System.out.println("| F | - Filmes");
            System.out.println("| M | - Músicas");
            System.out.println("| S | - Séries");
            System.out.println("| X | - Encerrar");
            opcao = scanner.next().charAt(0);

            switch (opcao){
                case 'F':
                    menuFilme.opcoes();
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