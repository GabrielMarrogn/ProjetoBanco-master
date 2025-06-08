public class Cliente  {
    private String nome;
    private int idade;
    private String CPF;
    private Endereco endereco;
    private Agencia dadosAgencia;

    //Getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getCPF() {
        return CPF;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public Agencia getDadosAgencia() {
        return dadosAgencia;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setDadosAgencia(Agencia dadosAgencia) {
        this.dadosAgencia = dadosAgencia;
    }

    public String[] printDadosCliente(String nome, int idade, String cpf){
    String nomestr = "Nome: " +nome;
    String idadestr = "Idade: " +Integer.toString(idade);
    String cpfstr = "CPF: "+cpf;

    String[] dados = {nomestr,idadestr, cpfstr};
    
    return dados;
}
}
