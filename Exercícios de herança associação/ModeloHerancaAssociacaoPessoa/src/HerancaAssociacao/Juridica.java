package HerancaAssociacao;

public class Juridica extends Pessoa {
    
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Juridica(String nome, Endereco endereco, String cnpj){
        super(nome, endereco);
        this.cnpj=cnpj;
   
    }
    
    public String toString(){
        return "\n ----- Dados da pessoa Jurídica: -----"+
                "\nCNPJ: "+getCnpj()+
                "\nNome: "+getNome()+
                "\nEndereço: "+getEndereco();

    }
    
}
