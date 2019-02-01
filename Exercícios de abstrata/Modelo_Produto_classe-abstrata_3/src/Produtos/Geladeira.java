package Produtos;

public class Geladeira extends Produto{
    
    private String marca;
    private int qtdPorta;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdPorta() {
        return qtdPorta;
    }

    public void setQtdPorta(int qtdPorta) {
        this.qtdPorta = qtdPorta;
    }
    
    public Geladeira(String marca, int qtdPorta, String codBarra, String descricao, Double preco, Fornecedor fornecedor, Fisica fisica){
    super(codBarra, descricao, preco, fornecedor, fisica);    
    this.marca=marca;
    this.qtdPorta=qtdPorta;
    }
    
    @Override
    public Double precoFinal(){
        return preco+ icms()+ipi();
    }
    
    @Override
    public Double icms(){
        return preco-((preco*5.5)/100);
    }
    
    @Override
    public Double ipi(){
        return preco-(preco*0.10);
    }
    
    
    @Override
    public String toString(){
        return  "\n ---- Dados Geladeira ----"+
                "\n Marca: "+getMarca()+
                "\n Quantidade de portas: "+getQtdPorta()+
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
