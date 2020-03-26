package console;

import dominio.EstiloMusical;
import dominio.Musica;
import gerenciadorRegras.MusicaGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuMusica {

    private MusicaGerenciador gerenciador;

    public MenuMusica(){
        this.gerenciador = new MusicaGerenciador();
    }

    public void opcoes(){
        Scanner scanner = new Scanner(System.in);
    char opcao = ' ';

    while (opcao != 'X'){
        System.out.println("Selecione a opção desejada: ");
        System.out.println("| A | - Adicionar ");
        System.out.println("| E | - Editar ");
        System.out.println("| P | - Procurar ");
        System.out.println("| L | - Listar ");
        System.out.println("| D | - Deletar ");
        System.out.println("| X | - Retornar ");
        opcao = scanner.next().charAt(0);

    switch (opcao){
        case 'A':
            adicionar();
            break;
        case 'E':
            editar();
            break;
        case 'P':
            procurar();
            break;
        case 'L':
            listar();
            break;
        case 'D':
            deletar();
            break;
        case 'X':
            System.out.println("...");
            break;
        default:
            System.out.println("Opção inválida.");
        }
    }
    }

    public Musica adicionar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicionar uma música: ");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Artista: ");
        String artista = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo Musical: ");
        System.out.println("| F | - Funk");
        System.out.println("| I | - Indie");
        System.out.println("| M | - Metal");
        System.out.println("| P | - Pagode");
        System.out.println("| R | - Rock");
        System.out.println("| S | - Sertanejo");
        char estilo = scanner.next().charAt(0);

        EstiloMusical estiloMusical;
        switch (estilo){
            case 'F':
                estiloMusical = EstiloMusical.FUNK;
                break;
            case 'I':
                estiloMusical = EstiloMusical.INDIE;
                break;
            case 'M':
                estiloMusical = EstiloMusical.METAL;
                break;
            case 'P':
                estiloMusical = EstiloMusical.PAGODE;
                break;
            case 'R':
                estiloMusical = EstiloMusical.ROCK;
                break;
            case 'S':
                estiloMusical = EstiloMusical.SERTANEJO;
                break;
            default:
                estiloMusical = EstiloMusical.ROCK;
                break;
        }

        Musica musica = new Musica(nome, artista, estiloMusical, LocalDate.of(ano, mes, dia));
        return gerenciador.salvar(musica);

    }

    public Musica editar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar uma música: ");
        System.out.println("Selecione a música que você deseja editar: ");

        List<Musica> musicas = gerenciador.listar();
        for (Musica musica : musicas) {
            System.out.println(" | " + musica.getId() + " | - " + musica.getNome());
        }
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Artista: ");
        String artista = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo Musical: ");
        System.out.println("| F | - Funk");
        System.out.println("| I | - Indie");
        System.out.println("| M | - Metal");
        System.out.println("| P | - Pagode");
        System.out.println("| R | - Rock");
        System.out.println("| S | - Sertanejo");
        char estilo = scanner.next().charAt(0);

        EstiloMusical estiloMusical;
        switch (estilo){
            case 'F':
                estiloMusical = EstiloMusical.FUNK;
                break;
            case 'I':
                estiloMusical = EstiloMusical.INDIE;
                break;
            case 'M':
                estiloMusical = EstiloMusical.METAL;
                break;
            case 'P':
                estiloMusical = EstiloMusical.PAGODE;
                break;
            case 'R':
                estiloMusical = EstiloMusical.ROCK;
                break;
            case 'S':
                estiloMusical = EstiloMusical.SERTANEJO;
                break;
            default:
                estiloMusical = EstiloMusical.ROCK;
                break;
        }

        Musica musicaEditar = new Musica(nome, artista, estiloMusical, LocalDate.of(ano, mes, dia));
        Musica musicaEditada = gerenciador.editar(id, musicaEditar);

        if (musicaEditada == null) {
            System.out.println("Música inexistente.");
        } else {
            System.out.println(musicaEditada);
        }
        return musicaEditada;
    }

    private void procurar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisar música: ");
        System.out.println("Insira o código da música desejada: ");
        int id = scanner.nextInt();

        Musica musica = gerenciador.procurar(id);

        if (musica == null) {
            System.out.println("Música inexistente.");
        } else {
            System.out.println(musica);
        }
    }

    private void deletar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Excluir música ");
        System.out.println("Selecione a música que deseja deletar: ");

        List<Musica> musicas = gerenciador.listar();
        for (Musica musica : musicas) {
            System.out.println(" | " + musica.getId() + " | - " + musica.getNome());
        }
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)){
            System.out.println("Música apagada.");
        } else {
            System.out.println("Música inexistente.");
        }
    }

    private List<Musica> listar(){
        System.out.println("Lista de músicas: ");
        List<Musica> musicas = gerenciador.listar();

        for (Musica musica : musicas) {
            System.out.println(musica);
        }
        return musicas;
    }

}
