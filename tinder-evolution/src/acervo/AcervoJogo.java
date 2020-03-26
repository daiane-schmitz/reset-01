package acervo;

import dominio.Filme;
import dominio.Jogo;

import java.util.ArrayList;
import java.util.List;

public class AcervoJogo {

    private static int indice = 1;

    private static final List<Jogo> jogos = new ArrayList<>();

    public Jogo salvar(Jogo jogo){
        jogo.setId(indice++);
        jogos.add(jogo);
        return jogo;
    }

    public List<Jogo> listar(){
        return jogos;
    }

    public Jogo procurar(int id){
        for (Jogo jogo : jogos){
            if (jogo.getId() == id){
                return jogo;
            }
        }
        return null;
    }

    public boolean deletar(int id){
        Jogo jogoApagar = procurar(id);
        if (jogoApagar != null){
            return jogos.remove(jogoApagar);
        }
        return false;
    }


    public Jogo editar(final Jogo jogoEditar, final Jogo jogoEditado){
        jogoEditar.setCategoria (jogoEditado.getCategoria());
        jogoEditar.setDataDeLancamento(jogoEditado.getDataDeLancamento());
        jogoEditar.setPublisher(jogoEditado.getPublisher());
        jogoEditar.setNome(jogoEditado.getNome());
        jogoEditar.setPlataforma(jogoEditado.getPlataforma());

        return jogoEditar;
    }
}
