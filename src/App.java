import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Agencia agencia = new Agencia();
        Endereco endereco = new Endereco();

        // Os dados da agencia já estão cadrastrados
        agencia.setNumeroAgencia(666);
        agencia.setCPNJ("12345678000199");
        agencia.setNomeGerente("Lucas Silva e Silva");
        agencia.setNumeroConta(12345678);
        agencia.setTitularConta(cliente);
        agencia.setSaldo(0.0);

        // Construindo uma pequena interface para casdatra dados
        System.out.println("Bem vindo");
        System.out.println("Por favor se cardastre para poder usar nossos servisos" + "\n");

        System.out.println("Insira seu nome:");
        cliente.setNome(sc.nextLine());

        System.out.println("Insira sua idade");
        cliente.setIdade(sc.nextInt());

        System.out.println("Insira CPF");
        cliente.setCPF(sc.next());

        System.out.println("Quanto deseja depositar para abrir sua conta:");
        agencia.abriConta(sc.nextDouble());

        cliente.setDadosAgencia(agencia);

        System.out.println("\n" + "Cadastre um endereco.");

        System.out.println("Insira o nome da rua");
        endereco.setNomeRua(sc.next());

        System.out.println("Insira o numero da casa");
        endereco.setNumeroDaCasa(sc.nextInt());

        System.out.println("Insira o nome do bairro");
        endereco.setBairro(sc.next());

        int operacao = 0;

        
        //Um loop while usado para criar a interface que irar aparecer no termial
        while (operacao != 6) {
            System.out.println("\n" + "Por favor selecione sua ação" + "\n");
            System.out.println("1- Para checar Saldo");
            System.out.println("2- Para Depositar");
            System.out.println("3- Para Sacar");
            System.out.println("4- Para ver dados da agencia");
            System.out.println("5- Para ver seus dados");
            System.out.println("6- Para encerar as operações" + "\n");
            operacao = sc.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("\n" + "Seu saldo é e: R$" + agencia.getsaldo());
                    break;

                case 2:
                    System.out.println("\n" + "Por favor insira o valor depositado");
                    double Valordepositado = sc.nextDouble();
                    agencia.depositar(Valordepositado);
                    break;

                case 3:
                    System.out.println("\n" + "por favor insira o valor a ser sacado:");
                    double valorSacado = sc.nextDouble();
                    agencia.sacar(valorSacado);
                    break;

                case 4:
                    String[] arrAgencia = agencia.printDadosAgencia(agencia.getNumeroAgencia(),
                            agencia.getNomeGerente(),
                            agencia.getCPNJ(),
                            agencia.getNumeroConta());

                    for (String s : arrAgencia) {
                        System.out.println(s);
                    }
                    break;

                case 5:
                    String[] arrCliente = cliente.printDadosCliente(cliente.getNome(), cliente.getIdade(),
                            cliente.getCPF());
                    String[] arrEndereco = endereco.printDadosEndereco(endereco.getNomeRua(),
                            endereco.getNumeroDaCasa(),
                            endereco.getBairro());

                    for (String s : arrCliente) {
                        System.out.println(s);
                    }

                    for (String s : arrEndereco) {
                        System.out.println(s);
                    }

                    break;

                case 6:
                    System.out.println("Obrigado por usar nossos Servisos " + cliente.getNome());
                    break;

                default:
                    System.out.println("Numero invalido, por favor digite um numero valido");
            }
        }
        sc.close();
    }

}
