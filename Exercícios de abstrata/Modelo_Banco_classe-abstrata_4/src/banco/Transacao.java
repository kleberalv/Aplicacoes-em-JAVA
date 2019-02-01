package banco;

public class Transacao {
    
    private String tipo;
    private Double valorTransacao;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(Double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }
    
    public Transacao(String tipo, Double valorTransacao){
        this.tipo=tipo;
        this.valorTransacao=valorTransacao;       
    }
    
    public String toString(){
        return  "\n ----Dados da transação ----"+
                "\n Tipo: "+getTipo()+
                "\n Valor da transação: "+getValorTransacao();
    }
    
}
