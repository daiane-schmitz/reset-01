package projetoreset.tinderevolution.rest;

import org.springframework.web.bind.annotation.*;
import projetoreset.tinderevolution.dominio.Serie;
import projetoreset.tinderevolution.gerenciadorRegras.SerieGerenciador;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/series")

public class SerieRest {


    SerieGerenciador serieGerenciador = new SerieGerenciador();

    @GetMapping
    public List<Serie> listar(){
        return serieGerenciador.listar();
    }

    @GetMapping("/{id}")
    public Serie procurar(@PathVariable("id") int id){
        return serieGerenciador.procurar(id);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable("id") int id){
        serieGerenciador.deletar(id);
        return "Série deletada com sucesso.";
    }

    @PostMapping
    public Serie salvar(@RequestBody Serie requestBody){
        return serieGerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Serie editar(@PathVariable("id") int id, @RequestBody Serie requestBody){
        return serieGerenciador.editar(id, requestBody);
    }


}
