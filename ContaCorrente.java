
public final class ContaCorrente extends Conta {
	private int limite;
	public static double impostoFinanceiro;
	
	{
        this.limite = 500;
		System.out.println("[bloco ini instancia filha ContaCorrente]");
    }
	
	static {
        ContaCorrente.impostoFinanceiro = 0.013d;
		System.out.println("[bloco ini static filha ContaCorrente]");
    }
	
	
	public ContaCorrente(double saldoInicial, String numeroConta, Cliente tit,
			Agencia agencia, TipoConta tipoConta) {
		super(saldoInicial, numeroConta, tit, agencia, tipoConta);
		System.out.println("[construtor 5 parametros classe filha ContaCorrente ]");
	}

	public ContaCorrente(String numero, Cliente cliente, Agencia agencia,
			TipoConta tipoConta) {
		super(numero, cliente, agencia, tipoConta);
		System.out.println("[construtor 4 parametros classe filha ContaCorrente ]");
	}


	/**
     * @param valor
     *            Valor a ser sacado da conta
     */
    public void saque(double valor) {
        System.out.println("Realizando saque de R$ " + valor + " da conta " + numero);
        if (valor > 0) {
            
            if (saldo >= valor) {
                saldo -= valor;
                double valorImposto = valor*impostoFinanceiro;
                saldo -= valorImposto;
                System.out.println("Imposto recolhido da operação: " + valorImposto);
            } else
                Logger.logIt("Saldo insuficiente");
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
    }


	public int getLimite() {
		return limite;
	}


	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	public void imprimeDados() {
        System.out.println("\n----- CONTA CORRENTE ----");
        super.imprimeDados();
        System.out.println(" LIMITE : " + limite);
        
    }
    
}
