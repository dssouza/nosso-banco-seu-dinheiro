class TesteBanco {
    public static void main(String ... args) {
		Logger.logIt("[Iniciando método main...]");
        
		Banco banco = new Banco(231, "Souza");
        Agencia agencia = new Agencia(7174, "Calçada das Azaléias", banco);
        Endereco endereco = new Endereco("Rua dos Estudantes", 236, "São Paulo", "Brasil");
        Cliente cliente1 = new Cliente(1, "Douglas", "exemplo@exemplo.com",
        		"485321458", endereco, "20/05/2010");
        
        
        Logger.logIt("Criando objeto Conta...");
        Conta conta1 = new Conta(200.0, "1234567",cliente1,agencia,TipoConta.FISICA);
        
        Logger.logIt("Criando objeto ContaPoupanca...");
        ContaPoupanca contaPoupanca = new ContaPoupanca(200.0, "2234568",cliente1,agencia,TipoConta.FISICA, "20/10/2012");  
        
        Logger.logIt("Criando objeto ContaCorrente...");
        ContaCorrente contaCorrente = new ContaCorrente(200.0, "3234569",cliente1,agencia,TipoConta.FISICA);
        
		Logger.logIt("Realizando operações...");
        double valorParaSacar = 10.0;
        
        conta1.saque(valorParaSacar);
        
        contaPoupanca.saque(valorParaSacar);
        contaPoupanca.imprimeDados();
        
        contaCorrente.saque(valorParaSacar);
        contaCorrente.imprimeDados();
        
        
        
        

    }
}
