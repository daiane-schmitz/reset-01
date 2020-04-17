package projetoreset.tinderevolution.gerenciadorRegras;


import projetoreset.tinderevolution.acervo.AcervoFilme;
import projetoreset.tinderevolution.dominio.Filme;

import java.time.LocalDate;
import java.util.List;

public class FilmeGerenciador {

    private AcervoFilme acervo = new AcervoFilme();

    public Filme salvar(Filme filme) {
        List<Filme> filmes = acervo.listar();
        for (Filme filmeExistente : filmes) {
            if (filme.getNome().equals(filmeExistente.getNome())) {
                return filmeExistente;
            }
        }
        if (filme.getNome().isEmpty() || filme.getDiretor().isEmpty() || filme.getSinopse().isEmpty() || filme.getCategoria() == null || filme.getDataDeLancamento() == null) {
            System.out.println("Todos os campos devem ser preenchidos corretamente.");
            return null;
        }
        if (filme.getDataDeLancamento().isAfter(LocalDate.now())) {
            return null;
        }
        return acervo.salvar(filme);
    }


    public Filme editar(int id, Filme filmeEditado){
        Filme filmeEditar = procurar(id);

        if (filmeEditar == null){
            return null;
        } else {
            return acervo.editar(filmeEditar, filmeEditado);
        }
    }

    public Filme procurar(int id){
        if (id > 0){
            return acervo.procurar(id);
        }
        return null;
    }

    public List<Filme> listar(){
        return acervo.listar();
    }

    public boolean deletar(int id){
        if(id > 0){
            return acervo.deletar(id);
        }
        return false;
    }

}
