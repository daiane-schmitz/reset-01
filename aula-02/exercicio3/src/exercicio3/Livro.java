package exercicio3;

public class Livro {

    Categoria categoria;
    String titulo;
    String autor;
    Status status;

    public Livro(Categoria categoria, String titulo, String autor, Status status) {
        this.categoria = categoria;
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
    }


    @Override
    public String toString() {
        return "Livro{" +
                "categoria=" + categoria +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", status=" + status +
                '}';
    }
}
