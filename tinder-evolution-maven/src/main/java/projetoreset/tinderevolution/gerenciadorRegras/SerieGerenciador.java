package projetoreset.tinderevolution.gerenciadorRegras;


import projetoreset.tinderevolution.acervo.AcervoSerie;
import projetoreset.tinderevolution.dominio.Serie;

import java.time.LocalDate;
import java.util.List;

public class SerieGerenciador {

    private AcervoSerie acervo = new AcervoSerie();

    public Serie salvar(Serie serie) {
        List<Serie> series = acervo.listar();
        for (Serie serieExistente : series) {
            if (serie.getNome().equals(serieExistente.getNome())) {
                return serieExistente;
            }
        }
        if (serie.getNome().isEmpty() || serie.getDiretor().isEmpty() || serie.getSinopse().isEmpty() || serie.getCategoria() == null || serie.getDataDeLancamento() == null) {
            System.out.println("Todos os campos devem ser preenchidos corretamente.");
            return null;
        }

        if (serie.getNumeroTemporadas() < 1 && serie.getNumeroEpisodios() < serie.getNumeroTemporadas()) {
            System.out.println("O número de episódios ou temporadas é inválido.");
            return null;
        }
        if (serie.getDataDeLancamento().isAfter(LocalDate.now())) {
            return null;
        }
        return acervo.salvar(serie);
    }


    public Serie editar(int id, Serie serieEditada){
        Serie serieEditar = procurar(id);

        if (serieEditar == null){
            return null;
        } else {
            return acervo.editar(serieEditar, serieEditada);
        }
    }

    public Serie procurar(int id){
        if (id > 0){
            return acervo.procurar(id);
        }
        return null;
    }

    public List<Serie> listar(){
        return acervo.listar();
    }

    public boolean deletar(int id){
        if(id > 0){
            return acervo.deletar(id);
        }
        return false;
    }

}
