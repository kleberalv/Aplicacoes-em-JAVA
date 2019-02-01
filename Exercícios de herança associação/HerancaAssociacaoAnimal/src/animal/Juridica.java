package animal;

public class Juridica extends Pessoa{
    
  private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public Juridica(String nome, String cnpj, Telefone telefone){
        super(nome, telefone);
        this.cnpj=cnpj;
        
    }
    
    public String toString(){
        return  "\n--- DADOS PESSOA JURÍDICA ---"+
                "\nNome: "+getNome()+
                "\nTelefone: "+getTelefone()+
                "\nCNPJ: "+getCnpj();
    }
    
}
