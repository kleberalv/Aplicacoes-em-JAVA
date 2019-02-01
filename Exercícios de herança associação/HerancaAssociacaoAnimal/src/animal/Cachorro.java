package animal;

public class Cachorro extends Animal{
    
  private String nome;
  private Fisica fisica;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }  
  
  public Cachorro(int qtdAnos,String nome, Fisica fisica){
      super(qtdAnos);
      this.fisica=fisica;
      this.nome=nome;
      
      
  }
  
  public String toString(){
      return "\n--- DADOS CACHORRO ---"+
              "\nNome do animal: "+getNome()+
             "\nIdade do animal: "+getQtdAnos()+
             "\n "+getFisica();
      
  }

   
}
