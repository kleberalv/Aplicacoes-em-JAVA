
package ModificadorEstatico;
public class Juridica extends Pessoa{
    private String cnpj;
    private ParaPessoaJuridica paraPessoaJuridica;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ParaPessoaJuridica getParaPessoaJuridica() {
        return paraPessoaJuridica;
    }

    public void setParaPessoaJuridica(ParaPessoaJuridica paraPessoaJuridica) {
        this.paraPessoaJuridica = paraPessoaJuridica;
    }
    public Juridica(String cnpj, ParaPessoaJuridica paraPessoaJuridica, String nome, Endereco endereco){
        super(nome, endereco);
        this.cnpj=cnpj;
        this.paraPessoaJuridica=paraPessoaJuridica;
        
    }
    public String toString(){
        return "\n Informações da Pessoa Jurídica"+
                "\n Nome:"+getNome()+
                "\n CNPJ:" +getCnpj()+
                "\n -Endereço-" +getEndereco()+
                "\n " +getParaPessoaJuridica();
    }
    
}
