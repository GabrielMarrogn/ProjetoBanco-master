
public class DadosAgencia  {
    private int numeroAgencia;
    private String nomeGerente;
    private String cnpj;

    
    public int getNumeroAgencia() {
        return numeroAgencia;
    }
    public String getNomeGerente() {
        return nomeGerente;
    }
    public String getCPNJ() {
        return cnpj;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }
    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
    public void setCPNJ(String cnpj) {
        this.cnpj = cnpj;
    }

}
