package projetoreset.tinderevolution.rest;

import org.springframework.web.bind.annotation.*;
import projetoreset.tinderevolution.dominio.Musica;
import projetoreset.tinderevolution.gerenciadorRegras.MusicaGerenciador;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musicas")

public class MusicaRest {

    private List<Musica> listaMusicas = new ArrayList<>();

    private static int contador = +1;

    MusicaGerenciador musicaGerenciador = new MusicaGerenciador();

    @GetMapping
    public List<Musica> listar(){
        return musicaGerenciador.listar();
    }

    @GetMapping("/{id}")
    public Musica procurar(@PathVariable("id") int id){
        return musicaGerenciador.procurar(id);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable("id") int id){
        musicaGerenciador.deletar(id);
        return "Música deletada com sucesso.";
    }

    @PostMapping
    public Musica salvar(@RequestBody Musica requestBody){
       return musicaGerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Musica editar(@PathVariable("id") int id, @RequestBody Musica requestBody){
        return musicaGerenciador.editar(id, requestBody);
    }

}
