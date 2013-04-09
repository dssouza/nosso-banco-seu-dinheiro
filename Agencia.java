class Agencia {
    private int numero;
    private String nome;
    private int numeroBanco;
    
	public Agencia(int numero, String nome, int numeroBanco) {
		this.numero = numero;
		this.nome = nome;
		this.numeroBanco = numeroBanco;
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
	public int getNumeroBanco() {
		return numeroBanco;
	}
	public void setNumeroBanco(int numeroBanco) {
		this.numeroBanco = numeroBanco;
	}
}
