package Produtos;
public class Fornecedor {
    private String cnpj;
    private String nome;
    private DoFornecedor DoFornecedor;
    private Endereco Endereco;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DoFornecedor getDoFornecedor() {
        return DoFornecedor;
    }

    public void setDoFornecedor(DoFornecedor DoFornecedor) {
        this.DoFornecedor = DoFornecedor;
    }
    

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }    
    
    public Fornecedor(String cnpj, String nome, DoFornecedor DoFornecedor, Endereco endereco){
    this.DoFornecedor=DoFornecedor;
    this.Endereco=endereco;
    this.cnpj=cnpj;
    this.nome=nome;
    }
    
    public String toString(){
        return  "\n ----Dados Fornecedor----"+
                "\n Nome: "+getNome()+
                "\n CNPJ: "+getCnpj()+
                getEndereco()+
                getDoFornecedor();
    }        
    
}
