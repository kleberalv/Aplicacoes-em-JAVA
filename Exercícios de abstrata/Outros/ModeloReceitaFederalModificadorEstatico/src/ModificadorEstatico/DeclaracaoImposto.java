
package ModificadorEstatico;
public abstract class DeclaracaoImposto {
    private int numero;
    private int ano;
    protected Double valorDeclarado;
    private Bens bens;
    private Pagamento pagamento;
    private Deducao deducao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(Double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public Bens getBens() {
        return bens;
    }

    public void setBens(Bens bens) {
        this.bens = bens;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Deducao getDeducao() {
        return deducao;
    }

    public void setDeducao(Deducao deducao) {
        this.deducao = deducao;
    }
    public DeclaracaoImposto(int numero, int ano, Double valorDeclarado, Pagamento pagamento, Bens bens, Deducao deducao){
        this.ano=ano;
        this.bens=bens;
        this.deducao=deducao;
        this.numero=numero;
        this.valorDeclarado=valorDeclarado;
        this.pagamento=pagamento;
        
    }
    
}
