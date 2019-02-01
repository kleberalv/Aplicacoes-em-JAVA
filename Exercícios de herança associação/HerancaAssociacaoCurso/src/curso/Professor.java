package curso;

public class Professor {
    
private String matr;
private String nome;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
  public Professor(String matr, String nome){
      
   this.matr=matr;
   this.nome=nome;
      
  }  
  
      public String toString(){
        return  "\n--Dados do professor--"+
                "\nMatricula: "+getMatr()+
                "\nNome: "+getNome();
    }
}
