package herancaassociacao;

public class Produto {
    
    private String codBarra;
    private String descricao;
    private Double preco;

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
    
    public Produto(String codBarra, String descricao, Double preco){
        this.codBarra=codBarra;
        this.descricao=descricao;
        this.preco=preco;      
        
    }
    
}
