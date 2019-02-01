package modeloInterface;
public class Equipamento {
    
    private String marca;
    private String configuracao;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }
    
    public Equipamento(String marca, String configuracao){
        this.marca=marca;
        this.configuracao=configuracao;
    }
    
    public String toString(){
        return  "\n ---- Dados do eqipamento ----"+
                "\n Marca: "+getMarca()+
                "\n Configuração: "+getConfiguracao();
    }
    
}
