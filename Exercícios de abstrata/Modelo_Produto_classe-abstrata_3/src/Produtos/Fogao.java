package Produtos;

public class Fogao extends Produto {
    
    private int qtdChamas;

    public int getQtdChamas() {
        return qtdChamas;
    }

    public void setQtdChamas(int qtdChamas) {
        this.qtdChamas = qtdChamas;
    }
    
    public Fogao(int qtdChamas,String codBarra, String descricao, Double preco, Fornecedor fornecedor, Fisica fisica){
    super(codBarra, descricao, preco, fornecedor, fisica);
    this.qtdChamas=qtdChamas;
    }
    
    @Override
    public Double precoFinal() {
        return preco+icms()+ipi();
    }

    @Override
    public Double icms() {
        return preco-(preco*0.15);
    }

    @Override
    public Double ipi() {
        return preco-((preco*7.2)/100);
    }
    
    @Override
    public String toString(){
        return  "\n ---- Dados Fogão ----"+
                "\n Quantidade de bocas: "+getQtdChamas()+
                "\n Codigo de barras: "+getCodBarra()+
                "\n Descrição: "+getDescricao()+
                "\n Preço inicial: "+df.format(getPreco())+
                "\n Preço final: "+df.format(precoFinal())+ 
                "\n ICMS: "+df.format(icms())+
                "\n IPI: "+df.format(ipi())+
                "\n "+getFornecedor()+
                "\n "+getFisica();
    }

    
}
