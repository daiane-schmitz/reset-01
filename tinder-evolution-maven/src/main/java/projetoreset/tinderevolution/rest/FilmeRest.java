package projetoreset.tinderevolution.rest;

import org.springframework.web.bind.annotation.*;
import projetoreset.tinderevolution.dominio.Filme;
import projetoreset.tinderevolution.gerenciadorRegras.FilmeGerenciador;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filmes")

public class FilmeRest {

    private List<Filme> listaFilmes = new ArrayList<>();

    private static int contador = 1;

    FilmeGerenciador filmeGerenciador = new FilmeGerenciador();

    @GetMapping
    public List<Filme> all(){
        return listaFilmes;
    }

    @GetMapping("/{id}")
    public Filme one(@PathVariable("id") int id){
        for (Filme filme : listaFilmes) {
            if(filme.getId() == id){
                return filme;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        Filme filmeDeletar = one(id);
        if(filmeDeletar != null){
            listaFilmes.remove(filmeDeletar);
        }
    }

    @PostMapping
    public Filme adicionar(@RequestBody Filme requestBody){
        requestBody.setId(contador);
        contador++;
        filmeGerenciador.salvar(requestBody);
        return requestBody;
    }

    @PutMapping("/{id}")
    public Filme update(@PathVariable("id") int id, @RequestBody Filme requestBody){
        Filme filmeEditar = one(id);
        if(filmeEditar != null){
            filmeEditar.setNome(requestBody.getNome());
            filmeEditar.setCategoria(requestBody.getCategoria());
            filmeEditar.setDataDeLancamento(requestBody.getDataDeLancamento());
            filmeEditar.setDiretor(requestBody.getDiretor());
            filmeEditar.setSinopse(requestBody.getSinopse());
            return filmeEditar;
        }
        return null;
    }

}
