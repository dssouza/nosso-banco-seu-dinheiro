class Conta {
    private String numero;
    private double saldo;
    private Cliente cliente;
    private Agencia agencia;
    private String tipoConta;
    private int limite;
	private boolean ativa;
    public static double impostoFinanceiro;
    
	{
        this.limite = 500;
		System.out.println("[bloco ini instancia]");
    }
	
	static {
        Conta.impostoFinanceiro = 0.013d;
		System.out.println("[bloco ini static]");
    }
	
    public Conta(double saldoInicial, String numeroConta, Cliente tit, Agencia agencia, String tipoConta) {
    	this(numeroConta, tit, agencia, tipoConta);
    	this.saldo = saldoInicial;
		System.out.println("[construtor 5 parametros]");
	}
 
	public Conta(String numero, Cliente cliente, Agencia agencia,
			String tipoConta) {
		this.numero = numero;
		this.cliente = cliente;
		this.agencia = agencia;
		this.tipoConta = tipoConta;
		System.out.println("[construtor 4 parametros]");
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

    /**
     * @param valor
     *            Valor a ser depositado na conta
     */
    public void deposito(double valor) {
        System.out.println("Realizando deposito de R$" + valor + " da conta " + numero);
        if (valor >= 0) {
            this.saldo += valor;
        } else
            System.out.println("O valor do deposito deve ser positivo");
    }

    /**
     * Este metodo deve imprimir todos os dados da conta corrente
     */
    public void imprimeDados() {
        System.out.println("\n----------------------------");
        System.out.println(" AGENCIA:" + agencia.getNumero());
        System.out.println(" NUMERO : " + numero);
        System.out.println(" TITULAR: " + cliente);
        System.out.println(" SALDO  : R$" + saldo);
        System.out.println("-----------------------------\n");
    }

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
    
}
