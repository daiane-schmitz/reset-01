package projetoreset.tinderevolution.dominio;


import java.time.LocalDate;
import java.time.Period;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataDeNascimento;
    private String bio;
    private Double latitude;
    private Double longitude;

    public Usuario(String nome, String email, String telefone, LocalDate dataDeNascimento, String bio, Double latitude, Double longitude) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;

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


    public int calcularIdade (LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = dataNascimento;
        Period period = Period.between(nascimento, hoje);
        int idadeUsuario = period.getYears();
        return idadeUsuario;
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
                ", localização = '" + latitude + "," + longitude +
                '}';
    }
}