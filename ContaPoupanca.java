
public final class ContaPoupanca extends Conta {
	private String dataAniversario;

	public ContaPoupanca(double saldoInicial, String numeroConta, Cliente tit,
			Agencia agencia, TipoConta tipoConta, String dataAniversario) {
		super(saldoInicial, numeroConta, tit, agencia, tipoConta);
		this.dataAniversario = dataAniversario;
		System.out.println("[construtor 6 parametros classe filha ContaPoupanca ]");
	}
	
	public ContaPoupanca(String numero, Cliente cliente, Agencia agencia,
			TipoConta tipoConta, String dataAniversario) {
		super(numero, cliente, agencia, tipoConta);
		this.dataAniversario = dataAniversario;
		System.out.println("[construtor 5 parametros classe filha ContaPoupanca ]");
	}


	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	
	public void imprimeDados() {
        System.out.println("\n----- CONTA POUPANÇA ----");
        super.imprimeDados();
        System.out.println(" ANIVERSÁRIO : " + dataAniversario);
    }
	
}
