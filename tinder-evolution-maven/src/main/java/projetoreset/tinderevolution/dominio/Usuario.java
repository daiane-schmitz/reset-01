package projetoreset.tinderevolution.dominio;


import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String bio;
    private Double latitude;
    private Double longitude;
    private String linkFoto;

    private List<Musica> musicasCurtidas = new ArrayList<>();
    private List<Filme> filmesCurtidos = new ArrayList<>();
    private List<Serie> seriesCurtidas = new ArrayList<>();
    private List<Jogo> jogosCurtidos = new ArrayList<>();
    private List<Esporte> esportesCurtidos = new ArrayList<>();
    private List<Curiosidade> curiosidades = new ArrayList<>();


    public Usuario(String nome, String email, String telefone, LocalDate dataNascimento, String bio, Double latitude, Double longitude, String linkFoto) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;
        this.linkFoto = linkFoto;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getLinkFoto() {
        return linkFoto;
    }

    public void setLinkFoto(String linkFoto) {
        this.linkFoto = linkFoto;
    }

    public List<Musica> getMusicasCurtidas() {
        return musicasCurtidas;
    }

    public void likeMusica(Musica musica) {
        musicasCurtidas.add(musica);
    }

    public void dislikeMusica(Musica musica){
        musicasCurtidas.remove(musica);
    }

    public List<Filme> getFilmesCurtidos() {
        return filmesCurtidos;
    }

    public void likeFilme(Filme filme) {
        filmesCurtidos.add(filme);
    }

    public void dislikeFilme(Filme filme){
        filmesCurtidos.remove(filme);
    }

    public List<Serie> getSeriesCurtidas() {
        return seriesCurtidas;
    }

    public void likeSerie(Serie serie) {
        seriesCurtidas.add(serie);
    }

    public void dislikeSerie(Serie Serie){
        seriesCurtidas.remove(Serie);
    }

    public List<Jogo> getJogosCurtidos() {
        return jogosCurtidos;
    }

    public void likeJogo(Jogo jogo) {
        jogosCurtidos.add(jogo);
    }

    public void dislikeJogo(Jogo jogo){
        jogosCurtidos.remove(jogo);
    }

    public List<Esporte> getEsportesCurtidos() {
        return esportesCurtidos;
    }

    public void likeEsporte(Esporte esporte) {
        esportesCurtidos.add(esporte);
    }

    public void dislikeEsporte(Esporte esporte){
        esportesCurtidos.remove(esporte);
    }

    public List<Curiosidade> getCuriosidades() {
        return curiosidades;
    }

    public void adicionarCuriosidade(Curiosidade curiosidade) {
        curiosidades.add(curiosidade);
    }

    public void removerCuriosidade(Curiosidade curiosidade){
        curiosidades.remove(curiosidade);
    }


    public int calcularIdade (LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = dataNascimento;
        Period period = Period.between(nascimento, hoje);
        int idadeUsuario = period.getYears();
        return idadeUsuario;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "ID = " + id +
                ", nome = '" + nome + '\'' +
                ", e-mail = '" + email + '\'' +
                ", telefone = '" + telefone + '\'' +
                ", data de nascimento = " + dataNascimento +
                ", bio = '" + bio + '\'' +
                ", localização = '" + latitude + "," + longitude +
                ", link da foto = '" + linkFoto + '\'' +
                ", músicas curtidas = " + musicasCurtidas +
                ", filmes curtidos = " + filmesCurtidos +
                ", séries curtidas = " + seriesCurtidas +
                ", jogos curtidos = " + jogosCurtidos +
                ", esportes curtidos = " + esportesCurtidos +
                ", curiosidades = " + curiosidades +
                '}';
    }


}