package herancapessoa;

public class Fornecedor extends Pessoa{
    
    private String cnpj;
    private String pais;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
   public Fornecedor(String Nome, String Endereco, String cnpj, String pais){
     super (Nome, Endereco);
     this.cnpj= cnpj;
     this.pais= pais;
     
    }
   
   public String toString(){ 
       return "\n--- Dados do FORNECEDOR ---"+
               "\nNome: "+getNome()+
               "\nEndereço: "+getEndereco()+
               "\nCNPJ: "+getCnpj()+
               "\nPáis de origem: "+getPais();
       
       
   }
}
