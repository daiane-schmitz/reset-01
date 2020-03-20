package TemaDeCasa2;

public enum Classe {
    BARBARO ("Bárbaro"),
    CLERIGO ("Clérigo"),
    DRUIDA ("Druida"),
    FEITICEIRO ("Feiticeiro"),
    GUERREIRO ("Guerreiro"),
    MAGO ("Mago");

    private String descricao;

    Classe(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
