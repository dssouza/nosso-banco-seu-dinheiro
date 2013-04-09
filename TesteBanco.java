class TesteBanco {
    public static void main(String ... args) {
		Logger.logIt("[Iniciando método main...]");
        Banco banco = new Banco(231, "Souza");

        Agencia agencia = new Agencia(7174, "Calçada das Azaléias", 231);

        Cliente cliente1 = new Cliente(1, "Douglas", "doug.umdia@gmail.com",
        		"485321458", "Rua Bernardino de Campos", 236, "São Paulo", "Brasil");
        
        Conta conta1 = new Conta(200.0, "1234567","Douglas",7174,"F");
        

        int tamanho = 10;
        Cliente[] clientes = new Cliente[tamanho];
        for (int i = 0; i < tamanho; i++) {
            int posicao = i+1;
            
            String nomeCliente = "Cliente " + posicao;
            String emailCliente = "cliente" + posicao + "@cliente.com";
            int numeroEstabelecimento = 236+ i;

            Cliente cliente = new Cliente(posicao,nomeCliente, emailCliente, "", "Rua Bernardino de Campos", numeroEstabelecimento, "São Paulo", "Brasil");
            
            clientes[i] = cliente;
        }
        Logger.logIt("Imprimindo Clientes...");
        for (Cliente cli:clientes) {
            System.out.println(cli.getNome() + " email : " + cli.getEmail());
        }        
		Logger.logIt("Realizando operações...");
        double valorParaSacar = 10.0;
        System.out.println("Saldo Antes " + conta1.getSaldo());
        conta1.saque(20.0);
        conta1.saque(valorParaSacar);
        System.out.println("Saldo Depois " + conta1.getSaldo());

    }
}
