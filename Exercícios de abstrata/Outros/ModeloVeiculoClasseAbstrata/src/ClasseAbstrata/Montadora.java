
package ClasseAbstrata;
public class Montadora {
    private String cnpj;
    private String nome;
    private Endereco endereco;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpf) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Montadora(String cnpj, String nome, Endereco endereco){
        this.cnpj=cnpj;
        this.endereco=endereco;
        this.nome=nome;
    }
    public String toString(){
        return  "\n Nome:" +getNome()+
                "\n CNPJ:" +getCnpj()+
                "\n Endereço da Montadora" +getEndereco();
                
    }
    
}
