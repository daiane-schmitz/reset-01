package projetoreset.tinderevolution.rest;

import org.springframework.web.bind.annotation.*;
import projetoreset.tinderevolution.dominio.Filme;
import projetoreset.tinderevolution.gerenciadorRegras.FilmeGerenciador;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filmes")

public class FilmeRest {


    FilmeGerenciador filmeGerenciador = new FilmeGerenciador();

    @GetMapping
    public List<Filme> listar(){
        return filmeGerenciador.listar();
    }

    @GetMapping("/{id}")
    public Filme procurar(@PathVariable("id") int id){
        return filmeGerenciador.procurar(id);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable("id") int id){
        filmeGerenciador.deletar(id);
        return "Filme deletado com sucesso.";
    }

    @PostMapping
    public Filme salvar(@RequestBody Filme requestBody){
        return filmeGerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Filme editar(@PathVariable("id") int id, @RequestBody Filme requestBody){
        return filmeGerenciador.editar(id, requestBody);
    }


}
