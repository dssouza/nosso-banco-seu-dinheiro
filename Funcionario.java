
public class Funcionario extends Pessoa {
	
    private String carteiraProfissional;
    private String dataAdmissao;

    public Funcionario(int id, String nome, String email, String rg, Endereco endereco, String carteiraProfissional, String dataAdmissao) {
    	super(id, nome, email, rg, endereco);
    	this.carteiraProfissional = carteiraProfissional;
    	this.dataAdmissao = dataAdmissao;
    }
    public void setCarteiraProfissional(String numeroCarteira) {
        this.carteiraProfissional = numeroCarteira;
    }
    public String getCarteiraProfissional() {
        return carteiraProfissional;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public String getDataAdmissao() {
        return dataAdmissao;
    }

}
