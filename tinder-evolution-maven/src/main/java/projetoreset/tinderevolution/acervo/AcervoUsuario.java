package projetoreset.tinderevolution.acervo;


import projetoreset.tinderevolution.dominio.Usuario;

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
        return null;
    }

    public boolean deletar(int id){
        Usuario usuarioApagar = procurar(id);
        if (usuarioApagar != null){
            return usuarios.remove(usuarioApagar);
        }
        return false;
    }


    public Usuario editar(final Usuario usuarioEditar, final Usuario usuarioEditado){
        usuarioEditar.setDataDeNascimento (usuarioEditado.getDataDeNascimento());
        usuarioEditar.setEmail(usuarioEditado.getEmail());
        usuarioEditar.setBio(usuarioEditado.getBio());
        usuarioEditar.setNome(usuarioEditado.getNome());
        usuarioEditar.setTelefone(usuarioEditado.getTelefone());
        usuarioEditar.setLatitude(usuarioEditado.getLatitude());
        usuarioEditar.setLongitude(usuarioEditado.getLongitude());

        return usuarioEditar;
    }
}
