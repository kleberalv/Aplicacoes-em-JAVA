package herancaassociacao;

public class Ingresso {
    
  private int numero;
  private Double preco;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
  
    public Ingresso(int numero, Double preco){
        this.numero=numero;
        this.preco=preco;      
        
    }
    
}
