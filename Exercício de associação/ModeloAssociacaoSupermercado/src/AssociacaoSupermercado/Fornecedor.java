
package AssociacaoSupermercado;
public class Fornecedor {
    private String cnpj;
    private String razaoSocial;
    private String telefone;
    private Endereco endereco;

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
    public Fornecedor(String cnpj, String razaoSocial, String telefone, Endereco endereco){
        this.cnpj=cnpj;
        this.endereco=endereco;
        this.razaoSocial=razaoSocial;
        this.telefone=telefone;
        
    }
    public String toString(){
        return "\n CNPJ:" +getCnpj()+
                "\n Razão Social:" +getRazaoSocial()+
                "\n Telefone:" +getTelefone()+
                "\n --ENDEREÇO--" +getEndereco();
    }
    
}
