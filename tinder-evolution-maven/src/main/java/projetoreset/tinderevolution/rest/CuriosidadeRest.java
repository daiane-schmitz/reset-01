package projetoreset.tinderevolution.rest;

import org.springframework.web.bind.annotation.*;
import projetoreset.tinderevolution.dominio.Curiosidade;
import projetoreset.tinderevolution.gerenciadorRegras.CuriosidadeGerenciador;
import projetoreset.tinderevolution.gerenciadorRegras.UsuarioGerenciador;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/curiosidades")

public class CuriosidadeRest {

    CuriosidadeGerenciador curiosidadeGerenciador = new CuriosidadeGerenciador();

    @GetMapping
    public List<Curiosidade> listar(){
        return curiosidadeGerenciador.listar();
    }

    @GetMapping("/{id}")
    public Curiosidade procurar(@PathVariable("id") int id){
        return curiosidadeGerenciador.procurar(id);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable("id") int id){
       curiosidadeGerenciador.deletar(id);
       return "Curiosidade deletada com sucesso.";
    }

    @PostMapping
    public Curiosidade salvar(@RequestBody Curiosidade requestBody){
        return curiosidadeGerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Curiosidade editar(@PathVariable("id") int id, @RequestBody Curiosidade requestBody){
        return curiosidadeGerenciador.editar(id, requestBody);
    }


}
