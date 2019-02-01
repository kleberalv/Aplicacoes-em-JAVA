package curso;

public class Coordenador {
    
 private String nome;
 private String endereco;

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
    
   public Coordenador(String nome, String endereco){
       this.endereco=endereco;
       this.nome=nome;   
   } 
   
      public String toString(){
        return  "\n--Dados coordenador--"+
                "\nNome: "+getNome()+
                "\nEndereço: "+getEndereco();
    }  
}
