package receitaFederal;
public class ParaPessoaJuridica extends DeclaracaoImposto{
    private String observacao;
    private Dependente dependente;
    private Pagamento pagamento;
    private Bens bens;
    private Deducao deducao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
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

    public Deducao getDeducao() {
        return deducao;
    }

    public void setDeducao(Deducao deducao) {
        this.deducao = deducao;
    }

    public Double calculaDeducao(){
        return 0.0;
    }
    public Double calculaTaxa(){
                return 0.0;
    }
    public Double calculaTarifacao(){
                return 0.0;
    }
    
    public ParaPessoaJuridica(String observacao, Dependente dependente, int numero, int ano, Double valorDeclarado, Deducao deducao, Pagamento pagamento, Bens bens){
        super(numero, ano, valorDeclarado, deducao, pagamento, bens);
        this.observacao=observacao;
        this.dependente=dependente;
    }
    
    

    public String toString(){
        return  "";
    }
    
    
    
}
