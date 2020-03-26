package console;

import dominio.Esporte;
import gerenciadorRegras.EsporteGerenciador;
import java.util.List;
import java.util.Scanner;

public class MenuEsporte {
    private EsporteGerenciador gerenciador;

    public MenuEsporte(){
        this.gerenciador = new EsporteGerenciador();
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

    public Esporte adicionar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicionar um esporte: ");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        Esporte esporte = new Esporte(nome);
        return gerenciador.salvar(esporte);
    }

    public Esporte editar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar um esporte: ");
        System.out.println("Selecione o esporte que você deseja editar: ");

        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println(" | " + esporte.getId() + " | - " + esporte.getNome());
        }
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();


        Esporte esporteEditar = new Esporte(nome);
        Esporte esporteEditado = gerenciador.editar(id, esporteEditar);

        if (esporteEditado == null) {
            System.out.println("Esporte inexistente.");
        } else {
            System.out.println(esporteEditado);
        }
        return  esporteEditado;
    }

    private void procurar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisar esporte: ");
        System.out.println("Insira o código do esporte desejado: ");
        int id = scanner.nextInt();

        Esporte esporte = gerenciador.procurar(id);

        if (esporte == null) {
            System.out.println("Esporte inexistente.");
        } else {
            System.out.println(esporte);
        }
    }

    private void deletar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Excluir esporte ");
        System.out.println("Selecione o esporte que deseja deletar: ");

        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println(" | " + esporte.getId() + " | - " + esporte.getNome());
        }
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)){
            System.out.println("Esporte apagado.");
        } else {
            System.out.println("Esporte inexistente.");
        }
    }

    private List<Esporte> listar(){
        System.out.println("Lista de esportes: ");
        List<Esporte> esportes = gerenciador.listar();

        for (Esporte esporte : esportes) {
            System.out.println(esporte);
        }
        return esportes;
    }

}
