package dominio;

import java.time.LocalDate;

public class Serie {

    private int id;
    private String nome;
    private String diretor;
    private LocalDate dataDeLancamento;
    private int numeroTemporadas;
    private int numeroEpisodios;
    private CategoriaSerie categoria;
    private String sinopse;

    public Serie(String nome, String diretor, LocalDate dataDeLancamento, int numeroTemporadas, int numeroEpisodios, CategoriaSerie categoria, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.dataDeLancamento = dataDeLancamento;
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

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
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
                ", data de lançamento = " + dataDeLancamento +
                ", número de temporadas = " + numeroTemporadas +
                ", número de episódios = " + numeroEpisodios +
                ", categoria = " + categoria +
                ", sinopse = '" + sinopse + '\'' +
                '}';
    }
}
