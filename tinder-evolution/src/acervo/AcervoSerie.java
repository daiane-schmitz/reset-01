package acervo;
import dominio.Serie;

import java.util.ArrayList;
import java.util.List;

public class AcervoSerie {

    private static int indice = 1;

    private static final List<Serie> series = new ArrayList<>();

    public Serie salvar(Serie serie){
        serie.setId(indice++);
        series.add(serie);
        return serie;
    }

    public List<Serie> listar(){
        return series;
    }

    public Serie procurar(int id){
        for (Serie serie : series){
            if (serie.getId() == id){
                return serie;
            }
        }
        return null;
    }

    public boolean deletar(int id){
        Serie serieApagar = procurar(id);
        if (serieApagar != null){
            return series.remove(serieApagar);
        }
        return false;
    }


    public Serie editar(final Serie serieEditar, final Serie serieEditado){
        serieEditar.setCategoria (serieEditado.getCategoria());
        serieEditar.setDataDeLancamento(serieEditado.getDataDeLancamento());
        serieEditar.setDiretor(serieEditado.getDiretor());
        serieEditar.setNome(serieEditado.getNome());
        serieEditar.setSinopse(serieEditado.getSinopse());
        serieEditar.setNumeroTemporadas(serieEditado.getNumeroTemporadas());
        serieEditar.setNumeroEpisodios(serieEditado.getNumeroEpisodios());

        return serieEditar;
    }


}
