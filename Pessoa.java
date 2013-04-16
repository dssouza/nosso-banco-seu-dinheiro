
public class Pessoa {
	protected int id;
    protected String nome;
    protected String email;
    protected String rg;
    protected Endereco endereco;
    
    public Pessoa(int id, String nome, String email, String rg, Endereco endereco) {
    	this.id = id;
    	this.nome = nome;
    	this.email = email;
    	this.rg = rg;
    	this.endereco = endereco;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
    
	public void imprimeDados() {
		System.out.println("Cliente [id=" + id + ", nome=" + nome + ", email=" + email
				+ ", rg=" + rg + ", logradouro=" + endereco.getLogradouro() + ", numero="
				+ endereco.getNumero() + ", cidade=" + endereco.getCidade() + ", pais=" + endereco.getPais() + "]");
	}
}
