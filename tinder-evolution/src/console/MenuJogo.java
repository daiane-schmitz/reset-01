package console;

import dominio.CategoriaFilmeJogo;
import dominio.Jogo;
import dominio.Plataforma;
import gerenciadorRegras.JogoGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuJogo {

    private JogoGerenciador gerenciador;

    public MenuJogo(){
        this.gerenciador = new JogoGerenciador();
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

    public Jogo adicionar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicionar um jogo: ");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Plataforma do jogo: ");
        System.out.println("| C | - PC");
        System.out.println("| P | - PS4");
        System.out.println("| S | - SNES");
        System.out.println("| X | - XBOX");
        char plataforma = scanner.next().charAt(0);

        Plataforma plataformaJogo;
        switch (plataforma){
            case 'C':
                plataformaJogo = Plataforma.PC;
                break;
            case 'P':
                plataformaJogo = Plataforma.PS4;
                break;
            case 'S':
                plataformaJogo = Plataforma.SNES;
                break;
            case 'X':
                plataformaJogo = Plataforma.XBOX;
                break;
            default:
                plataformaJogo = Plataforma.PC;
                break;
        }

        System.out.println("Categoria do jogo: ");
        System.out.println("| A | - Ação");
        System.out.println("| C | - Comédia");
        System.out.println("| D | - Drama");
        System.out.println("| M | - Musical");
        System.out.println("| S | - Suspense");
        System.out.println("| T | - Terror");
        char categoria = scanner.next().charAt(0);

        CategoriaFilmeJogo categoriaJogo;
        switch (categoria){
            case 'A':
                categoriaJogo = CategoriaFilmeJogo.ACAO;
                break;
            case 'C':
                categoriaJogo = CategoriaFilmeJogo.COMEDIA;
                break;
            case 'D':
                categoriaJogo = CategoriaFilmeJogo.DRAMA;
                break;
            case 'M':
                categoriaJogo = CategoriaFilmeJogo.MUSICAL;
                break;
            case 'S':
                categoriaJogo = CategoriaFilmeJogo.SUSPENSE;
                break;
            case 'T':
                categoriaJogo = CategoriaFilmeJogo.TERROR;
                break;
            default:
                categoriaJogo = CategoriaFilmeJogo.ACAO;
                break;
        }


        Jogo jogo = new Jogo(nome, publisher, LocalDate.of(ano, mes, dia), categoriaJogo, plataformaJogo);
        return gerenciador.salvar(jogo);
    }

    public Jogo editar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar um filme: ");
        System.out.println("Selecione o filme que você deseja editar: ");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println(" | " + jogo.getId() + " | - " + jogo.getNome());
        }
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Plataforma do jogo: ");
        System.out.println("| C | - PC");
        System.out.println("| P | - PS4");
        System.out.println("| S | - SNES");
        System.out.println("| X | - XBOX");
        char plataforma = scanner.next().charAt(0);

        Plataforma plataformaJogo;
        switch (plataforma){
            case 'C':
                plataformaJogo = Plataforma.PC;
                break;
            case 'P':
                plataformaJogo = Plataforma.PS4;
                break;
            case 'S':
                plataformaJogo = Plataforma.SNES;
                break;
            case 'X':
                plataformaJogo = Plataforma.XBOX;
                break;
            default:
                plataformaJogo = Plataforma.PC;
                break;
        }

        System.out.println("Categoria do jogo: ");
        System.out.println("| A | - Ação");
        System.out.println("| C | - Comédia");
        System.out.println("| D | - Drama");
        System.out.println("| M | - Musical");
        System.out.println("| S | - Suspense");
        System.out.println("| T | - Terror");
        char categoria = scanner.next().charAt(0);

        CategoriaFilmeJogo categoriaJogo;
        switch (categoria){
            case 'A':
                categoriaJogo = CategoriaFilmeJogo.ACAO;
                break;
            case 'C':
                categoriaJogo = CategoriaFilmeJogo.COMEDIA;
                break;
            case 'D':
                categoriaJogo = CategoriaFilmeJogo.DRAMA;
                break;
            case 'M':
                categoriaJogo = CategoriaFilmeJogo.MUSICAL;
                break;
            case 'S':
                categoriaJogo = CategoriaFilmeJogo.SUSPENSE;
                break;
            case 'T':
                categoriaJogo = CategoriaFilmeJogo.TERROR;
                break;
            default:
                categoriaJogo = CategoriaFilmeJogo.ACAO;
                break;
        }

        Jogo jogoEditar = new Jogo(nome, publisher, LocalDate.of(ano, mes, dia), categoriaJogo, plataformaJogo);
        Jogo jogoEditado = gerenciador.editar(id, jogoEditar);

        if (jogoEditado == null) {
            System.out.println("Jogo inexistente.");
        } else {
            System.out.println(jogoEditado);
        }
        return  jogoEditado;
    }

    private void procurar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisar jogo: ");
        System.out.println("Insira o código do jogo desejado: ");
        int id = scanner.nextInt();

        Jogo jogo = gerenciador.procurar(id);

        if (jogo == null) {
            System.out.println("Jogo inexistente.");
        } else {
            System.out.println(jogo);
        }
    }

    private void deletar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Excluir filme ");
        System.out.println("Selecione o filme que deseja deletar: ");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println(" | " + jogo.getId() + " | - " + jogo.getNome());
        }
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)){
            System.out.println("Jogo apagado.");
        } else {
            System.out.println("Jogo inexistente.");
        }
    }

    private List<Jogo> listar(){
        System.out.println("Lista de jogos: ");
        List<Jogo> jogos = gerenciador.listar();

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }
        return jogos;
    }

}
