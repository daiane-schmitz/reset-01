package dominio;
;
import java.time.LocalDate;


public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataDeNascimento;
    private String bio;
    private String latitude;
    private String longitude;
    private Musica musica;
    private Filme filme;
    private Serie serie;
    private Jogo jogo;
    private Esporte esporte;
    private Curiosidade curiosidade;

    public Usuario(String nome, String email, String telefone, LocalDate dataDeNascimento, String bio, String latitude, String longitude, Musica musica, Filme filme, Serie serie, Jogo jogo, Esporte esporte, Curiosidade curiosidade) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;
        this.musica = musica;
        this.filme = filme;
        this.serie = serie;
        this.jogo = jogo;
        this.esporte = esporte;
        this.curiosidade = curiosidade;
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

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Esporte getEsporte() {
        return esporte;
    }

    public void setEsporte(Esporte esporte) {
        this.esporte = esporte;
    }

    public Curiosidade getCuriosidade() {
        return curiosidade;
    }

    public void setCuriosidade(Curiosidade curiosidade) {
        this.curiosidade = curiosidade;
    }

    @Override
    public String toString() {
        return "Usuário {" +
                "ID = " + id +
                ", nome = '" + nome + '\'' +
                ", e-mail = '" + email + '\'' +
                ", telefone = '" + telefone + '\'' +
                ", data de nascimento = " + dataDeNascimento +
                ", bio = '" + bio + '\'' +
                ", Localização - latitude = '" + latitude + '\'' +
                ", Localização - longitude = '" + longitude + '\'' +
                ", músicas = " + musica +
                ", filmes = " + filme +
                ", séries = " + serie +
                ", jogos = " + jogo +
                ", esportes = " + esporte +
                ", curiosidades = " + curiosidade +
                '}';
    }
}
