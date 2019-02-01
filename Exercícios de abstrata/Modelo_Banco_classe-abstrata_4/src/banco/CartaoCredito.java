package banco;

public class CartaoCredito {
    private int numero;
    private String dataCriacao;
    private static Double valorDaCompra;
    private TransacaoCartao transacaoCartao;
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(Double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }
    
    public TransacaoCartao getTransacaoCartao() {
        return transacaoCartao;
    }

    public void setTransacaoCartao(TransacaoCartao transacaoCartao) {
        this.transacaoCartao = transacaoCartao;
    }
    
    public static Double saldoParcial(){
        return Fisica.saldoAtual()-valorDaCompra;
    }
    
    public CartaoCredito(int numero, String DataCriacao, Double valorDaCompra, TransacaoCartao transacaoCartao){
        this.numero=numero;
        this.dataCriacao=DataCriacao;
        this.transacaoCartao=transacaoCartao;
    }
    
    @Override
    public String toString(){
        return  "\n ---- Dados cartão de credito ----"+
                "\n Número: "+getNumero()+
                "\n Data de criação: "+getDataCriacao()+
                "\n Valor da compra: "+getValorDaCompra()+
                "\n "+getTransacaoCartao();
    }
    
    
}
