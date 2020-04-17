package projetoreset.tinderevolution.rest;

import org.springframework.web.bind.annotation.*;
import projetoreset.tinderevolution.dominio.Esporte;
import projetoreset.tinderevolution.gerenciadorRegras.EsporteGerenciador;

import java.util.ArrayList;
import java.util.List;

public class EsporteRest {

    private List<Esporte> listaEsportes = new ArrayList<>();

    private static int contador = 1;

    EsporteGerenciador esporteGerenciador = new EsporteGerenciador();

    @GetMapping
    public List<Esporte> all(){
        return listaEsportes;
    }

    @GetMapping("/{id}")
    public Esporte one(@PathVariable("id") int id){
        for (Esporte esporte : listaEsportes) {
            if(esporte.getId() == id){
                return esporte;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        Esporte esporteDeletar = one(id);
        if(esporteDeletar != null){
            listaEsportes.remove(esporteDeletar);
        }
    }

    @PostMapping
    public Esporte adicionar(@RequestBody Esporte requestBody){
        requestBody.setId(contador);
        contador++;
        esporteGerenciador.salvar(requestBody);
        return requestBody;
    }

    @PutMapping("/{id}")
    public Esporte update(@PathVariable("id") int id, @RequestBody Esporte requestBody){
        Esporte esporteEditar = one(id);
        if(esporteEditar != null){
            esporteEditar.setNome(requestBody.getNome());
            return esporteEditar;
        }
        return null;
    }

}
