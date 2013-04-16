class Cliente extends Pessoa {
    private String dataCadastro;
    
	public Cliente(int id, String nome, String email, String rg, Endereco endereco, String dataCadastro) {
		super(id, nome, email, rg, endereco);
		this.dataCadastro = dataCadastro;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
}
