package acervo;

import dominio.Curiosidade;

import java.util.ArrayList;
import java.util.List;

public class AcervoCuriosidade {

        private static int indice = 1;

        private static final List<Curiosidade> curiosidades = new ArrayList<>();

        public Curiosidade salvar(Curiosidade curiosidade){
            curiosidade.setId(indice++);
            curiosidades.add(curiosidade);
            return curiosidade;
        }

        public List<Curiosidade> listar(){
            return curiosidades;
        }

        public Curiosidade procurar(int id){
            for (Curiosidade curiosidade : curiosidades){
                if (curiosidade.getId() == id){
                    return curiosidade;
                }
            }
            return null;
        }

        public boolean deletar(int id){
            Curiosidade curiosidadeApagar = procurar(id);
            if (curiosidadeApagar != null){
                return curiosidades.remove(curiosidadeApagar);
            }
            return false;
        }


        public Curiosidade editar(final Curiosidade curiosidadeEditar, final Curiosidade curiosidadeEditada){
            curiosidadeEditar.setCategoria (curiosidadeEditada.getCategoria());
            curiosidadeEditar.setDescricao(curiosidadeEditada.getDescricao());

            return curiosidadeEditar;
        }

}
