package gerenciadorRegras;

import acervo.AcervoEsporte;
import dominio.Esporte;

import java.util.List;

public class EsporteGerenciador {

    private AcervoEsporte acervo = new AcervoEsporte();

    public Esporte salvar(Esporte esporte) {
        List<Esporte> esportes = acervo.listar();
        for (Esporte esporteExistente : esportes) {
            if (esporte.getNome().equals(esporteExistente.getNome())) {
                return esporteExistente;
            }
        }
        return acervo.salvar(esporte);
    }


    public Esporte editar(int id, Esporte esporteEditado){
        Esporte esporteEditar = procurar(id);

        if (esporteEditar == null){
            return null;
        } else {
            return acervo.editar(esporteEditar, esporteEditado);
        }
    }

    public Esporte procurar(int id){
        if (id > 0){
            return acervo.procurar(id);
        }
        return null;
    }

    public List<Esporte> listar(){
        return acervo.listar();
    }

    public boolean deletar(int id){
        if(id > 0){
            return acervo.deletar(id);
        }
        return false;
    }

}
