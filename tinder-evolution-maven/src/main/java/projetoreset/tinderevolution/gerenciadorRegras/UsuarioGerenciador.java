package projetoreset.tinderevolution.gerenciadorRegras;


import projetoreset.tinderevolution.acervo.AcervoUsuario;
import projetoreset.tinderevolution.dominio.*;

import java.util.List;

public class UsuarioGerenciador {

    private AcervoUsuario acervo = new AcervoUsuario();


    public Usuario salvar(Usuario usuario) {
        List<Usuario> usuarios = acervo.listar();
        for (Usuario usuarioExistente : usuarios) {
            if (usuario.getEmail().equals(usuarioExistente.getEmail())) {
                throw new RuntimeException("Usuário já existe.");
            }
        }
        if (usuario.calcularIdade(usuario.getDataNascimento()) <= 18) {
            throw new RuntimeException("O Tinder Evolution é apenas para maiores de 18 anos.");
        }
        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getDataNascimento() == null || usuario.getTelefone().isEmpty() || usuario.getBio().isEmpty() || usuario.getLatitude().isNaN() || usuario.getLongitude().isNaN()) {
            throw new RuntimeException("Preencha todos os campos corretamente.");
        } else {
            return acervo.salvar(usuario);
        }
    }

        public Usuario procurar(int id){
            if (id > 0) {
                return acervo.procurar(id);
            }
            return null;
        }

        public Usuario editar(int id, Usuario usuarioEditado){
            Usuario usuarioEditar = procurar(id);

            if (usuarioEditar == null) {
                return null;
            } else {
                return acervo.editar(usuarioEditar, usuarioEditado);
            }
        }

        public List<Usuario> listar() {
            return acervo.listar();
        }

        public boolean deletar(int id){
            if (id > 0) {
                return acervo.deletar(id);
            }
            return false;
        }


        public List<Musica> musicasCurtidas(int id){
            Usuario usuario = procurar(id);
            return acervo.musicasCurtidas(usuario);
        }

        public List<Filme> filmesCurtidos(int id){
            Usuario usuario = procurar(id);
            return acervo.filmesCurtidos(usuario);
        }

        public List<Serie> seriesCurtidas(int id){
            Usuario usuario = procurar(id);
            return acervo.seriesCurtidas(usuario);
        }

        public List<Esporte> esportesCurtidos(int id){
            Usuario usuario = procurar(id);
            return acervo.esportesCurtidos(usuario);
        }

        public List<Jogo> jogosCurtidos(int id){
            Usuario usuario = procurar(id);
            return acervo.jogosCurtidos(usuario);
        }

        public List<Curiosidade> curiosidades(int id){
            Usuario usuario = procurar(id);
            return acervo.curiosidades(usuario);
    }

    public void likeMusica(int idMusica, int idUsuario){
        UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();
        if (usuarioGerenciador.procurar(idMusica) != null){
            Usuario usuario = this.procurar(idUsuario);

        }


}
