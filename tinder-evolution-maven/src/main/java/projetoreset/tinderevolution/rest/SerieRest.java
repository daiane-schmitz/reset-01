package projetoreset.tinderevolution.rest;

import org.springframework.web.bind.annotation.*;
import projetoreset.tinderevolution.dominio.Serie;
import projetoreset.tinderevolution.gerenciadorRegras.SerieGerenciador;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/series")

public class SerieRest {

    private List<Serie> listaSeries = new ArrayList<>();

    private static int contador = 1;

    SerieGerenciador serieGerenciador = new SerieGerenciador();

    @GetMapping
    public List<Serie> all(){
        return listaSeries;
    }

    @GetMapping("/{id}")
    public Serie one(@PathVariable("id") int id){
        for (Serie serie : listaSeries) {
            if(serie.getId() == id){
                return serie;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        Serie serieDeletar = one(id);
        if(serieDeletar != null){
            listaSeries.remove(serieDeletar);
        }
    }

    @PostMapping
    public Serie adicionar(@RequestBody Serie requestBody){
        requestBody.setId(contador);
        contador++;
        serieGerenciador.salvar(requestBody);
        return requestBody;
    }

    @PutMapping("/{id}")
    public Serie update(@PathVariable("id") int id, @RequestBody Serie requestBody){
        Serie serieEditar = one(id);
        if(serieEditar != null){
            serieEditar.setNome(requestBody.getNome());
            serieEditar.setCategoria(requestBody.getCategoria());
            serieEditar.setDataDeLancamento(requestBody.getDataDeLancamento());
            serieEditar.setDiretor(requestBody.getDiretor());
            serieEditar.setNumeroEpisodios(requestBody.getNumeroEpisodios());
            serieEditar.setNumeroTemporadas(requestBody.getNumeroTemporadas());
            serieEditar.setSinopse(requestBody.getSinopse());
            return serieEditar;
        }
        return null;
    }

}
