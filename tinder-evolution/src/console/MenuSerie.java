package console;

import dominio.CategoriaFilmeJogo;
import dominio.CategoriaSerie;
import dominio.Filme;
import dominio.Serie;
import gerenciadorRegras.SerieGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuSerie {

    private SerieGerenciador gerenciador;

    public MenuSerie(){
        this.gerenciador = new SerieGerenciador();
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

    public Serie adicionar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicionar uma série: ");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.print("Número de temporadas: ");
        int temporadas = scanner.nextInt();

        System.out.print("Número de episódios: ");
        int episodios = scanner.nextInt();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Categoria da série: ");
        System.out.println("| A | Ação");
        System.out.println("| C | Comédia");
        System.out.println("| D | Drama");
        System.out.println("| M | Sitcom");
        System.out.println("| S | Suspense");
        System.out.println("| T | Terror");
        char categoria = scanner.next().charAt(0);

        CategoriaSerie categoriaSerie;
        switch (categoria){
            case 'A':
                categoriaSerie = CategoriaSerie.ACAO;
                break;
            case 'C':
                categoriaSerie = CategoriaSerie.COMEDIA;
                break;
            case 'D':
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
            case 'M':
                categoriaSerie = CategoriaSerie.SITCOM;
                break;
            case 'S':
                categoriaSerie = CategoriaSerie.SUSPENSE;
                break;
            case 'T':
                categoriaSerie = CategoriaSerie.TERROR;
                break;
            default:
                categoriaSerie = CategoriaSerie.COMEDIA;
                break;
        }


        Serie serie = new Serie(nome, diretor, LocalDate.of(ano, mes, dia), temporadas, episodios, categoriaSerie, sinopse);
        return gerenciador.salvar(serie);
    }

    public Serie editar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar uma série: ");
        System.out.println("Selecione a série que você deseja editar: ");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println(" | " + serie.getId() + " | - " + serie.getNome());
        }

        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.print("Número de temporadas: ");
        int temporadas = scanner.nextInt();

        System.out.print("Número de episódios: ");
        int episodios = scanner.nextInt();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Categoria da série: ");
        System.out.println("| A | Ação");
        System.out.println("| C | Comédia");
        System.out.println("| D | Drama");
        System.out.println("| M | Sitcom");
        System.out.println("| S | Suspense");
        System.out.println("| T | Terror");
        char categoria = scanner.next().charAt(0);

        CategoriaSerie categoriaSerie;
        switch (categoria){
            case 'A':
                categoriaSerie = CategoriaSerie.ACAO;
                break;
            case 'C':
                categoriaSerie = CategoriaSerie.COMEDIA;
                break;
            case 'D':
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
            case 'M':
                categoriaSerie = CategoriaSerie.SITCOM;
                break;
            case 'S':
                categoriaSerie = CategoriaSerie.SUSPENSE;
                break;
            case 'T':
                categoriaSerie = CategoriaSerie.TERROR;
                break;
            default:
                categoriaSerie = CategoriaSerie.COMEDIA;
                break;
        }

        Serie serieEditar = new Serie(nome, diretor, LocalDate.of(ano, mes, dia), temporadas, episodios, categoriaSerie, sinopse);
        Serie serieEditada = gerenciador.editar(id, serieEditar);

        if (serieEditada == null) {
            System.out.println("Série inexistente.");
        } else {
            System.out.println(serieEditada);
        }
        return  serieEditada;
    }

    private void procurar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisar série: ");
        System.out.println("Insira o código da série desejado: ");
        int id = scanner.nextInt();

        Serie serie = gerenciador.procurar(id);

        if (serie == null) {
            System.out.println("Série inexistente.");
        } else {
            System.out.println(serie);
        }
    }

    private void deletar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Excluir série");
        System.out.println("Selecione a série que deseja deletar: ");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println(" | " + serie.getId() + " | - " + serie.getNome());
        }
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)){
            System.out.println("Série apagada.");
        } else {
            System.out.println("Série inexistente.");
        }
    }

    private List<Serie> listar(){
        System.out.println("Lista de séries: ");
        List<Serie> series = gerenciador.listar();

        for (Serie serie : series) {
            System.out.println(serie);
        }
        return series;
    }
}
