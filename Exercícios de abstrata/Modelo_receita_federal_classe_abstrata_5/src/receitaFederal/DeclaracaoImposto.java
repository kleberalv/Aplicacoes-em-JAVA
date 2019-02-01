package receitaFederal;
public abstract class DeclaracaoImposto {
    
    private int numero;
    private int ano;
    private Double valorDeclarado;
    private Deducao decucao;
    private Pagamento pagamento;
    private Bens bens;

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

    public Deducao getDecucao() {
        return decucao;
    }

    public void setDecucao(Deducao decucao) {
        this.decucao = decucao;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Bens getBens() {
        return bens;
    }

    public void setBens(Bens bens) {
        this.bens = bens;
    }
 
    public abstract Double calculaParcial();
    public abstract Double calculaDesconto();
    public abstract Double calculaImpostoPessoaFisica();
    public abstract Double calculaImpostoPessoaJuridica(); 
    public abstract Double calculaDeducao();
    public abstract Double calculaTaxa();
    public abstract Double calculaTarifacao();


    public DeclaracaoImposto(int numero, int ano, Double valorDeclarado, Deducao deducao, Pagamento pagamento, Bens bens){
        this.numero=numero;
        this.ano=ano;
        this.valorDeclarado=valorDeclarado;
        this.decucao=deducao;
        this.pagamento=pagamento;
        this.bens=bens;
    }
    
    @Override
    public abstract String toString();
   
}
