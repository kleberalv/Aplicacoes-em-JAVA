package ModeloFarmacia;
public class DoCliente extends NotaFiscal{
    
    private String descricao;
    private Double preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
   
    public DoCliente(String descricao, Double preco, int numero){
        super(numero);
        this.descricao=descricao;
        this.preco=preco;
    }
    
    public String toString(){
        return  "\n    ----Dados do cliente ----"+
                "\n Descrição: "+getDescricao()+
                "\n Preço: "+getPreco()+
                "\n Numero: "+getNumero();
    }
    
    
}
