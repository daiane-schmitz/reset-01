package projetoreset.tinderevolution.acervo;

import projetoreset.tinderevolution.dominio.Musica;

import java.util.ArrayList;
import java.util.List;

public class AcervoMusica {

    private static int indice = 1;

    private static final List<Musica> musicas = new ArrayList<>();

    public Musica salvar(Musica musica){
        musica.setId(indice++);
        musicas.add(musica);
        return musica;
    }

    public List<Musica> listar(){
        return musicas;
    }

    public Musica procurar(int id){
        for (Musica musica : musicas){
            if (musica.getId() == id){
                return musica;
            }
        }
        return null;
    }

    public boolean deletar(int id){
        Musica musicaApagar = procurar(id);
        if (musicaApagar != null){
            return musicas.remove(musicaApagar);
        }
        return false;
    }


    public Musica editar(final Musica musicaEditar, final Musica musicaEditada){
        musicaEditar.setArtista(musicaEditada.getArtista());
        musicaEditar.setEstiloMusical(musicaEditada.getEstiloMusical());
        musicaEditar.setLancamento(musicaEditada.getLancamento());
        musicaEditar.setNome(musicaEditada.getNome());

        return musicaEditar;
    }

}
