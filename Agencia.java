class Agencia {
    private int numero;
    private String nome;
    private Banco banco;
    
	public Agencia(int numero, String nome, Banco banco) {
		this.numero = numero;
		this.nome = nome;
		this.banco = banco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
}
