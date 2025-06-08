import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class AppTest {
    @Test
    public void abriContaPositivo(){
        Agencia agencia = new Agencia();
        agencia.setSaldo(0.0);
        agencia.abriConta(100);

        double value = agencia.getsaldo();
        Assertions.assertEquals(100, value);
    }

    @Test
    public void abriContaNegativo(){
        Agencia agencia = new Agencia();
        agencia.setSaldo(0.0);
        agencia.abriConta(-100);

        double value = agencia.getsaldo();
        Assertions.assertEquals(0, value);
    }

    @Test
    public void depositoPositivo(){
        Agencia agencia = new Agencia();
        agencia.setSaldo(0.0);
        agencia.depositar(100);

        double value = agencia.getsaldo();
        Assertions.assertEquals(100, value);
    }

    @Test
    public void depositoNegativo(){
        Agencia agencia = new Agencia();
        agencia.setSaldo(0.0);
        agencia.depositar(-100);

        double value = agencia.getsaldo();
        Assertions.assertEquals(-100, value);
    }

    @Test
    public void saquePositivoMaior(){
        Agencia agencia = new Agencia();
        agencia.setSaldo(200.0);
        agencia.sacar(100);
        
        double value = agencia.getsaldo();
        Assertions.assertEquals(100, value);
    }

    @Test
    public void saquePositivoMenor(){
        Agencia agencia = new Agencia();
        agencia.setSaldo(100.0);
        agencia.sacar(200);
        
        double value = agencia.getsaldo();
        Assertions.assertEquals(100, value);
    }

     @Test
    public void saqueNegativoMenor(){
        Agencia agencia = new Agencia();
        agencia.setSaldo(100.0);
        agencia.sacar(-200);
        
        double value = agencia.getsaldo();
        Assertions.assertEquals(100, value);
    }
     @Test
    public void saqueNegativoMaior(){
        Agencia agencia = new Agencia();
        agencia.setSaldo(100.0);
        agencia.sacar(-100);
        
        double value = agencia.getsaldo();
        Assertions.assertEquals(100, value);
    }

     @Test
    public void arrayAgencia(){
        Agencia agencia = new Agencia();
        String[] arr1 = agencia.printDadosAgencia(10,"sorriso ronaldo", "123456789",1 );

        String numero = "Numero da agencia: 10";
        String nome = "Nome do gerente: sorriso ronaldo";
        String cnpj = "Numero do cnpj: 123456789";
        String numeroConta = "Numero da sua conta: 1";

        String[] arr2 ={numero,nome,cnpj,numeroConta};

        Assertions.assertArrayEquals(arr1, arr2);
    }

     @Test
    public void arrayCliente(){
        Cliente cliente = new Cliente();
        String[] arr1 = cliente.printDadosCliente("zoio de gato", 20, "123456789");

        String nome = "Nome: zoio de gato";
        String cpf = "Idade: 20";
        String idade = "CPF: 123456789";

        String[] arr2 ={nome,cpf,idade};

        Assertions.assertArrayEquals(arr1, arr2);
    }

    @Test
    public void arrayEndereco(){
        Endereco endereco = new Endereco();
        String[] arr1 = endereco.printDadosEndereco("rua dos bobos", 0, "grand line");
        
        String nomeRua = "Nome da rua: rua dos bobos";
        String numero = "Numero da casa: 0";
        String bairro = "Bairro: grand line";

        String[] arr2 = {nomeRua,numero,bairro};

        Assertions.assertArrayEquals(arr1, arr2);
    }
    
}


