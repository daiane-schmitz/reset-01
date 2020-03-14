package exercicio2;

public class Aluno {

    public final String nome;

    public Aluno(String nome) {
        this.nome = "nome";
    }

    protected void obterNota() {
        System.out.println(10);
    }

    private void montarCola() {
        System.out.println("Cola");
    }

    public String getNome() {
        return nome;
    }
}
