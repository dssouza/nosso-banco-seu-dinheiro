class TesteBanco {
    public static void main(String ... args) {
        Banco banco = new Banco();
        banco.setNumero(231);
        banco.setNome("Souza");

        Agencia agencia = new Agencia();
        agencia.setNumero(7174);
        agencia.setNome("Calçada das Azaleias");
        agencia.setNumeroBanco(231);

        Cliente cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Douglas");
        cliente1.setEmail("doug.umdia@gmail.com");
        cliente1.setRg("485321458");
        cliente1.setLogradouro("Rua Bernardino de Campos");
        cliente1.setNumero(236);
        cliente1.setCidade("São Paulo");
        cliente1.setPais("Brasil");
        
        Conta conta1 = new Conta();
        conta1.setNumero("1234567");
        conta1.setCliente("Douglas");
        conta1.setNumeroAgencia(7174);
        conta1.setTipoConta("F");
        conta1.setSaldo(200.0);
        conta1.setLimite(1000);

        int tamanho = 10;
        Cliente[] clientes = new Cliente[tamanho];
        for (int i = 0; i < tamanho; i++) {
            int posicao = i+1;
            Cliente cliente = new Cliente();
            cliente.setId(1);
            cliente.setNome("Cliente " + posicao);
            cliente.setEmail("cliente" + posicao + "@cliente.com");
            cliente.setLogradouro("Rua Bernardino de Campos");
            cliente.setNumero(236);
            cliente.setCidade("São Paulo");
            cliente.setPais("Brasil");
            clientes[i] = cliente;
        }
        
        for (Cliente cli:clientes) {
            System.out.println(cli.getNome() + " email : " + cli.getEmail());
        }        

        double valorParaSacar = 10.0;
        System.out.println("Saldo Antes " + conta1.getSaldo());
        conta1.saque(20.0);
        conta1.saque(valorParaSacar);
        System.out.println("Saldo Depois " + conta1.getSaldo());

    }
}
