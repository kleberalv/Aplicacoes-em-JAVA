package Produtos;

import java.text.DecimalFormat;

public abstract class Produto {
    DecimalFormat df = new DecimalFormat("R$: ##.00");
    
    
    private String codBarra;
    private String descricao;
    protected Double preco;
    private Fornecedor fornecedor;
    private Fisica fisica;
    
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }   

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public Produto(String codBarra, String descricao, Double preco, Fornecedor fornecedor, Fisica fisica){
    this.codBarra=codBarra;
    this.descricao=descricao;
    this.preco=preco;
    this.fornecedor=fornecedor;
    this.fisica=fisica;
    }
        
    public abstract Double precoFinal();
    public abstract Double icms();   
    public abstract Double ipi();
    public String toString;
    
}
