
package ModificadorEstatico;
public class ParaPessoaJuridica extends DeclaracaoImposto {
    private String observacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public ParaPessoaJuridica(String observacao,int numero, int ano, Double valorDeclarado, Pagamento pagamento, Bens bens, Deducao deducao){
        super(numero, ano, valorDeclarado, pagamento, bens, deducao);
        this.observacao=observacao;
    }
    public Double calculaParcial(){
        return valorDeclarado+(valor*2)+calculaTarifacao;
    }
    public Double calculaImpostoPessoaJuridica(){
        return calculaParcial()-calculaDeducao()+valor+valorDeclarado;
    }
    public String toString(){
        return "\n Informações da Declaração de Imposto para Pessoa Jurídica" +
                "\n Ano:" +getAno()+
                "\n Número:" +getNumero()+
                "\n Valor Declarado:" +getValorDeclarado()+
                "\n Calculo Parcial:" +calculaParcial()+
                "\n Calculo do Imposto:" +calculaImpostoPessoaJuridica()+
                "\n Observação:" +getObservacao()+
                "\n -Pagamento de Declaração de Imposto para de Pessoa Jurídica-" +getPagamento()+
                "\n -Bens de Declaração de Imposto de Pessoa Jurídica-" +getBens()+
                "\n -Dedução de Declaração de Imposto de Pessoa Jurídica-"+getDeducao();
                
    }
    
}
