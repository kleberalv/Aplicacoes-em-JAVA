package herancaProduto;

public class CarneFrango extends Produto{
    private String dataValidade;
    private Double peso;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public CarneFrango(String codBarra, String nome, Double preco, String dataValidade, Double peso){
    super (codBarra, nome, preco);
    this.dataValidade=dataValidade;
    this.peso=peso;
     
    }
    
    public String toString(){
        return "-- Dados CARNE E FRANGO --"+
                "\nCodigo de barras: "+getCodBarra()+
                "\nNome: "+getNome()+
                "\nPreço: "+getPreco()+
                "\nData de validade: "+getDataValidade()+
                "\nPeso: "+getPeso()+
                "\n";
        
    }
    
    
}
