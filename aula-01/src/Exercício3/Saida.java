package Exercício3;

public class Saida {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        String nome = aluno.nome;
        int nota = aluno.nota;

        Comparador comparador = new Comparador();
        boolean statusAluno = comparador.aprovado(8,7);

        System.out.println(nome);
    }



}
