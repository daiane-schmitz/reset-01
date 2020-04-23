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

    private List<Curiosidade> listaCuriosidades = new ArrayList<>();

    private static int contador = 1;

    CuriosidadeGerenciador curiosidadeGerenciador = new CuriosidadeGerenciador();

    @GetMapping
    public List<Curiosidade> all(){
        return listaCuriosidades;
    }

    @GetMapping("/{id}")
    public Curiosidade one(@PathVariable("id") int id){
        for (Curiosidade curiosidade : listaCuriosidades) {
            if(curiosidade.getId() == id){
                return curiosidade;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        Curiosidade curiosidadeDeletar = one(id);
            if(curiosidadeDeletar != null){
                listaCuriosidades.remove(curiosidadeDeletar);
            }
    }

    @PostMapping
    public Curiosidade adicionar(@RequestBody Curiosidade requestBody){
        requestBody.setId(contador);
        contador++;
        listaCuriosidades.add(requestBody);
        return requestBody;
    }

    @PutMapping("/{id}")
    public Curiosidade update(@PathVariable("id") int id, @RequestBody Curiosidade requestBody){
        Curiosidade curiosidadeEditar = one(id);
        if(curiosidadeEditar != null){
            curiosidadeEditar.setCategoria(requestBody.getCategoria());
            curiosidadeEditar.setDescricao(requestBody.getDescricao());
            return curiosidadeEditar;
        }
        return null;
    }

}
