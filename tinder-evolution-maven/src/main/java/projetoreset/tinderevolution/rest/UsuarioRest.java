package projetoreset.tinderevolution.rest;

import org.springframework.web.bind.annotation.*;
import projetoreset.tinderevolution.dominio.Usuario;
import projetoreset.tinderevolution.gerenciadorRegras.UsuarioGerenciador;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UsuarioRest {

    private List<Usuario> listaUsuarios = new ArrayList<>();

    private static int contador = 1;

    UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();

    @GetMapping
    public List<Usuario> all(){
        return listaUsuarios;
    }

    @GetMapping("/{id}")
    public Usuario one(@PathVariable("id") int id){
        for (Usuario usuario : listaUsuarios) {
            if(usuario.getId() == id){
                return usuario;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        Usuario usuarioDeletar = one(id);
        if(usuarioDeletar != null){
            listaUsuarios.remove(usuarioDeletar);
        }
    }

    @PostMapping
    public Usuario adicionar(@RequestBody Usuario requestBody){
        requestBody.setId(contador);
        contador++;
        listaUsuarios.add(requestBody);
        return requestBody;
    }

    @PutMapping("/{id}")
    public Usuario update(@PathVariable("id") int id, @RequestBody Usuario requestBody){
        Usuario usuarioEditar = one(id);
        if(usuarioEditar != null){
            usuarioEditar.setNome(requestBody.getNome());
            usuarioEditar.setEmail(requestBody.getEmail());
            usuarioEditar.setDataNascimento(requestBody.getDataNascimento());
            usuarioEditar.setTelefone(requestBody.getTelefone());
            usuarioEditar.setBio(requestBody.getBio());
            usuarioEditar.setLatitude(requestBody.getLatitude());
            usuarioEditar.setLongitude(requestBody.getLongitude());
            return usuarioEditar;
        }
        return null;
    }

}
