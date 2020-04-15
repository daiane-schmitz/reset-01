package projetoreset.tinderevolution.gerenciadorRegras;


import projetoreset.tinderevolution.acervo.AcervoCuriosidade;
import projetoreset.tinderevolution.dominio.Curiosidade;

import java.util.List;

public class CuriosidadeGerenciador {

    private AcervoCuriosidade acervo = new AcervoCuriosidade();

    public Curiosidade salvar(Curiosidade curiosidade) {
        List<Curiosidade> curiosidades = acervo.listar();
        for (Curiosidade curiosidadeExistente : curiosidades) {
            if (curiosidade.getDescricao().equals(curiosidadeExistente.getDescricao())) {
                return curiosidadeExistente;
            }
        }
        if (curiosidade.getDescricao().isEmpty() || curiosidade.getCategoria() == null) {
            System.out.println("Todos os campos devem ser preenchidos corretamente.");
            return null;
        }
        return acervo.salvar(curiosidade);
    }


    public Curiosidade editar(int id, Curiosidade curiosidadeEditada){
        Curiosidade curiosidadeEditar = procurar(id);

        if (curiosidadeEditar == null){
            return null;
        } else {
            return acervo.editar(curiosidadeEditar, curiosidadeEditada);
        }
    }

    public Curiosidade procurar(int id){
        if (id > 0){
            return acervo.procurar(id);
        }
        return null;
    }

    public List<Curiosidade> listar(){
        return acervo.listar();
    }

    public boolean deletar(int id){
        if(id > 0){
            return acervo.deletar(id);
        }
        return false;
    }

}
