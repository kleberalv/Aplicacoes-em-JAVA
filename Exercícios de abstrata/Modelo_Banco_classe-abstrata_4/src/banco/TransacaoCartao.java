package banco;

public class TransacaoCartao {
    private int numero;
    protected static Double valor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public static Double saldoFuturo(){
        return CartaoCredito.saldoParcial() - valor;
    }
    
    public TransacaoCartao(int numero, Double valor){
        this.numero=numero;
        this.valor=valor;
    }
    
    public String toString(){
        return  "\n ----Dados da transação do cartao ----"+
                "\n Número: "+getNumero()+
                "\n Valor: "+getValor()+
                "\n Saldo no futuro: "+saldoFuturo();
    }    
    
    
    
}
