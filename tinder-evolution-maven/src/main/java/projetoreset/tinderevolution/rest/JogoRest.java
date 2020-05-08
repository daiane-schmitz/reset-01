package projetoreset.tinderevolution.rest;

import org.springframework.web.bind.annotation.*;
import projetoreset.tinderevolution.dominio.Jogo;
import projetoreset.tinderevolution.gerenciadorRegras.JogoGerenciador;

import java.util.List;

@RestController
@RequestMapping("/jogos")

public class JogoRest {


    JogoGerenciador jogoGerenciador = new JogoGerenciador();

    @GetMapping
    public List<Jogo> listar(){
        return jogoGerenciador.listar();
    }

    @GetMapping("/{id}")
    public Jogo procurar(@PathVariable("id") int id){
        return jogoGerenciador.procurar(id);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable("id") int id){
        jogoGerenciador.deletar(id);
        return "Jogo deletado com sucesso.";
    }

    @PostMapping
    public Jogo salvar(@RequestBody Jogo requestBody){
        return jogoGerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Jogo editar(@PathVariable("id") int id, @RequestBody Jogo requestBody){
        return jogoGerenciador.editar(id, requestBody);
    }

}
