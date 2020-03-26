package console;

import dominio.CategoriaCuriosidade;
import dominio.CategoriaFilmeJogo;
import dominio.Curiosidade;
import dominio.Filme;
import gerenciadorRegras.CuriosidadeGerenciador;
import gerenciadorRegras.FilmeGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuCuriosidade {

    private CuriosidadeGerenciador gerenciador;

    public MenuCuriosidade(){
        this.gerenciador = new CuriosidadeGerenciador();
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

    public Curiosidade adicionar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicionar uma curiosidade: ");

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("Categoria da curiosidade: ");
        System.out.println("| A | Aparência");
        System.out.println("| C | Comportamento");
        System.out.println("| E | Evento");
        System.out.println("| L | Alimentação");
        char categoria = scanner.next().charAt(0);

        CategoriaCuriosidade categoriaCuriosidade;
        switch (categoria){
            case 'A':
                categoriaCuriosidade = CategoriaCuriosidade.APARENCIA;
                break;
            case 'C':
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
            case 'E':
                categoriaCuriosidade = CategoriaCuriosidade.EVENTO;
                break;
            case 'M':
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTACAO;
                break;
            default:
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
        }

        Curiosidade curiosidade = new Curiosidade(descricao, categoriaCuriosidade);
        return gerenciador.salvar(curiosidade);
    }

    public Curiosidade editar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar uma curiosidade: ");
        System.out.println("Selecione a curiosidade que você deseja editar: ");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println(" | " + curiosidade.getId() + " | - " + curiosidade.getDescricao());
        }
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("Categoria da curiosidade: ");
        System.out.println("| A | Aparência");
        System.out.println("| C | Comportamento");
        System.out.println("| E | Evento");
        System.out.println("| L | Alimentação");
        char categoria = scanner.next().charAt(0);

        CategoriaCuriosidade categoriaCuriosidade;
        switch (categoria){
            case 'A':
                categoriaCuriosidade = CategoriaCuriosidade.APARENCIA;
                break;
            case 'C':
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
            case 'E':
                categoriaCuriosidade = CategoriaCuriosidade.EVENTO;
                break;
            case 'M':
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTACAO;
                break;
            default:
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
        }

        Curiosidade curiosidadeEditar = new Curiosidade(descricao, categoriaCuriosidade);
        Curiosidade curiosidadeEditada = gerenciador.editar(id, curiosidadeEditar);

        if (curiosidadeEditada == null) {
            System.out.println("Curiosidade inexistente.");
        } else {
            System.out.println(curiosidadeEditada);
        }
        return curiosidadeEditada;
    }

    private void procurar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisar curiosidade: ");
        System.out.println("Insira o código da curiosidade desejada: ");
        int id = scanner.nextInt();

        Curiosidade curiosidade = gerenciador.procurar(id);

        if (curiosidade == null) {
            System.out.println("Curiosidade inexistente.");
        } else {
            System.out.println(curiosidade);
        }
    }

    private void deletar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Excluir curiosidade ");
        System.out.println("Selecione a curiosidade que deseja deletar: ");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println(" | " + curiosidade.getId() + " | - " + curiosidade.getDescricao());
        }
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)){
            System.out.println("Curiosidade apagada.");
        } else {
            System.out.println("Curiosidade inexistente.");
        }
    }

    private List<Curiosidade> listar(){
        System.out.println("Lista de curiosidades: ");
        List<Curiosidade> curiosidades = gerenciador.listar();

        for (Curiosidade curiosidade : curiosidades) {
            System.out.println(curiosidade);
        }
        return curiosidades;
    }


}
