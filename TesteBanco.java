class TesteBanco {
    public static void main(String ... args) {
		Logger.logIt("[Iniciando m�todo main...]");
        
		Banco banco = new Banco(231, "Souza");
        Agencia agencia = new Agencia(7174, "Cal�ada das Azal�ias", banco);
        Endereco endereco = new Endereco("Rua Bernardino de Campos", 236, "S�o Paulo", "Brasil");
        Cliente cliente1 = new Cliente(1, "Douglas", "doug.umdia@gmail.com",
        		"485321458", endereco);
        Conta conta1 = new Conta(200.0, "1234567",cliente1,agencia,"F");
        
             
		Logger.logIt("Realizando opera��es...");
        double valorParaSacar = 10.0;
        System.out.println("Saldo Antes " + conta1.getSaldo());
        conta1.saque(20.0);
        conta1.saque(valorParaSacar);
        System.out.println("Saldo Depois " + conta1.getSaldo());

    }
}
