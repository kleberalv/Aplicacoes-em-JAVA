package Produtos;
import java.text.DecimalFormat;

public abstract class NotaFiscal {
    
    DecimalFormat df = new DecimalFormat("R$: ##.00");
    private int numero;
    private String data;
    protected Double valorInicial;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(Double valorInicial) {
        this.valorInicial = valorInicial;
    }
        
    public NotaFiscal(int numero, String data, Double valorInicial){
    this.numero=numero;
    this.data=data; 
    this.valorInicial=valorInicial;
    }
    
    public abstract Double valorFinal();
    public String toString;
    
}
