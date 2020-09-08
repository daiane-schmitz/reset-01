package projetoreset.tinderevolution.rest;

import org.springframework.web.bind.annotation.*;
import projetoreset.tinderevolution.dominio.*;
import projetoreset.tinderevolution.gerenciadorRegras.UsuarioGerenciador;

import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UsuarioRest {

    UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();

    @GetMapping
    public List<Usuario> listar(){
        return usuarioGerenciador.listar();
    }

    @GetMapping("/{id}")
    public Usuario procurar(@PathVariable("id") int id){
        return usuarioGerenciador.procurar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") int id){
       usuarioGerenciador.deletar(id);
    }

    @PostMapping
    public Usuario adicionar(@RequestBody Usuario usuario){
        return usuarioGerenciador.salvar(usuario);
    }

    @PutMapping("/{id}")
    public Usuario editar(@PathVariable("id") int id, @RequestBody Usuario usuario){
        return usuarioGerenciador.editar(id, usuario);
    }

    @GetMapping("{id}/musicas")
    public List<Musica> musicas(@PathVariable("id") int id) {
        return usuarioGerenciador.musicasCurtidas(id);
    }

    @GetMapping("{id}/filmes")
    public List<Filme> filmes(@PathVariable("id") int id) {
        return usuarioGerenciador.filmesCurtidos(id);
    }

    @GetMapping("{id}/series")
    public List<Serie> series(@PathVariable("id") int id) {
        return usuarioGerenciador.seriesCurtidas(id);
    }

    @GetMapping("{id}/esportes")
    public List<Esporte> esportes(@PathVariable("id") int id) {
        return usuarioGerenciador.esportesCurtidos(id);
    }

    @GetMapping("{id}/jogos")
    public List<Jogo> jogos(@PathVariable("id") int id) {
        return usuarioGerenciador.jogosCurtidos(id);
    }

    @GetMapping("{id}/curiosidades")
    public List<Curiosidade> curiosidades(@PathVariable("id") int id) {
        return usuarioGerenciador.curiosidades(id);
    }


}