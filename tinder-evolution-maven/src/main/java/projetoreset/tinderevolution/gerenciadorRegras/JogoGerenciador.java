package projetoreset.tinderevolution.gerenciadorRegras;

import projetoreset.tinderevolution.acervo.AcervoJogo;
import projetoreset.tinderevolution.dominio.Jogo;

import java.time.LocalDate;
import java.util.List;

public class JogoGerenciador {

    private AcervoJogo acervo = new AcervoJogo();

    public Jogo salvar(Jogo jogo) {
        List<Jogo> jogos = acervo.listar();
        for (Jogo jogoExistente : jogos) {
            if (jogo.getNome().equals(jogoExistente.getNome())) {
                return jogoExistente;
            }
        }
        if (jogo.getNome().isEmpty() || jogo.getCategoria() == null || jogo.getPlataforma() == null || jogo.getLancamento() == null) {
            System.out.println("Todos os campos devem ser preenchidos corretamente.");
            return null;
        }
        if (jogo.getLancamento().isAfter(LocalDate.now())) {
            return null;
        }
        return acervo.salvar(jogo);
    }


    public Jogo editar(int id, Jogo jogoEditado){
        Jogo jogoEditar = procurar(id);

        if (jogoEditar == null){
            return null;
        } else {
            return acervo.editar(jogoEditar, jogoEditado);
        }
    }

    public Jogo procurar(int id){
        if (id > 0){
            return acervo.procurar(id);
        }
        return null;
    }

    public List<Jogo> listar(){
        return acervo.listar();
    }

    public boolean deletar(int id){
        if(id > 0){
            return acervo.deletar(id);
        }
        return false;
    }
}
