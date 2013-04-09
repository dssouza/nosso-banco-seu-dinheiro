class Cliente {
    private int id;
    private String nome;
    private String email;
    private String rg;
    private String logradouro;
    private int numero;
    private String cidade;
    private String pais;
    
	public Cliente(int id, String nome, String email, String rg,
			String logradouro, int numero, String cidade, String pais) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.rg = rg;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.pais = pais;
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
    
}
