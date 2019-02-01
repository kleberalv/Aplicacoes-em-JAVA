package herancaassociacao;

public class Stand {
    
    private int numero;
    private String nome;
    private Produto produto;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Stand(int numero, String nome, Produto produto){
        this.nome=nome;
        this.numero=numero;
        this.produto=produto;      
    }
    
}
