package projetoreset.tinderevolution.acervo;


import projetoreset.tinderevolution.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class AcervoUsuario {

    private static int indice = 1;

    private static final List<Usuario> usuarios = new ArrayList<>();

    public Usuario salvar(Usuario usuario){
        usuario.setId(indice++);
        usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> listar(){
        return usuarios;
    }

    public Usuario procurar(int id){
        for (Usuario usuario : usuarios){
            if (usuario.getId() == id){
                return usuario;
            }
        }
        throw new RuntimeException("Usuário não encontrado.");
    }

    public boolean deletar(int id){
        Usuario usuarioApagar = procurar(id);
        if (usuarioApagar != null){
            return usuarios.remove(usuarioApagar);
        }
        return false;
    }

    public Usuario editar(Usuario usuarioEditar, Usuario usuarioEditado){
        usuarioEditar.setDataNascimento (usuarioEditado.getDataNascimento());
        usuarioEditar.setEmail(usuarioEditado.getEmail());
        usuarioEditar.setBio(usuarioEditado.getBio());
        usuarioEditar.setNome(usuarioEditado.getNome());
        usuarioEditar.setTelefone(usuarioEditado.getTelefone());
        usuarioEditar.setLatitude(usuarioEditado.getLatitude());
        usuarioEditar.setLongitude(usuarioEditado.getLongitude());
        usuarioEditar.setLinkFoto(usuarioEditado.getLinkFoto());

        return usuarioEditar;
    }

    public List<Musica> musicasCurtidas(Usuario usuario) {
        return usuario.getMusicasCurtidas();
    }

    public List<Filme> filmesCurtidos(Usuario usuario) {
        return usuario.getFilmesCurtidos();
    }

    public List<Serie> seriesCurtidas(Usuario usuario) {
        return usuario.getSeriesCurtidas();
    }

    public List<Esporte> esportesCurtidos(Usuario usuario) {
        return usuario.getEsportesCurtidos();
    }

    public List<Jogo> jogosCurtidos(Usuario usuario) {
        return usuario.getJogosCurtidos();
    }

    public List<Curiosidade> curiosidades(Usuario usuario) {
        return usuario.getCuriosidades();
    }

}
