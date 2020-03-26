package dominio;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataDeNascimento;
    private String bio;
    private String latitude;
    private String longitude;

    public Usuario(int id, String nome, String email, String telefone, LocalDate dataDeNascimento, String bio, String latitude, String longitude) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Usuário {" +
                "ID = " + id +
                ", nome = '" + nome + '\'' +
                ", e-mail = '" + email + '\'' +
                ", telefone = '" + telefone + '\'' +
                ", data de nascimento = " + dataDeNascimento +
                ", bio = '" + bio + '\'' +
                ", latitude = '" + latitude + '\'' +
                ", longitude= '" + longitude + '\'' +
                '}';
    }
}
