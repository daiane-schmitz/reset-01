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

    private static int contador = 1;

    MusicaGerenciador musicaGerenciador = new MusicaGerenciador();

    @GetMapping
    public List<Musica> all(){
        return listaMusicas;
    }

    @GetMapping("/{id}")
    public Musica one(@PathVariable("id") int id){
        for (Musica musica : listaMusicas) {
            if(musica.getId() == id){
                return musica;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        Musica musicaDeletar = one(id);
        if(musicaDeletar != null){
            listaMusicas.remove(musicaDeletar);
        }
    }

    @PostMapping
    public Musica adicionar(@RequestBody Musica requestBody){
        requestBody.setId(contador);
        contador++;
        musicaGerenciador.salvar(requestBody);
        return requestBody;
    }

    @PutMapping("/{id}")
    public Musica update(@PathVariable("id") int id, @RequestBody Musica requestBody){
        Musica musicaEditar = one(id);
        if(musicaEditar != null){
            musicaEditar.setNome(requestBody.getNome());
            musicaEditar.setArtista(requestBody.getArtista());
            musicaEditar.setLancamento(requestBody.getLancamento());
            musicaEditar.setEstiloMusical(requestBody.getEstiloMusical());
            return musicaEditar;
        }
        return null;
    }

}
