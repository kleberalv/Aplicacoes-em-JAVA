package herancaProduto;

public class SaboneteLiquido extends Produto{
    
private int Quantidade;
private String tipoPele;

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getTipoPele() {
        return tipoPele;
    }

    public void setTipoPele(String tipoPele) {
        this.tipoPele = tipoPele;
    }
    
    SaboneteLiquido(String codBarra, String nome, Double Preco, int Quantidade, String tipoPele){
        super(codBarra, nome, Preco);
        this.Quantidade=Quantidade;
        this.tipoPele= tipoPele;
    }
    public String toString(){
        return "-- DADOS SABONETE LIQUIDO --"+
                "\nCodigo de barras: "+getCodBarra()+
                "\nNome: "+getNome()+
                "\nPreço: "+getPreco()+
                "\nQuantidade: "+getQuantidade()+
                "\nTipo de pele: "+getTipoPele()+
                "\n";
    }
    
}

