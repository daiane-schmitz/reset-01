package exercicio3;

public class Main {

    public static void main(String[] args) {

        Livro livro1 = new Livro(Categoria.TERROR, "It", "Stephen King", Status.EM_USO );
        Livro livro2 = new Livro(Categoria.SUSPENSE, "Bird Box", "Josh Malerman", Status.DISPONIVEL);


        System.out.println(livro1.categoria.getDescricao() + " - " + livro1.autor + " (" + livro1.autor + "): " + livro1.status);
        System.out.println(livro2.categoria.getDescricao() + " - " + livro2.titulo + " (" + livro2.autor + "): " + livro2.status);

    }
}
