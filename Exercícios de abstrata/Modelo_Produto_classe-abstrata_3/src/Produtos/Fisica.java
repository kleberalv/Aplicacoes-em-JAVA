package Produtos;
public class Fisica extends Pessoa{
    private String Cpf;

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
    
    public Fisica(String cpf,String nome, Double altura, Double peso, int anoNasc, int anoAtual, Endereco Endereco){
    super(nome, altura, peso, anoNasc, anoAtual, Endereco); 
    this.Cpf=cpf;
    }
 
    public Double pesoIdeal(){
        return (((altura * altura)*peso)/2);
    }
    
    public int idade(){
        return anoAtual-anoNasc;
    }
    
    public String toString(){
        return  "\n ----Dados pessoa Física----"+
                "\n Nome: "+getNome()+
                "\n Altura: "+getAltura()+  
                "\n Idade: "+idade()+
                "\n Peso: "+df.format(getPeso())+
                "\n Ano de nascimento: "+getAnoNasc()+
                "\n Ano atual: "+getAnoAtual()+
                "\n Peso ideal: "+df.format(pesoIdeal())+
                "\n "+getEndereco();
    }
    
}
