package HerancaAssociacao;

public class Fisica extends Pessoa{
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   public Fisica(String nome, Endereco endereco, String cpf){
       super(nome, endereco);
       this.cpf=cpf;           
   } 
   
   public String toString(){
       return "\n ----- Dados da pessoa física: -----"+
               "\nCPF: "+getCpf()+
               "\nNome: "+getNome()+
               "\nDados do endereço da pessoa física: "+getEndereco();
       
   }
}
