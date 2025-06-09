
public class Endereco {
    private String nomeRua;
    private int    numeroDaCasa;
    private String bairro;

    public String getNomeRua() {
        return nomeRua;
    }
    public int getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }
    public void setNumeroDaCasa(int numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String[] printDadosEndereco(String nomeRua, int numeroDaCasa, String bairro){
        String ruastr = "Nome da rua: " +nomeRua;
        String numerodaCasastr = "Numero da casa: " +Integer.toString(numeroDaCasa);
        String bairrostr = "Bairro: " + bairro;

        String dados[] = {ruastr, numerodaCasastr, bairrostr};

        return dados;
        
    }
}
