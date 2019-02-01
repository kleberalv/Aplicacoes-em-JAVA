
package AssociacaoSupermercado;
public class Cliente {
    private String cpf;
    private String nome;
    private int idade;
    private Endereco endereco;
    private Produto produto;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Cliente(String cpf, String nome, int idade, Endereco endereco, Produto produto){
        this.cpf=cpf;
        this.endereco=endereco;
        this.idade=idade;
        this.nome=nome;
        this.produto=produto;
    }
    public String toString(){
        return "\n Nome:" +getNome()+
                "\n CPF:" +getCpf()+
                "\n Idade:" +getIdade()+
                "\n --ENDEREÇO--"+getEndereco()+
                "\n --PRODUTO--" +getProduto();
    }
    
}
