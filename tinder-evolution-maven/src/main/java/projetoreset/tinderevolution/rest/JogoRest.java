package projetoreset.tinderevolution.rest;

import org.springframework.web.bind.annotation.*;
import projetoreset.tinderevolution.dominio.Jogo;
import projetoreset.tinderevolution.gerenciadorRegras.JogoGerenciador;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogos")

public class JogoRest {

    private List<Jogo> listaJogos = new ArrayList<>();

    private static int contador = 1;

    JogoGerenciador jogoGerenciador = new JogoGerenciador();

    @GetMapping
    public List<Jogo> all(){
        return listaJogos;
    }

    @GetMapping("/{id}")
    public Jogo one(@PathVariable("id") int id){
        for (Jogo jogo : listaJogos) {
            if(jogo.getId() == id){
                return jogo;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        Jogo jogoDeletar = one(id);
        if(jogoDeletar != null){
            listaJogos.remove(jogoDeletar);
        }
    }

    @PostMapping
    public Jogo adicionar(@RequestBody Jogo requestBody){
        requestBody.setId(contador);
        contador++;
        listaJogos.add(requestBody);
        return requestBody;
    }

    @PutMapping("/{id}")
    public Jogo update(@PathVariable("id") int id, @RequestBody Jogo requestBody){
        Jogo jogoEditar = one(id);
        if(jogoEditar != null){
            jogoEditar.setNome(requestBody.getNome());
            jogoEditar.setCategoria(requestBody.getCategoria());
            jogoEditar.setLancamento(requestBody.getLancamento());
            jogoEditar.setPublisher(requestBody.getPublisher());
            jogoEditar.setPlataforma(requestBody.getPlataforma());
            return jogoEditar;
        }
        return null;
    }

}
