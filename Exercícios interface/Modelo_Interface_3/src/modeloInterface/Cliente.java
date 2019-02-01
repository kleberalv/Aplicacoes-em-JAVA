package modeloInterface;
public class Cliente extends Pessoa{
    
    private Double horasGastas;
    protected static int qtdPaginaImpressa;
    private Impressao impressao;
    private Internet internet;
    
    public Impressao getImpressao() {
        return impressao;
    }

    public void setImpressao(Impressao impressao) {
        this.impressao = impressao;
    }

    public Internet getInternet() {
        return internet;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }

    public Double getHorasGastas() {
        return horasGastas;
    }

    public void setHorasGastas(Double horasGastas) {
        this.horasGastas = horasGastas;
    }

    public int getQtdPaginaImpressa() {
        return qtdPaginaImpressa;
    }

    public void setQtdPaginaImpressa(int qtdPaginaImpressa) {
        this.qtdPaginaImpressa = qtdPaginaImpressa;
    }
   
    public Cliente(Double horasGastas, int qtdPaginaImpressa, String cpf, String nome, Impressao impressao, Internet internet){
        super(cpf, nome);
        this.impressao=impressao;
        this.internet=internet;
        this.horasGastas=horasGastas;
        this.qtdPaginaImpressa=qtdPaginaImpressa;
    }
    
    @Override
    public String toString(){
        return  "\n ---- Dados para o cliente ----"+
                "\n Nome: "+getNome()+
                "\n CPF: "+getCpf()+
                "\n Horas gastas: "+getHorasGastas()+
                "\n Quantidade de páginas impressas: "+getQtdPaginaImpressa()+
                "\n "+getImpressao()+
                "\n "+getInternet();
    } 
    
    
}
