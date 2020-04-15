package projetoreset.tinderevolution.gerenciadorRegras;


import projetoreset.tinderevolution.acervo.AcervoUsuario;
import projetoreset.tinderevolution.dominio.Usuario;

import java.util.List;

public class UsuarioGerenciador {

    private AcervoUsuario acervo = new AcervoUsuario();


    public Usuario salvar(Usuario usuario) {
        List<Usuario> usuarios = acervo.listar();
        for (Usuario usuarioExistente : usuarios) {
            if (usuario.getEmail().equals(usuarioExistente.getEmail())) {
                return usuarioExistente;
            }
        }
        if (usuario.calcularIdade(usuario.getDataDeNascimento()) >= 18) {
            return acervo.salvar(usuario);
        } else {
            System.out.println("O aplicativo Tinder Evolution é apenas para maiores de 18 anos.");
        }
        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getDataDeNascimento() == null || usuario.getTelefone().isEmpty() || usuario.getBio().isEmpty() || usuario.getLatitude().isNaN() || usuario.getLongitude().isNaN()) {
            System.out.println("Todos os campos devem ser preenchidos corretamente.");
        }
        return null;
    }

        public Usuario procurar(int id){
            if (id > 0) {
                return acervo.procurar(id);
            }
            return null;
        }

        public Usuario editar (int id, Usuario usuarioEditado){
            Usuario usuarioEditar = procurar(id);

            if (usuarioEditar == null) {
                return null;
            } else {
                return acervo.editar(usuarioEditar, usuarioEditado);
            }
        }

        public List<Usuario> listar () {
            return acervo.listar();
        }

        public boolean deletar (int id){
            if (id > 0) {
                return acervo.deletar(id);
            }
            return false;
        }

    }
