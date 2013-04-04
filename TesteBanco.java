class TesteBanco {
    public static void main(String ... args) {
        Banco banco = new Banco();
        banco.numero = 231;
        banco.nome = "Souza";

        Agencia agencia = new Agencia();
        agencia.numero = 7174;
        agencia.nome = "Calçada das Azaleias";
        agencia.numeroBanco = 231;

        Cliente cliente1 = new Cliente();
        cliente1.id = 1;
        cliente1.nome = "Douglas";
        cliente1.email = "doug.umdia@gmail.com";
        cliente1.rg = "485321458";
        cliente1.logradouro = "Rua Bernardino de Campos";
        cliente1.numero = 236;
        cliente1.cidade = "São Paulo";
        cliente1.pais = "Brasil";
        
        Conta conta1 = new Conta();
        conta1.numero = "1234567";
        conta1.cliente = "Douglas";
        conta1.numeroAgencia = 7174;
        conta1.tipoConta = "F";
        conta1.saldo = 200.0;
        conta1.limite = 1000;

        int tamanho = 10;
        Cliente[] clientes = new Cliente[tamanho];
        for (int i = 0; i < tamanho; i++) {
            int posicao = i+1;
            Cliente cliente = new Cliente();
            cliente.id = 1;
            cliente.nome = "Cliente " + posicao;
            cliente.email = "cliente" + posicao + "@cliente.com";
            cliente.logradouro = "Rua Bernardino de Campos";
            cliente.numero = 236;
            cliente.cidade = "São Paulo";
            cliente.pais = "Brasil";
            clientes[i] = cliente;
        }
        
        for (Cliente cli:clientes) {
            System.out.println(cli.nome + " email : " + cli.email);
        }        

        double valorParaSacar = 10.0;
        System.out.println("Saldo Antes " + conta1.saldo);
        conta1.saque(20.0);
        conta1.saque(valorParaSacar);
        System.out.println("Saldo Depois " + conta1.saldo);

    }
}
