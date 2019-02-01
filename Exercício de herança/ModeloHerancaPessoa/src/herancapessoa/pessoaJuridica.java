package herancapessoa;

public class pessoaJuridica extends Cliente{
    
private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public pessoaJuridica(String Nome, String Endereco, int idade, String cnpj){
        super(Nome, Endereco, idade);
        this.cnpj= cnpj;
}
    
 public String toString(){
      return "--\n Dados do cliente de pessoa JURIDICA: --"+
         "\nNome: "+getNome()+
         "\nEndereço: "+getEndereco()+
         "\nIdade: "+getIdade()+
         "\nCPF: "+getCnpj();   
    
 }   
    
}
