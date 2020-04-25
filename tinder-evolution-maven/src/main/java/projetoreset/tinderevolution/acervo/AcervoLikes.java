package projetoreset.tinderevolution.acervo;

import projetoreset.tinderevolution.dominio.*;

public class AcervoLikes {

    public void likeMusica(Usuario usuario, Musica musica){
        usuario.likeMusica(musica);
    }

    public void dislikeMusica(Usuario usuario, Musica musica){
        usuario.dislikeMusica(musica);
    }

    public void likeFilme(Usuario usuario, Filme filme){
        usuario.likeFilme(filme);
    }

    public void dislikeFilme(Usuario usuario, Filme filme){
        usuario.dislikeFilme(filme);
    }

    public void likeSerie(Usuario usuario, Serie serie){
        usuario.likeSerie(serie);
    }

    public void dislikeSerie(Usuario usuario, Serie serie){
        usuario.dislikeSerie(serie);
    }

    public void likeJogo(Usuario usuario, Jogo jogo){
        usuario.likeJogo(jogo);
    }

    public void dislikeJogo(Usuario usuario, Jogo jogo){
        usuario.dislikeJogo(jogo);
    }

    public void likeEsporte(Usuario usuario, Esporte esporte){
        usuario.likeEsporte(esporte);
    }

    public void dislikeEsporte(Usuario usuario, Esporte esporte){
        usuario.dislikeEsporte(esporte);
    }

    public void adicionarCuriosidade(Usuario usuario, Curiosidade curiosidade){
        usuario.adicionarCuriosidade(curiosidade);
    }

    public void removerCuriosidade(Usuario usuario, Curiosidade curiosidade){
        usuario.removerCuriosidade(curiosidade);
    }

}
