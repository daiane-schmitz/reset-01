package TemaDeCasa2;

public enum TiposMagiaPoder {

    INDIVIDUAL ("individual"),
    DE_AREA ("de área");

    private String descricao;

    TiposMagiaPoder(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
