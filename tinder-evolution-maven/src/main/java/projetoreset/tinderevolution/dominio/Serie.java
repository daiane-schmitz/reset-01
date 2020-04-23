package projetoreset.tinderevolution.dominio;

import java.time.LocalDate;

public class Serie {

    private int id;
    private String nome;
    private String diretor;
    private LocalDate lancamento;
    private int numeroTemporadas;
    private int numeroEpisodios;
    private CategoriaSerie categoria;
    private String sinopse;

    public Serie(String nome, String diretor, LocalDate lancamento, int numeroTemporadas, int numeroEpisodios, CategoriaSerie categoria, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.lancamento = lancamento;
        this.numeroTemporadas = numeroTemporadas;
        this.numeroEpisodios = numeroEpisodios;
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

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public CategoriaSerie getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaSerie categoria) {
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
        return "Série {" +
                "ID = " + id +
                ", nome = '" + nome + '\'' +
                ", diretor = '" + diretor + '\'' +
                ", data de lançamento = " + lancamento +
                ", número de temporadas = " + numeroTemporadas +
                ", número de episódios = " + numeroEpisodios +
                ", categoria = " + categoria +
                ", sinopse = '" + sinopse + '\'' +
                '}';
    }
}
