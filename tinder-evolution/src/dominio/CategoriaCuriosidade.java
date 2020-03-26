package dominio;

public enum CategoriaCuriosidade {

    COMPORTAMENTO("Comportamento"),
    EVENTO("Evento"),
    APARENCIA("Aparência"),
    ALIMENTACAO("Alimentação");

    private String descricao;

    CategoriaCuriosidade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
