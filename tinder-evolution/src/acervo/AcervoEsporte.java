package acervo;

import dominio.Esporte;

import java.util.ArrayList;
import java.util.List;

public class AcervoEsporte {

        private static int indice = 1;

        private static final List<Esporte> esportes = new ArrayList<>();

        public Esporte salvar(Esporte esporte){
            esporte.setId(indice++);
            esportes.add(esporte);
            return esporte;
        }

        public List<Esporte> listar(){
            return esportes;
        }

        public Esporte procurar(int id){
            for (Esporte esporte : esportes){
                if (esporte.getId() == id){
                    return esporte;
                }
            }
            return null;
        }

        public boolean deletar(int id){
            Esporte esporteApagar = procurar(id);
            if(esporteApagar != null){
                return esportes.remove(esporteApagar);
            }
            return false;
        }


        public Esporte editar(final Esporte esporteEditar, final Esporte esporteEditado){
            esporteEditar.setNome(esporteEditado.getNome());

            return esporteEditar;
        }

}
