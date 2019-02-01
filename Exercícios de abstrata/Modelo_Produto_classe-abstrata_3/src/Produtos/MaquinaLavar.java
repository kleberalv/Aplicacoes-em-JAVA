package Produtos;

public class MaquinaLavar extends Produto{
    
    private int qtdKg;
    
    public int getQtdKg() {
        return qtdKg;
    }

    public void setQtdKg(int qtdKg) {
        this.qtdKg = qtdKg;
    }


    public MaquinaLavar(int qtdKg, String codBarra, String descricao, Double preco, Fornecedor fornecedor, Fisica fisica){
    super(codBarra, descricao, preco, fornecedor, fisica);
    this.qtdKg=qtdKg;
    }    
    
    @Override
     public Double precoFinal(){
        return preco+ icms()+ipi();
    }
    
    @Override
    public Double icms(){
        return preco-((preco*25)/100);
    }
    
    @Override
    public Double ipi(){
        return preco-((preco*6.75)/100);
    }  
    
    
    @Override
    public String toString(){
        return  "\n ---- Dados Maquina de lavar ----"+ 
                "\n Quantidade em quilos: "+getQtdKg()+
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
