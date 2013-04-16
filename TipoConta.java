
public enum TipoConta {
    FISICA("F�sica", "F"),
    JURIDICA("Jur�dica", "J");
    
    private String descricao;
    private String tipo;

    TipoConta(String descricao, String tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getTipo() {
        return tipo;
    }
}
