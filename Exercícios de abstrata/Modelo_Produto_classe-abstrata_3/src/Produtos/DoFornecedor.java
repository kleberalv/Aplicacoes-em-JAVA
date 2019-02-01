package Produtos;
public class DoFornecedor extends NotaFiscal{
    
  private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public DoFornecedor(String dataValidade,int numero, String data, Double valorInicial){
    super(numero, data, valorInicial); 
    this.dataValidade=dataValidade;
    }
    
    public Double valorFinal(){
        return valorInicial-(valorInicial*7.2)/100;
    }
    
    public String toString(){
        return  "\n ----Nota fiscal do FORNECEDOR----"+
                "\n Numero: "+getNumero()+
                "\n Data: "+getData()+
                "\n Valor Incial: "+df.format(getValorInicial())+
                "\n Valor Final: "+df.format(valorFinal())+
                "\n Data de validade: "+getDataValidade();
    }
    
}
