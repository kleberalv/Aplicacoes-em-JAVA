package Produtos;

public class DoCliente extends NotaFiscal{
    
    private String NomeEmpresa;

    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.NomeEmpresa = nomeEmpresa;
    }
    
    public DoCliente(String NomeEmpresa, int numero, String data, Double valorInicial){
    super(numero, data, valorInicial);
    this.NomeEmpresa=NomeEmpresa;   
    }
    
    public Double valorFinal(){
    return valorInicial-(valorInicial*5)/100;
    }
    public String toString(){
        return  "\n ----Nota Fiscal do CLIENTE----"+
                "\n Número: "+getNumero()+
                "\n Data: "+getData()+
                "\n Valor Inicial: "+df.format(getValorInicial());
    }
}
