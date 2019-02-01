
package AssociacaoSupermercado;
public class Produto {
    private String codBarra;
    private String descricao;
    private Double preco;
    private Fornecedor fornecedor;

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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public Produto(String codBarra, String descricao, Double preco, Fornecedor fornecedor){
        this.codBarra=codBarra;
        this.descricao=descricao;
        this.fornecedor=fornecedor;
        this.preco=preco;
    }
    public String toString(){
        return "\n Descrição:" +getDescricao()+
                "\n Código de Barras:" +getCodBarra()+
                "\n Preço:" +getPreco()+
                "\n" +
                "\n DADOS DO FORNECEDOR" +getFornecedor();
                
    }
    
}
