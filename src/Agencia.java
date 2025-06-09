public class Agencia extends DadosAgencia {

    private int numeroConta;
    private Double saldo;
    private Cliente titularConta;

    public int getNumeroConta() {
        return numeroConta;
    }
    public Cliente getTitularConta() {
        return titularConta;
    }
    public double getsaldo(){
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void setTitularConta(Cliente titularConta) {
        this.titularConta = titularConta;
    }

    public Agencia(){
        titularConta = new Cliente();
    }


     public void abriConta(double valor){
        if(valor >0){
            saldo = saldo+ valor;
        }else{
            saldo = 0.0;
            System.out.println("\n" +"valor invalido, abertura da conta acontecera sem nenhum deposito inicial");
        }
    }

    public void depositar(double valorDeposito){
        if(valorDeposito <0){
            System.out.print("\n" +"Valores negativos são invalidos, seu saldo é de agora: R$" +saldo);
        }else {
             saldo = saldo + valorDeposito;
            System.out.print("\n" +"Deposito realizado, seu saldo é de agora: R$" +saldo);
        }
        
    }

    public void sacar (double valorSaque){
        if (saldo > valorSaque && valorSaque >0){
            saldo = saldo - valorSaque;
            System.out.println("\n"+"Saque realizado seu saldo é de: R$" +saldo);
        }
        else {
            System.out.println("\n"+"Saque imposivel");
            System.out.print("Saldo Atual: R$" +saldo);
        }
     
    }

    public String[] printDadosAgencia(int numeroAgencia, String nomeGerente, String cnpj, int numeroConta){
        String numeorAgenciastr = "Numero da agencia: " +Integer.toString(numeroAgencia);
        String nomeGerentestr = "Nome do gerente: " +nomeGerente;
        String cnpjstr= "Numero do cnpj: " +cnpj;
        String numeroContastr = "Numero da sua conta: " +numeroConta;

        String dados[] = {numeorAgenciastr, nomeGerentestr, cnpjstr,numeroContastr};

        return dados;
    }    
}
