class Conta {
    protected String numero;
    protected double saldo;
    protected Cliente cliente;
    protected Agencia agencia;
    protected TipoConta tipoConta;
    protected boolean ativa;

    public Conta(double saldoInicial, String numeroConta, Cliente tit, Agencia agencia, TipoConta tipoConta) {
    	this(numeroConta, tit, agencia, tipoConta);
    	this.saldo = saldoInicial;
		System.out.println("[construtor 5 parametros classe pai Conta ]");
	}
 
	public Conta(String numero, Cliente cliente, Agencia agencia,
			TipoConta tipoConta) {
		this.numero = numero;
		this.cliente = cliente;
		this.agencia = agencia;
		this.tipoConta = tipoConta;
		System.out.println("[construtor 4 parametros classe pai Conta]");
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
        System.out.println(" TIPO DE PESSOA : " + tipoConta.getDescricao());
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

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
}
