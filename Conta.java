class Conta {
    String numero;
    double saldo;
    String cliente;
    int numeroAgencia;
    String tipoConta;
    int limite;
    /**
     * @param saldoInicial
     *            Saldo Inicial da conta
     * @param num
     *            Numero da conta
     * @param tit
     *            Titular da conta
     * @param ag
     *            Agencia a qual a conta pertence
     * @param bc
     *            Banco a qual a agencia pertence
     */
    public void inicializaConta(double saldoInicial, String numeroConta, String tit, int agencia) {
        saldo = saldoInicial;
        numero = numeroConta;
        cliente = tit;
        numeroAgencia = agencia;
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
                System.out.println("Saldo insuficiente");
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
        System.out.println(" AGENCIA:" + numeroAgencia);
        System.out.println(" NUMERO : " + numero);
        System.out.println(" TITULAR: " + cliente);
        System.out.println(" SALDO  : R$" + saldo);
        System.out.println("-----------------------------\n");
    }
}
