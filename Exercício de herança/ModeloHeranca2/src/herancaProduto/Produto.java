package herancaProduto;

public class Produto {
    
    private String codBarra;
    private String Nome;
    private Double Preco;

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double preco) {
        this.Preco = preco;
    }
    
    public Produto(String codBarra, String nome, Double Preco){
     this.codBarra= codBarra;
     this.Nome= nome;
     this.Preco= Preco;
    }
    
}
