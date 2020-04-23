package projetoreset.tinderevolution.dominio;

import java.time.LocalDate;

public class Filme {

    private int id;
    private String nome;
    private String diretor;
    private LocalDate lancamento;
    private CategoriaFilmeJogo categoria;
    private String sinopse;

    public Filme(String nome, String diretor, LocalDate lancamento, CategoriaFilmeJogo categoria, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.lancamento = lancamento;
        this.categoria = categoria;
        this.sinopse = sinopse;
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

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
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

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Filme {" +
                "ID = " + id +
                ", nome = '" + nome + '\'' +
                ", diretor = '" + diretor + '\'' +
                ", data de lançamento = " + lancamento +
                ", categoria = " + categoria +
                ", sinopse = '" + sinopse + '\'' +
                '}';
    }
}
