package projetoreset.tinderevolution.console;

import projetoreset.tinderevolution.dominio.CategoriaCuriosidade;
import projetoreset.tinderevolution.dominio.Curiosidade;
import projetoreset.tinderevolution.dominio.Filme;
import projetoreset.tinderevolution.dominio.Usuario;
import projetoreset.tinderevolution.gerenciadorRegras.UsuarioGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuUsuario {

    private UsuarioGerenciador gerenciador;

    public MenuUsuario(){
        this.gerenciador = new UsuarioGerenciador();
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

    public Usuario adicionar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicionar um novo usuário: ");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Ano do Nascimento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês do Nascimento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia do Nascimento: ");
        int dia = scanner.nextInt();

        System.out.println("Bio: ");
        String bio = scanner.nextLine();

        System.out.println("Localização - Latitude: ");
        Double latitude = scanner.nextDouble();

        System.out.println("Localização - Longitude: ");
        Double longitude = scanner.nextDouble();

        Usuario usuario = new Usuario(nome, email, telefone, LocalDate.of(ano, mes, dia), bio, latitude, longitude);
        return gerenciador.salvar(usuario);
    }

    public Usuario editar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar um usuário: ");
        System.out.println("Selecione o usuário que você deseja editar: ");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println(" | " + usuario.getId() + " | - " + usuario.getNome());
        }
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Ano do Nascimento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês do Nascimento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia do Nascimento: ");
        int dia = scanner.nextInt();

        System.out.println("Bio: ");
        String bio = scanner.nextLine();

        System.out.println("Localização - Latitude: ");
        Double latitude = scanner.nextDouble();

        System.out.println("Localização - Longitude: ");
        Double longitude = scanner.nextDouble();


        Usuario usuarioEditar = new Usuario(nome, email, telefone, LocalDate.of(ano, mes, dia), bio, latitude, longitude);
        Usuario usuarioEditado = gerenciador.editar(id, usuarioEditar);

        if (usuarioEditado == null) {
            System.out.println("Curiosidade inexistente.");
        } else {
            System.out.println(usuarioEditado);
        }
        return usuarioEditado;
    }

    private void procurar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisar um usuário: ");
        System.out.println("Insira o código do usuário desejado: ");
        int id = scanner.nextInt();

        Usuario usuario = gerenciador.procurar(id);

        if (usuario == null) {
            System.out.println("Usuário inexistente.");
        } else {
            System.out.println(usuario);
        }
    }

    private void deletar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Excluir usuário ");
        System.out.println("Selecione o usuário que deseja deletar: ");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println(" | " + usuario.getId() + " | - " + usuario.getNome());
        }
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)){
            System.out.println("Usuário apagado.");
        } else {
            System.out.println("Usuário inexistente.");
        }
    }

    private List<Curiosidade> listar(){
        System.out.println("Lista de curiosidades: ");
        List<Usuario> usuarios = gerenciador.listar();

        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
        return null;
    }

}
