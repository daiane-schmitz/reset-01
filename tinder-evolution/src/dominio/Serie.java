package dominio;

import java.time.LocalDate;

public class Serie {

    private int id;
    private String nome;
    private String diretor;
    private LocalDate dataDeLancamento;
    private int numeroDeTemporadas;
    private int numeroDeEpisodios;
    private CategoriaSerie categoria;
    private String sinopse;

    public Serie(int id, String nome, String diretor, LocalDate dataDeLancamento, int numeroDeTemporadas, int numeroDeEpisodios, CategoriaSerie categoria, String sinopse) {
        this.id = id;
        this.nome = nome;
        this.diretor = diretor;
        this.dataDeLancamento = dataDeLancamento;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.numeroDeEpisodios = numeroDeEpisodios;
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

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
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
                ", número de temporadas = " + numeroDeTemporadas +
                ", número de episódios = " + numeroDeEpisodios +
                ", categoria = " + categoria +
                ", sinopse = '" + sinopse + '\'' +
                '}';
    }
}
