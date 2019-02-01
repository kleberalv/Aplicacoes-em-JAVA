
package AssociacaoSupermercado;
public class Supermercado {
    private String cnpj;
    private String razaoSocial;
    private String telefone;
    private Endereco endereco;
    private Produto produto;
    private Cliente cliente;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Supermercado(String cnpj, String razaoSocial, String telefone, Endereco endereco, Cliente cliente, Produto produto ){
        this.cliente=cliente;
        this.cnpj=cnpj;
        this.endereco=endereco;
        this.produto=produto;
        this.razaoSocial=razaoSocial;
        this.telefone=telefone;
    }
    public String toString(){
        return "DADOS DO SUPERMERCADO"+
                "\n Razão Social:" +getRazaoSocial()+
                "\n CNPJ:" +getCnpj()+
                "\n Telefone:" +getTelefone()+
                "\n -- ENDEREÇO--" +getEndereco()+
                "\n --DADOS DO CLIENTE--" +getCliente()+
                "\n --DADOS DO PRODUTO--" +getProduto();
    }
    
}
