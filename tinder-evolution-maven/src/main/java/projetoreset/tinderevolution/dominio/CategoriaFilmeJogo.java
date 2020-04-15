package projetoreset.tinderevolution.dominio;

public enum CategoriaFilmeJogo {

    ACAO("Ação"),
    COMEDIA("Comédia"),
    DRAMA("Drama"),
    MUSICAL("Musical"),
    SUSPENSE("Suspense"),
    TERROR("Terror");

    private String descricao;

    CategoriaFilmeJogo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
