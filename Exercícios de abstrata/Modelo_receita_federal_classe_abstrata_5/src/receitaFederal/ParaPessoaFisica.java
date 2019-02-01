package receitaFederal;
public class ParaPessoaFisica extends DeclaracaoImposto {
    private Double multa;
    private Dependente dependente;
    private Pagamento pagamento;
    private Bens bens;
    private Deducao deducao;

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
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
    
    public Double calculaParcial(){
        return (valorDeclarado+valor+calculaTarifacao());
    }
    
    public Double calculaDesconto(){
        return (valorDeclarado-calculaTaxa()-DalculaDeducao());
    }
    
    public Double calculaImpostoPessoaFisica(){
        return (valorDeclarado+calculaParcial()-calculaDesconto());
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
    
    
    public ParaPessoaFisica(Double multa, Dependente dependente, int numero, int ano, Double valorDeclarado, Deducao deducao, Pagamento pagamento, Bens bens){
        super(numero, ano, valorDeclarado, deducao, pagamento, bens);
        this.multa=multa;
        this.dependente=dependente;
    }
    
    @Override
    public String toString(){
        return  "\n ---- Dados para pessoa física ----"+
                "\n Multa: "+getMulta()+
                "\n Calculo parcial: "+calculaParcial()+
                "\n Calculo dos descontos; "+calculaDesconto()+
                "\n Calculo de pessoa física: "+calculaImpostoPessoaFisica()+
                "\n - - - - - - - - - - - - - - - "+
                "\n "+getDependente()+
                "\n - - - - - - - - - - - - - - - "+
                "\n ---- Declaração do imposto de renda ----"+
                "\n Número: "+getNumero()+
                "\n Ano: "+getAno()+
                "\n Valor declarado: "+getValorDeclarado()+
                "\n - - - - - - - - - - - - - - - "+
                "\n "+getDeducao()+
                "\n - - - - - - - - - - - - - - - "+
                "\n "+getPagamento()+
                "\n - - - - - - - - - - - - - - - "+
                "\n "+getBens();
    }
   
}
