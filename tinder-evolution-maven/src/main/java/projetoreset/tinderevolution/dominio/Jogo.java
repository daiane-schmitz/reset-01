package projetoreset.tinderevolution.dominio;

import java.time.LocalDate;

public class Jogo {

    private int id;
    private String nome;
    private String publisher;
    private LocalDate lancamento;
    private CategoriaFilmeJogo categoria;
    private Plataforma plataforma;

    public Jogo(String nome, String publisher, LocalDate lancamento, CategoriaFilmeJogo categoria, Plataforma plataforma) {
        this.nome = nome;
        this.publisher = publisher;
        this.lancamento = lancamento;
        this.categoria = categoria;
        this.plataforma = plataforma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public CategoriaFilmeJogo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaFilmeJogo categoria) {
        this.categoria = categoria;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Jogo {" +
                "ID = " + id +
                ", nome = '" + nome + '\'' +
                ", publisher = '" + publisher + '\'' +
                ", data de lançamento = " + lancamento +
                ", categoria = " + categoria +
                ", plataforma = " + plataforma +
                '}';
    }
}
