package projetoreset.tinderevolution.gerenciadorRegras;


import projetoreset.tinderevolution.acervo.AcervoMusica;
import projetoreset.tinderevolution.dominio.Musica;

import java.time.LocalDate;
import java.util.List;

public class MusicaGerenciador {

    private AcervoMusica acervo = new AcervoMusica();

    public Musica salvar(Musica musica) {
        List<Musica> musicas = acervo.listar();
        for (Musica musicaExistente : musicas) {
            if (musica.getNome().equals(musicaExistente.getNome())) {
                return musicaExistente;
            }
        }
        if (musica.getNome().isEmpty() || musica.getArtista().isEmpty() || musica.getEstiloMusical() == null || musica.getLancamento() == null) {
            System.out.println("Todos os campos devem ser preenchidos corretamente.");
            return null;
        }
        if (musica.getLancamento().isAfter(LocalDate.now())) {
            return null;
        }
        return acervo.salvar(musica);
    }


    public Musica editar(int id, Musica musicaEditada){
        Musica musicaEditar = procurar(id);

        if (musicaEditar == null){
            return null;
        } else {
            return acervo.editar(musicaEditar, musicaEditada);
        }
    }

    public Musica procurar(int id){
        if (id > 0){
            return acervo.procurar(id);
        }
        return null;
    }

    public List<Musica> listar(){
    return acervo.listar();
    }

    public boolean deletar(int id){
        if(id > 0){
            return acervo.deletar(id);
        }
        return false;
    }

}
