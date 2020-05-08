package projetoreset.tinderevolution.rest;

import org.springframework.web.bind.annotation.*;
import projetoreset.tinderevolution.dominio.Esporte;
import projetoreset.tinderevolution.gerenciadorRegras.EsporteGerenciador;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/esportes")

public class EsporteRest {


    EsporteGerenciador esporteGerenciador = new EsporteGerenciador();

    @GetMapping
    public List<Esporte> listar(){
        return esporteGerenciador.listar();
    }

    @GetMapping("/{id}")
    public Esporte procurar(@PathVariable("id") int id){
        return esporteGerenciador.procurar(id);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable("id") int id){
        esporteGerenciador.deletar(id);
        return "Esporte deletado com sucesso.";
    }

    @PostMapping
    public Esporte salvar(@RequestBody Esporte requestBody){
        return esporteGerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Esporte editar(@PathVariable("id") int id, @RequestBody Esporte requestBody){
        return esporteGerenciador.editar(id, requestBody);
    }

}
