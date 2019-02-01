
package ModificadorEstatico;
public class ParaPessoaFisica extends DeclaracaoImposto {
    private Double multa;
    private Dependente dependente;

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }
    public ParaPessoaFisica(Double multa,Dependente dependente,int numero, int ano, Double valorDeclarado, Pagamento pagamento, Bens bens, Deducao deducao){
        super(numero, ano, valorDeclarado, pagamento, bens, deducao);
        this.multa=multa;
        this.dependente=dependente;
    }
    public Double calculaParcial(){
       return valorDeclarado+Bens.valor+Bens.calculaTarifacao(); 
    }
    public Double calculaDesconto(){
        return valorDeclarado-Pagamento.calculaTaxa()-Deducao.calculaDeducao();
    }
    public Double calculaImpostoPessoaFisica(){
        return valorDeclarado +calculaParcial() - calculaDesconto();
    }
    public String toString(){
        return "\n Informações da Declaração de Imposto para Pessoa Física" +
                "\n Ano:" +getAno()+
                "\n Número:" +getNumero()+
                "\n Valor Declarado:" +getValorDeclarado()+
                "\n Calculo Parcial:" +calculaParcial()+
                "\n Calculo do Imposto:" +calculaImpostoPessoaFisica()+
                "\n Desconto:" +calculaDesconto()+
                "\n Multa:" +getMulta()+
                "\n -Informações do Dependente-" +getDependente()+
                "\n -Pagamento de Declaração de Imposto para de Pessoa Física-" +getPagamento()+
                "\n -Bens de Declaração de Imposto de Pessoa Física-" +getBens()+
                "\n -Dedução de Declaração de Imposto de Pessoa Física-"+getDeducao();    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }
}
