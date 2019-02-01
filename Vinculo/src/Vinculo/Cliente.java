package Vinculo;
public class Cliente {
    
private String nome;
private String endereco;
private String CPF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
      public String toString(){
        return "\nNome: "+nome
                  +"\nEndereço: "+endereco
                      +"\nCPF: "+CPF;    
    }
   
}
