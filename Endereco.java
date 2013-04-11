
public class Endereco {
	private String logradouro;
    private int numero;
    private String cidade;
    private String pais;
    
	public Endereco(String logradouro, int numero, String cidade, String pais) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.pais = pais;
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
