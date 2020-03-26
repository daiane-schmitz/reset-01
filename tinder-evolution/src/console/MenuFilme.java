package console;

import dominio.CategoriaFilmeJogo;
import dominio.Filme;
import dominio.Musica;
import gerenciadorRegras.FilmeGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuFilme {

    private FilmeGerenciador gerenciador;

    public MenuFilme(){
        this.gerenciador = new FilmeGerenciador();
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

    public Filme adicionar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicionar um filme: ");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();


        System.out.println("Categoria do filme: ");
        System.out.println("| A | - Ação");
        System.out.println("| C | - Comédia");
        System.out.println("| D | - Drama");
        System.out.println("| M | - Musical");
        System.out.println("| S | - Suspense");
        System.out.println("| T | - Terror");
        char categoria = scanner.next().charAt(0);

        CategoriaFilmeJogo categoriaFilme;
        switch (categoria){
            case 'A':
                categoriaFilme = CategoriaFilmeJogo.ACAO;
                break;
            case 'C':
                categoriaFilme = CategoriaFilmeJogo.COMEDIA;
                break;
            case 'D':
                categoriaFilme = CategoriaFilmeJogo.DRAMA;
                break;
            case 'M':
                categoriaFilme = CategoriaFilmeJogo.MUSICAL;
                break;
            case 'S':
                categoriaFilme = CategoriaFilmeJogo.SUSPENSE;
                break;
            case 'T':
                categoriaFilme = CategoriaFilmeJogo.TERROR;
                break;
            default:
                categoriaFilme = CategoriaFilmeJogo.COMEDIA;
                break;
        }


        Filme filme = new Filme(nome, diretor, LocalDate.of(ano, mes, dia), categoriaFilme, sinopse);
        return gerenciador.salvar(filme);
    }

    public Filme editar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar um filme: ");
        System.out.println("Selecione o filme que você deseja editar: ");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println(" | " + filme.getId() + " | - " + filme.getNome());
        }
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Categoria do Filme: ");
        System.out.println("| A | - Ação");
        System.out.println("| C | - Comédia");
        System.out.println("| D | - Drama");
        System.out.println("| M | - Musical");
        System.out.println("| S | - Suspense");
        System.out.println("| T | - Terror");
        char categoria = scanner.next().charAt(0);

        CategoriaFilmeJogo categoriaFilme;
        switch (categoria){
            case 'A':
                categoriaFilme = CategoriaFilmeJogo.ACAO;
                break;
            case 'C':
                categoriaFilme = CategoriaFilmeJogo.COMEDIA;
                break;
            case 'D':
                categoriaFilme = CategoriaFilmeJogo.DRAMA;
                break;
            case 'M':
                categoriaFilme = CategoriaFilmeJogo.MUSICAL;
                break;
            case 'S':
                categoriaFilme = CategoriaFilmeJogo.SUSPENSE;
                break;
            case 'T':
                categoriaFilme = CategoriaFilmeJogo.TERROR;
                break;
            default:
                categoriaFilme = CategoriaFilmeJogo.COMEDIA;
                break;
        }

        Filme filmeEditar = new Filme(nome, diretor, LocalDate.of(ano, mes, dia), categoriaFilme, sinopse);
        Filme filmeEditado = gerenciador.editar(id, filmeEditar);

        if (filmeEditado == null) {
            System.out.println("Filme inexistente.");
        } else {
            System.out.println(filmeEditado);
        }
        return  filmeEditado;
    }

    private void procurar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisar filme: ");
        System.out.println("Insira o código do filme desejado: ");
        int id = scanner.nextInt();

        Filme filme = gerenciador.procurar(id);

        if (filme == null) {
            System.out.println("Filme inexistente.");
        } else {
            System.out.println(filme);
        }
    }

    private void deletar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Excluir filme ");
        System.out.println("Selecione o filme que deseja deletar: ");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println(" | " + filme.getId() + " | - " + filme.getNome());
        }
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)){
            System.out.println("Filme apagado.");
        } else {
            System.out.println("Filme inexistente.");
        }
    }

    private List<Filme> listar(){
        System.out.println("Lista de filmes: ");
        List<Filme> filmes = gerenciador.listar();

        for (Filme filme : filmes) {
            System.out.println(filme);
        }
        return filmes;
    }


}
