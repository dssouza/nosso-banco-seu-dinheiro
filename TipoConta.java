
public enum TipoConta {
    FISICA("Física", "F"),
    JURIDICA("Jurídica", "J");
    
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
