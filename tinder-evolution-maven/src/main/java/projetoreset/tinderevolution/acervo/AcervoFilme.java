package projetoreset.tinderevolution.acervo;


import projetoreset.tinderevolution.dominio.Filme;

import java.util.ArrayList;
import java.util.List;

public class AcervoFilme {

    private static int indice = 1;

    private static final List<Filme> filmes = new ArrayList<>();

    public Filme salvar(Filme filme){
        filme.setId(indice++);
        filmes.add(filme);
        return filme;
    }

    public List<Filme> listar(){
        return filmes;
    }

    public Filme procurar(int id){
        for (Filme filme : filmes){
            if (filme.getId() == id){
                return filme;
            }
        }
        return null;
    }

    public boolean deletar(int id){
        Filme filmeApagar = procurar(id);
        if (filmeApagar != null){
            return filmes.remove(filmeApagar);
        }
        return false;
    }


    public Filme editar(final Filme filmeEditar, final Filme filmeEditado){
        filmeEditar.setCategoria (filmeEditado.getCategoria());
        filmeEditar.setDataDeLancamento(filmeEditado.getDataDeLancamento());
        filmeEditar.setDiretor(filmeEditado.getDiretor());
        filmeEditar.setNome(filmeEditado.getNome());
        filmeEditar.setSinopse(filmeEditado.getSinopse());

        return filmeEditar;
    }


}
