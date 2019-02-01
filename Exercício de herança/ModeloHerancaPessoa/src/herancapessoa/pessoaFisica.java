package herancapessoa;

public class pessoaFisica extends Cliente{
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public pessoaFisica(String Nome, String Endereco, int idade, String cpf){
    
    super(Nome, Endereco, idade);
    this.cpf= cpf;        
    }
    
public String toString(){
    
 return "--\n Dados do cliente de pessoa FÍSICA: --"+
         "\nNome: "+getNome()+
         "\nEndereço: "+getEndereco()+
         "\nIdade: "+getIdade()+
         "\nCPF: "+getCpf();   
    
}    
    
}
