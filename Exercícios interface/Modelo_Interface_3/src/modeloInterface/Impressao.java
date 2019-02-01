package modeloInterface;

public class Impressao extends Servico{
    
    private Double valorImpressao;

    public Double getValorImpressao() {
        return valorImpressao;
    }

    public void setValorImpressao(Double valorImpressao) {
        this.valorImpressao = valorImpressao;
    }
    
    public Impressao(Double valorImpressao, String nome){
        super(nome);
        this.valorImpressao=valorImpressao;
    }
       
    @Override
    public Double totalPagar(){
        return (valorImpressao*Cliente.qtdPaginaImpressa);
    }
    
    @Override
    public String toString(){
        return  "\n  ---- Dados Internet ----"+
                "\n Valor da impressão: "+getValorImpressao()+
                "\n Nome: "+getNome()+
                "\n Total a pagar: "+totalPagar();
    }
    
    
}
