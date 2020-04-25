package projetoreset.tinderevolution.gerenciadorRegras;

import projetoreset.tinderevolution.dominio.Musica;
import projetoreset.tinderevolution.dominio.Usuario;

public class LikeGerenciador {

    private UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();
    private MusicaGerenciador musicaGerenciador = new MusicaGerenciador();
    private FilmeGerenciador filmeGerenciador = new FilmeGerenciador();
    private JogoGerenciador jogoGerenciador = new JogoGerenciador();
    private EsporteGerenciador esporteGerenciador = new EsporteGerenciador();
    private CuriosidadeGerenciador curiosidadeGerenciador = new CuriosidadeGerenciador();
    private LikeGerenciador likeGerenciador = new LikeGerenciador();

    public void likeMusica(int idUsuario, int idMusica){
        Usuario usuario = usuarioGerenciador.procurar(idUsuario);
        Musica musica = musicaGerenciador.procurar(idMusica);
        musica.adicionarUsuario(usuario);
        likeGerenciador.likeMusica(idUsuario, idMusica);
    }

    public void dislikeMusica(int idUsuario, int idMusica){
        Usuario usuario = usuarioGerenciador.procurar(idUsuario);
        Musica musica = musicaGerenciador.procurar(idMusica);
        musica.removerUsuario(usuario);
        likeGerenciador.dislikeMusica(idUsuario, idMusica);
    }
}
