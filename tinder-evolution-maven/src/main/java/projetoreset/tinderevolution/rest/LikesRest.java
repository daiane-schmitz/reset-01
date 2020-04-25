package projetoreset.tinderevolution.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetoreset.tinderevolution.dominio.Jogo;
import projetoreset.tinderevolution.dominio.Usuario;
import projetoreset.tinderevolution.gerenciadorRegras.LikeGerenciador;
import projetoreset.tinderevolution.gerenciadorRegras.UsuarioGerenciador;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tinder/api/likes")

public class LikesRest {

    UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();

    @PostMapping("/musicas/{idMusica}/avaliador/{idUsuario}")
    private void likeMusica(@PathVariable("idMusica") int idMusica, @PathVariable("idUsuario") int idUsuario) {
        usuarioGerenciador.likeMusica(idMusica, idUsuario);
    }


}
